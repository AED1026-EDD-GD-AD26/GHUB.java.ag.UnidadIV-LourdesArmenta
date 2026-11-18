package cola;

public class Cola <T>{
    //atributos
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamanio;
    //constructor
    public Cola(){
        cabeza = null;
        cola = null;
        tamanio = 0;
    }
    public int getTamanio(){
        return tamanio;

    }
    public boolean esVacia(){
        return (cabeza == null);

    }
    public void encolar(T valor){
        //crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //cabeza y la cola apuntan al nuevo
            cabeza = nuevo;
            cola =nuevo;

        }else{
            cola.setSiguiente(nuevo);
            //la nueva cola pasa a ser nuevo
            cola = nuevo;
        }
        //incrementamos el tamanio porque hay un nuevo elemento
        tamanio++;

    }
    //Elimina el primer elemento de la cola
    public void desencolar(){
        //si no es vacia
        if (!esVacia()){
            //verificar si hay un solo elemento en la cola
            if(cabeza==cola){
                cabeza =null;
                cola = null;
            }else{
                //se elimina el primer elemento de la cola
                //desplazando la cabeza al siguiente nodo
                cabeza = cabeza.getSiguiente();
            }
            tamanio--;
        }
                
    }
    //Devuelve el primer elemento de la cola
    public T frente(){
        if (!esVacia()){
            return cabeza.getValor();
        }else{
            return null;
        }

    }


        

}
