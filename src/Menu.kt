import kotlin.system.exitProcess

class Menu {

    fun mostrarMenu() {
        println("***MENÚ***\n")
        println("1. Agregar Tarea")
        println("2. Eliminar Tarea")
        println("3. Modificar Estado")
        println("4. Mostrar todas las tareas")
        println("5. Mostrar las tareas pendientes")
        println("6. Mostrar las tareas realizadas")
        println("7. Salir\n")
        print(">>> ")
    }

    fun ejecutarMenu(opcion:Int, listaTareas: ListaTareas) {

        when (opcion) {
            1 -> {
                print("Introduce el nombre: ")
                val titu = readln()
                print("Introduce la descripción: ")
                val desc = readln()
                print("Introduce el estado: ")
                val estado = readln()
                listaTareas.agregarTarea(titu, desc, estado)
            }
            2 -> {
                print("Introduce el nombre de la tarea a eliminar: ")
                val titu = readln()
                listaTareas.eliminarTarea(titu)
            }
            3 -> {
                print("Introduce el nombre de la tarea a eliminar: ")
                val titu = readln()
                listaTareas.modificarEstado(titu)
            }
            4 -> listaTareas.mostrarTareas()
            5 -> listaTareas.mostrarPendientes()
            6 -> listaTareas.mostrarRealizadas()
            7 -> {
                println("Lista de tareas terminada.")
                exitProcess(0)
            }
            else -> println("Opción introducido no válido.")
        }
    }
}