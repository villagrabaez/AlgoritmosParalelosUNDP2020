public class ListaEnlazada {
  protected Nodo primero;

  public ListaEnlazada()
  {
    primero = null;
  }

  public ListaEnlazada agregarAlInicio(int dato)
  {
    Nodo nuevo = new Nodo(dato);
    nuevo.referencia = primero;
    primero = nuevo;
    return this;
  }

  public void agregerAlFinal(int dato)
  {
    Nodo nuevoFinal;
    nuevoFinal = new Nodo(dato);
    nuevoFinal.referencia = null;

    if (primero == null) {
      primero = nuevoFinal;
      return;
    }

    Nodo tmp;

    for(tmp = primero; tmp.getReferencia() != null; tmp=tmp.getReferencia());
      tmp.setReferencia(nuevoFinal);
  }

  public Nodo buscarNodo(int dato)
  {
    Nodo nodoBuscar;

    for(nodoBuscar = primero; nodoBuscar != null; nodoBuscar = nodoBuscar.getReferencia()) {
      if (dato == nodoBuscar.dato) {
        return nodoBuscar;
      }
    }

    return null;
  }

  public void eliminarNodo(int dato)
  {
    boolean encontrado;
    Nodo actual, anterior;
    actual = primero;
    anterior = null;
    encontrado = false;

    while (actual != null && !encontrado) {
      encontrado = (actual.dato == dato);
      if (!encontrado) {
        anterior = actual;
        actual = actual.getReferencia();
      }
    }

    if (actual != null) {
      if (actual == primero) {
        primero = actual.referencia;
      } else {
        anterior.setReferencia(actual.referencia);
      }
    }
  }

  public void verListaCompleta()
  {
    Nodo nodov;
    nodov = primero;
    while(nodov != null) {
      System.out.print(nodov.dato + " ");
      nodov = nodov.referencia;
    }
  }
}
