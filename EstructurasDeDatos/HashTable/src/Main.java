import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
  public static void main(String[] args)
  {
    // LinkedList listaOrdernada;
    // Stack pila;
    // Queue cola;

    Hashtable<String, String> tabla = new Hashtable<String, String>();
    tabla.put("juan", "paraguaya");
    tabla.put("julio", "colombiana");
    tabla.put("ana", "rusa");

    System.out.print(tabla.get("ana"));
  }
}
