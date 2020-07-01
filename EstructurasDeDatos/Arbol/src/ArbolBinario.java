public class ArbolBinario {
  NodoArbol raiz;

  public ArbolBinario()
  {
    raiz = null;
  }

  public void insertar(int dato)
  {
    NodoArbol nuevo = new NodoArbol(dato);
    if (raiz == null) {
      raiz = nuevo;
    } else {
      NodoArbol tmp = raiz;
      NodoArbol padre;
      while(true) {
        padre = tmp;
        if (dato < tmp.dato) { // Izquierda
          tmp = tmp.hijoIzq;
          if (tmp == null) {
            padre.hijoIzq = nuevo;
            return;
          }
        } else { // Derecha
          tmp = tmp.hijoDer;
          if (tmp == null) {
            padre.hijoDer = nuevo;
            return;
          }
        }
      }
    }
  }

  public boolean vacio()
  {
    return raiz == null;
  }

  public void ver(NodoArbol nodo)
  {
    if (nodo != null) {
      ver(nodo.hijoIzq);
      System.out.print(nodo.dato);
      ver(nodo.hijoDer);
    }
  }
}
