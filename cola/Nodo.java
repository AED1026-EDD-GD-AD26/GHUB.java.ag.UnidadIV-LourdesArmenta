package cola;
public class Nodo <T> {
    //Atributos
    private T valor;
    private Nodo<T> siguiente;
    //constructores
    public Nodo(){
        valor = null;
        siguiente = null;
    }
    //getter
    public T getValor(){
        
        return valor;
    }
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    //setter
    public void setValor(T valor){
        this.valor = valor;
    }
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
}