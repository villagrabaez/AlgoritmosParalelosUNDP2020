public class Nodo {
  int dato;
  Nodo referencia;

  public Nodo(int d)
  {
    dato = d;
    referencia = null;
  }

  public int getDato()
  {
    return dato;
  }

  public void setReferencia(Nodo ref)
  {
    referencia = ref;
  }

  public Nodo getReferencia()
  {
    return referencia;
  }
}
