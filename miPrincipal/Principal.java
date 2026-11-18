package miPrincipal;
import arbolBinario.ArbolBinario;
import arbolBinario.Nodo;

public class Principal {
   
    public static void main(String[] args) {
        ArbolBinario ab = new ArbolBinario();
        //creamos los Nodos
        Nodo nodoA = new Nodo("A");
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");
        Nodo nodoE = new Nodo("E");
        Nodo nodoF = new Nodo("F");
        Nodo nodoG = new Nodo("G");
        //enlazamos los nodos
        ab.setRaiz(nodoA);
        ab.getRaiz().setIzquierdo(nodoB);
        ab.getRaiz().setDerecho(nodoC);
        nodoB.setIzquierdo(nodoD);
        nodoB.setDerecho(nodoE);
        nodoC.setIzquierdo(nodoF);
        nodoC.setDerecho(nodoG);
        //imprimimos los recorridos
        System.out.println("\nPreorden Recursivos");
        ab.preorden();
        System.out.println("\nPreorden Iterativo");
        ab.preordenIterativo();
        System.out.println("\nInorden Recursivos");
        ab.inorden();
        System.out.println("\nInorden Iterativo");
        ab.inordenIterativo();
        System.out.println("\nPostorden Recursivos");
        ab.postorden();
        System.out.println("\nPostorden Iterativo");
        ab.postordenIterativo();
        System.out.println("\nRecorrido por Niveles");
        ab.recorrerPorNiveles();


       
    }
}