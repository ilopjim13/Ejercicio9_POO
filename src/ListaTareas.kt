
class ListaTareas {
    val lista = mutableListOf<Tarea>()

    fun agregarTarea(ident:String, desc:String, estado:String) {
        if (lista.find {  it == Tarea(ident, desc, estado) } == null) {
            lista.add(Tarea(ident, desc, estado))
        } else println("Esta tarea ya está introducida.")
    }

    fun eliminarTarea(ident: String) {
        if (lista.find {  it.ident == ident} != null) {
            lista.remove(lista.find { it.ident == ident })
        } else println("Tarea no encontrada, no se ha podido eliminar.")
    }

    fun modificarEstado(ident: String) {
        lista.forEach {
            if (it.ident == ident) {
                if (it.estado == "pendiente") {
                    it.estado = "realizada"
                } else it.estado = "pendiente"
            } else println("Tarea no encontrada, no se ha podido modificar el estado.")
        }
    }


    fun mostrarTareas() {
        lista.forEach { println(it)}
    }

    fun mostrarPendientes() {
        lista.forEach { if (it.estado == "pendiente") { println(it)} }
    }

    fun mostrarRealizadas() {
        lista.forEach { if (it.estado == "realizada") { println(it)} }
    }


}