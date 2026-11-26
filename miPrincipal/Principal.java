package miPrincipal;
import arbolBinario.ArbolBinario;
import arbolBinario.Nodo;
import arbolBinario.Estudiante;
import arbolBinario.Entero;
import arbolBinario.ArbolBinarioBusqueda;


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
        System.out.println();
        
        Estudiante est1 = new Estudiante(345,"Ana");
        Estudiante est2 = new Estudiante(123, "Beto");
         
        if(est1.getCodigo()>est2.getCodigo()){
            System.out.println(est1+" es mayor que "+est2);
        }else if(est1.getCodigo()<est2.getCodigo()){
            System.out.println(est1+" es menor que "+est2);
        }else{
            System.out.println(est1+" es igual que "+est2);
        }

        if(est1.esMayor(est2)){
            System.out.println(est1+" es mayor que "+est2);
        }else if(est1.esMenor(est2)){
            System.out.println(est1 + "es menor que "+est2);
        }else{
            System.out.println(est1+ " es igual que "+est2);
        }

        Entero e1 = new Entero(10);
        Entero e2 = new Entero(5);
        if(e1.esMayor(e2)){
            System.out.println(e1+" es mayor que "+e2);
        }
         //crear un arbolBinario Ordenado
            ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        
        try{
           
            //Agregar los datos al arbol binario ordenado 
            //version iterativa
            System.out.println("Insertando alguos elementos:");
            abb.insertar(new Entero(10));
            abb.insertar(new Entero(15));
            abb.insertar(new Entero(30));
            abb.insertar(new Entero(5));
            abb.insertar(new Entero(2));
            abb.insertar(new Entero(1));
            //version recursiva
            abb.insertar2(new Entero(12));
        }catch(Exception e){
            System.out.println("Error!"+e.getMessage());
        }
        //Recorridos
        System.out.println("\nPreorden Recursivos");
        abb.preorden();
        System.out.println("\nPreorden Iterativo");
        abb.preordenIterativo();
        System.out.println("\nInorden Recursivos");
        abb.inorden();
        System.out.println("\nInorden Iterativo");
        abb.inordenIterativo();
        System.out.println("\nPostorden Recursivos");
        abb.postorden();
        System.out.println("\nPostorden Iterativo");
        abb.postordenIterativo();
        System.out.println("\nRecorrido por Niveles");
        abb.recorrerPorNiveles();
        System.out.println();

        //Imprimo el arbol después de las inserciones
        arbolBinario.BTreePrinter.printNode(abb.getRaiz());
        System.out.println();


 
    }
}