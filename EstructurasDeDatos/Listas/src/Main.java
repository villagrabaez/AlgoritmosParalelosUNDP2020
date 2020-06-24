public class Main {
  public static void main(String[] args){
    /**
     * Lista enlazada simple
     */
//      ListaEnlazada listaEnlazada = new ListaEnlazada();
//      listaEnlazada.agregarAlInicio(1);
//      listaEnlazada.agregarAlInicio(2);
//      listaEnlazada.agregarAlInicio(3);
//      listaEnlazada.agregarAlInicio(4);
//      listaEnlazada.agregerAlFinal(5);
//      listaEnlazada.eliminarNodo(4);
//      listaEnlazada.verListaCompleta();

    /**
     * Lista enlazada simple ordenada
     */

//      ListaEnlazadaOrdenada listaEnlazadaOrdenada = new ListaEnlazadaOrdenada();
//      listaEnlazadaOrdenada.insertarOrden(1);
//      listaEnlazadaOrdenada.insertarOrden(4);
//      listaEnlazadaOrdenada.insertarOrden(2);
//      listaEnlazadaOrdenada.insertarOrden(3);
//      listaEnlazadaOrdenada.insertarOrden(5);
//      listaEnlazadaOrdenada.buscarNodo(4);
//      listaEnlazadaOrdenada.verListaCompleta();

    /**
     * Lista doblemente enlazada
     */

//      ListaEnlazadaDoble listaEnlazadaDoble = new ListaEnlazadaDoble();
//      listaEnlazadaDoble.agregar(1);
//      listaEnlazadaDoble.agregar(2);
//      listaEnlazadaDoble.agregar(3);
//      listaEnlazadaDoble.agregar(4);
//      listaEnlazadaDoble.agregarInicio(5);
//      listaEnlazadaDoble.eliminar();
//      listaEnlazadaDoble.eliminarInicio();
//      listaEnlazadaDoble.verLista();

      /**
       * Lista doblemente enlazada
       */
      ListaEnlazadaDobleCircular listaEnlazadaDobleCircular = new ListaEnlazadaDobleCircular();
      listaEnlazadaDobleCircular.agregar(1);
      listaEnlazadaDobleCircular.agregar(2);
      listaEnlazadaDobleCircular.agregar(5);
      listaEnlazadaDobleCircular.eliminar(2);
      listaEnlazadaDobleCircular.listarNodo();
  }
}
