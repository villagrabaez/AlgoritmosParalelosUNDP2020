import java.util.ArrayList;

public class PilaObjeto {
  private ArrayList<Object> pila = new ArrayList<>();

  public void push(Object dato)
  {
    pila.add(dato);
  }

  public Object pop()
  {
    if ( !pila.isEmpty() ) {
      Object tmp = pila.get(pila.size() - 1);
      pila.remove(pila.size() - 1);
      return tmp;
    } else {
      return null;
    }
  }

  public boolean empty()
  {
    return pila.isEmpty();
  }
}
