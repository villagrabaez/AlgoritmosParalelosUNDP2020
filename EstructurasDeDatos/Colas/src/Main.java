public class Main {
  public static void main(String[] args)
  {
    Cola cola = new Cola();
    cola.insert(1);
    cola.insert(2);
    cola.insert(3);
    cola.insert(4);
    cola.insert(5);
    cola.delete();

    while ( ! cola.empty() ) {
      System.out.print(cola.delete() + " ");
    }
  }
}
