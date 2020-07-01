public class NodoArbol {
  int dato;
  NodoArbol hijoIzq;
  NodoArbol hijoDer;

  public NodoArbol(int dato)
  {
    this.dato = dato;
    this.hijoDer = null;
    this.hijoIzq = null;
  }

  public String toString()
  {
    return "dato: " + dato;
  }
}
