public class Pila {
  private NodoPila ultimo;
  int tamano;

  public Pila()
  {
    ultimo = null;
    tamano = 0;
  }

  /**
   * @return verficar si la pila esta vacia
   */
  public boolean empty()
  {
    return ultimo == null;
  }

  /**
   * @param agregar datos a la pila
   */
  public void push(int dato)
  {
    NodoPila nuevo = new NodoPila(dato);
    nuevo.siguiente = ultimo;
    ultimo = nuevo;
    tamano++;
  }

  /**
   * @return quitar datos de la pila
   */
  public int pop()
  {
    int tmp = ultimo.dato;
    ultimo = ultimo.siguiente;
    tamano--;
    return tmp;
  }

  /**
   * Devuelve el ultimo elemento de la pila
   */
  public int peek()
  {
    return ultimo.dato;
  }

  /**
   * @return devuelve el tamaño de la pila
   */
  public int size()
  {
    return tamano;
  }

  /**
   * Limpiar la pila
   */
  public void  clear()
  {
    while ( ! empty() ){
      pop();
    }
  }
}
