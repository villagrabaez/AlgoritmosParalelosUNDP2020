public class Main {
  public static void main(String[] args)
  {
   // Pila pila = new Pila();
   // pila.push(1);
   // pila.push(2);
   // pila.push(3);
   // pila.push(4);
   // pila.push(5);
   // pila.pop();

   // while ( ! pila.empty() ) {
   //   System.out.print(pila.pop() + " ");
   // }

    PilaObjeto pilaObjeto = new PilaObjeto();
    pilaObjeto.push("hhh");
    pilaObjeto.push(1);
    pilaObjeto.push("Hola Mundo!");

    pilaObjeto.pop();

    while ( ! pilaObjeto.empty() ) {
      System.out.print(pilaObjeto.pop() + " ");
    }
  }
}
