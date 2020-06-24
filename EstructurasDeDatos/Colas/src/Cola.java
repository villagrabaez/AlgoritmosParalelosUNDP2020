public class Cola {
  NodoCola primero, ultimo;
  int tamano;

  public Cola()
  {
    primero = ultimo = null;
    tamano = 0;
  }

  public boolean empty()
  {
    return primero == null;
  }

  public void insert(int dato)
  {
    NodoCola nuevo = new NodoCola(dato);

    if (empty()) {
      primero = nuevo;
    } else {
      ultimo.siguiente = nuevo;
    }
    ultimo = nuevo;
    tamano++;
  }

  public int delete()
  {
    int tmp = primero.dato;
    primero = primero.siguiente;
    tamano--;
    return tmp;
  }

  public int inicio()
  {
    return primero.dato;
  }

  public int size()
  {
    return tamano;
  }
}
