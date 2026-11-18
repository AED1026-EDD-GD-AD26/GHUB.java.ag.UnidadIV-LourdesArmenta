package arbolBinario;
import pila.Pila;
import cola.Cola;

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
    //getter
    public Nodo getRaiz() {
        return raiz;
    }
    //setter
    public void setRaiz(Nodo raiz){
        this.raiz = raiz;
    }
    //Recorridos de forma recursivos
    public void preorden(){
        preorden(raiz);
    }
    public void inorden(){
        inorden(raiz);
    }
    public void postorden(){
        postorden(raiz);
    }
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
        Pila<Nodo> pila = new Pila<>();
        Nodo aux = raiz;
        Nodo q = raiz;
        while (aux !=null){
            //avanzar por la izquierda y apilamos los nodos
            while (aux.getIzquierdo()!=null){
                pila.apilar(aux);
                //aux.getIzquierdo(); //AQUI ESTABA EL ERRO
                aux= aux.getIzquierdo();
            }
            while(aux !=null && (aux.getIzquierdo() == null) || aux.getDerecho() ==q ){
                visitar(aux);
                q = aux;
                if(pila.esVacia()){
                    return;
                }
                aux=pila.cima();
                pila.retirar();
            }
            pila.apilar(aux);
            aux = aux.getDerecho();
        }
        
    }
    /*
    Recorrido por niveles
     */
    public void recorrerPorNiveles(){
        Cola<Nodo> cola = new Cola<>();
        cola.encolar(raiz);
        while (!cola.esVacia()){
            Nodo aux = cola.frente();
            visitar(aux);
            
            if(aux.getIzquierdo() !=null){
               cola.encolar(aux.getIzquierdo());
            }
            if(aux.getDerecho() !=null){
                cola.encolar(aux.getDerecho());
            }
            //if(aux.getIzquierdo() !=null){
            //    cola.encolar(aux.getIzquierdo());
            //}
            cola.desencolar();
        }
    }



        
    
    
    
}
