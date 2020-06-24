public class ListaEnlazadaOrdenada extends ListaEnlazada {
  public ListaEnlazadaOrdenada()
  {
    super();
  }

  public ListaEnlazadaOrdenada insertarOrden(int dato)
  {
    Nodo nuevo;

    nuevo = new Nodo(dato);

    if (primero == null) {

      primero = nuevo;

    } else if (dato < primero.getDato()) {

      nuevo.setReferencia(primero);

      primero = nuevo;

    } else {

      Nodo anterior, primeroO;

      anterior = primeroO = primero;

      while(primeroO.getReferencia() != null && dato > primeroO.getDato()) {

        anterior = primeroO;

        primeroO = primeroO.getReferencia();

      }

      if (dato>primeroO.getDato()) {
        anterior = primeroO;
      }

      nuevo.setReferencia(anterior.getReferencia());

      anterior.setReferencia(nuevo);
    }

    return this;
  }
}
