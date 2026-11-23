package arbolBinario;
import pila.Pila;
import cola.Cola;

public class ArbolBinarioBusqueda {
    //Atributo
    private Nodo raiz;
    //constructores
    public ArbolBinarioBusqueda() {
        raiz = null;

    }
    public ArbolBinarioBusqueda(Nodo raiz) {
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
    /*
    insertar un nodo en el arbol binario de búsqueda
     */
    public void insertar(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        Nodo nuevo = new Nodo();
        nuevo.setValor(dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            //anterior: es una referencia al padre de aux
            Nodo anterior=null;
            //aux: auxiliar que va recorriendo los nodos, desde la raiz
            Nodo aux = raiz;
            while (aux !=null){
                anterior = aux;
                if(dato.esMenor(aux.getValor()))
                    aux = aux.getIzquierdo();
                if(dato.esMayor(aux.getValor()))
                    aux = aux.getDerecho();
                else
                    throw new Exception("Dato duplicado");
            }
            //aux vale null
            if(dato.esMenor(anterior.getValor()))
                anterior.setIzquierdo(nuevo);
            else
                anterior.setDerecho(nuevo);
        }
    }
    /*
    interfaz pública del método recurso para insertar
     */
    public void insertar2(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        raiz = insertarRec(raiz,dato);

    }
    /*
    método privado recursivo para insertar
     */
    private Nodo insertarRec(Nodo raizSub,Comparable dato) throws Exception{
        //cado base
        if(raizSub == null){
            raizSub = new Nodo(dato);
        }
        else{
            if(dato.esMenor(raizSub.getValor())){
                Nodo iz = insertarRec(raizSub.getIzquierdo(), dato);
                raizSub.setIzquierdo(iz);
            }else{
                if(dato.esMayor(raizSub.getValor())){
                    Nodo dr = insertarRec(raizSub.getDerecho(), dato);
                    raizSub.setDerecho(dr);

                }else{
                    throw new Exception("Dato duplicado");
                }
            }
        }
        return raizSub;

    }
    /*
    busqueda de un nodo en version iterativa
     */
    public Nodo buscar(Object valor){
        Comparable dato = (Comparable)valor;
        if(raiz==null){
            return raiz;
        }else{
            //aux: auxiliar que va recorriendo el nodo, des la raiz
            Nodo aux = raiz;
            while (aux !=null){
                if(dato.esIgual(aux.getValor())){
                    return aux;
                }
                if(dato.esMenor(aux.getValor())){
                    aux = aux.getIzquierdo();
                }else{
                    aux = aux.getDerecho();
                }

            }
            return null;
        }
    }
    /*
    interfaz de buscar que invoca al metodo recursivo localizar
     */
    public Nodo buscar2(Object valor){
        Comparable dato = (Comparable)valor;
        if(raiz==null){
            return null;
        }else{
            return localizar(raiz,dato);
        }
    }
    /*
    version recursiva de localizar
     */
    private Nodo localizar(Nodo raizSub, Comparable buscado){
        //caso base
        if(raizSub == null){
            return null;
        }else{
            if (buscado.esIgual(raizSub.getValor())){
                return raizSub;
            }else if(buscado.esMenor(raizSub.getValor())){
                return localizar(raizSub.getIzquierdo(), buscado);
            }else{
                return localizar(raizSub.getDerecho(), buscado);
            }
        }
    }
    public boolean eliminar(Object valor){
        Comparable dato = (Comparable)valor;
        //Buscar le nodo a eliminar y su antecesor
        Nodo antecedor = null;// antecero de nodo a eliminar,
        //y el nodo a eliminar esta en aux
        Nodo aux = raiz;
        while(aux !=null){
            if(dato.esIgual(aux.getValor())){
                break;
            }
            antecedor = aux;
            if(dato.esMenor(aux.getValor())){
                aux = aux.getIzquierdo();
            }else{
                aux = aux.getDerecho();
            }

        }
        if(aux==null)
           return false; //dato no encontrado
        //Si llega a este punto,el nodo a eliminat existe y esta en aux
        //y su antecesor es antecesor
        ///AQUI ME QUEDE

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
        if(raiz==null){
            return;
        }
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
         if(raiz==null){
            return;
         }
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
                aux = aux.getIzquierdo();
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
        if(raiz==null){
            return;
        }
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
