package arbolBinario;
import pila.Pila;

public class ArbolBinario {
    //Atributo
    private Nodo raiz;
    //constructores
    public ArbolBinario() {
        raiz = null;

    }
    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }
    //Recorridos de forma recursivos
    private void preorden(Nodo aux){
        if (aux!=null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());
        }  

    }
    private void inorden(Nodo aux){
        if (aux!=null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());
        } 
        
    }
    private void postorden(Nodo aux){
         if (aux!=null){
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        } 
        
    }
    private void visitar(Nodo aux){
        System.out.print(aux.getValor()+" ");
        
    }
    //Recorrido de forma iterativa
    public void preordenIterativo(){
        Pila<Nodo> pila = new Pila<>();
        pila.apilar(raiz);
        while(!pila.esVacia()){
            Nodo aux = pila.cima();
            visitar(aux);
            pila.retirar();
            if (aux.getDerecho() !=null)
                pila.apilar(aux.getDerecho());
            if(aux.getIzquierdo() != null)
                pila.apilar(aux.getIzquierdo()); 
        }
    }
    public void inordenIterativo(){
         Pila<Nodo> pila = new Pila<>();
         pila.apilar(raiz);
         Nodo aux = raiz.getIzquierdo();
         while(aux != null || !pila.esVacia()){
            if(aux !=null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }else{
                aux = pila.cima();
                pila.retirar();
                visitar(aux);
                aux = aux.getDerecho();
            }

         }

        
    }
    public void postordenIterativo(){
        
    }


        
    
    
    
}
