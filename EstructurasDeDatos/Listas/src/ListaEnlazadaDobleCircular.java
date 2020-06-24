public class ListaEnlazadaDobleCircular {
  NodoDobleCircular primero;
  NodoDobleCircular ultimo;

  public ListaEnlazadaDobleCircular()
  {
    this.primero = null;
    this.ultimo = null;
  }

  public void agregar(int dato)
  {
    NodoDobleCircular nuevo = new NodoDobleCircular(dato);
    if (primero == null) {
      primero = nuevo;
      primero.siguiente = primero;
      nuevo.anterior = ultimo;
      ultimo = nuevo;
    } else {
      ultimo.siguiente = nuevo;
      nuevo.siguiente = primero;
      nuevo.anterior = ultimo;
      ultimo = nuevo;
      primero.anterior = ultimo;
    }
  }

  public void eliminar(int dato)
  {
    NodoDobleCircular actual;
    NodoDobleCircular anterior;
    actual = primero;
    anterior = ultimo;
    do {
      if (actual.dato == dato) {
        if (actual == primero) {
          primero = primero.siguiente;
          ultimo.siguiente = ultimo;
          primero.anterior = ultimo;
        } else if (actual == ultimo) {
          ultimo = anterior;
          primero.anterior = ultimo;
          ultimo.siguiente = primero;
        } else {
          anterior.siguiente = actual.siguiente;
          actual.siguiente.anterior = anterior;
        }
      }
      anterior = actual;
      actual = actual.siguiente;
    } while (actual != primero);
  }

  public void listarNodo()
  {
    NodoDobleCircular actual;
    actual = primero;

    do {
      System.out.print(actual.dato + " ");
      actual = actual.siguiente;
    } while (actual != primero);
  }
}
