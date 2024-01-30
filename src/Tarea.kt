import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Tarea(val ident:String = (0..100).random().toString(), val desc:String, var estado:String = "pendiente") {


    override fun toString(): String {
        return "${this.ident}: ${desc}, estado: ${estadoFormateado()}"
    }

    fun estadoFormateado(): String{
        val fechaHoraActual: LocalDateTime = LocalDateTime.now()
        // Formatear la fecha y hora para imprimir
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
        val fechaFormateada: String = fechaHoraActual.format(formatter)
        if (this.estado == "realizada") return "realizada el $fechaFormateada"
        else return "sigue pendiente."
    }

}