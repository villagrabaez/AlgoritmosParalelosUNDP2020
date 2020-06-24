public class ListaEnlazadaDoble {
  NodoDoble primero, ultimo;
  int tamano;

  public ListaEnlazadaDoble()
  {
    //
  }

  public void agregar(int dato)
  {
    NodoDoble nuevo = new NodoDoble(dato);

    if (tamano == 0) {
      primero = ultimo = nuevo;
    } else {
      nuevo.anterior = ultimo;
      ultimo.siguiente = nuevo;
      ultimo = nuevo;
    }

    tamano++;
  }

  public boolean eliminar()
  {
    if (tamano > 0) {
      if (tamano() == 1) {
        primero = null;
        ultimo = null;
      } else {
        ultimo.anterior.siguiente = null;
        ultimo = ultimo.siguiente = null;
      }

      tamano--;
    }

    return false;
  }

  public void agregarInicio(int dato)
  {
    NodoDoble nuevo = new NodoDoble(dato);
    if (tamano == 0) {
      primero = ultimo = nuevo;
    } else {
      nuevo.siguiente = primero;
      primero.anterior = nuevo;
      primero = nuevo;
    }

    tamano++;
  }

  public boolean eliminarInicio()
  {
    if (tamano > 0) {
      if (tamano() == 1) {
        primero = null;
        ultimo = null;
      } else {
        primero.siguiente.anterior = null;
        primero = primero.siguiente;
      }
    }

    return false;
  }

  public void verLista()
  {
    NodoDoble listarNodo;
    listarNodo = primero;
    while (listarNodo != null) {
      System.out.print(listarNodo.dato + " ");
      listarNodo = listarNodo.siguiente;
    }
  }

  public int tamano()
  {
    return tamano;
  }

  public boolean vacio()
  {
    return tamano() == 0;
  }
}
