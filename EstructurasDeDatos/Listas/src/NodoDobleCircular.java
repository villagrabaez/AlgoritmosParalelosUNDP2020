public class NodoDobleCircular {
  int dato;
  NodoDobleCircular siguiente;
  NodoDobleCircular anterior;

  public NodoDobleCircular()
  {
    //
  }

  public NodoDobleCircular(int dato)
  {
    this.dato = dato;
    this.anterior = null;
    this.siguiente = null;
  }

  public int getDato()
  {
    return this.dato;
  }
}
