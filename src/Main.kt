

 fun main() {

  val tareas = ListaTareas()
  val menu = Menu()
  var opcion = 0

  while (true) {
    menu.mostrarMenu()
    opcion = readln().toInt()
    menu.ejecutarMenu(opcion, tareas)
  }
}