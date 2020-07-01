public class Main {
  public static void main(String[] args)
  {
    ArbolBinario arbolBinario = new ArbolBinario();
    arbolBinario.insertar(1);
    arbolBinario.insertar(10);
    arbolBinario.insertar(7);
    arbolBinario.insertar(5);
    arbolBinario.insertar(8);
    arbolBinario.ver(arbolBinario.raiz);
  }
}
