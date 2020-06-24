public class NodoDoble {
  int dato;
  NodoDoble siguiente;
  NodoDoble anterior;

  public NodoDoble (int dato)
  {
    this.dato = dato;
    this.anterior = null;
    this.siguiente = null;
  }

  public int getDato()
  {
    return this.dato;
  }

  public void setAnterior(NodoDoble anterior)
  {
    this.anterior = anterior;
  }

  public void setSiguiente(NodoDoble siguiente)
  {
    this.siguiente = siguiente;
  }
}
