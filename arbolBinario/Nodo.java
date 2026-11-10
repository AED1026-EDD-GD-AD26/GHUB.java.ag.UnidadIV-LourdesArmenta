package arbolBinario;

public class Nodo  {
    //Atributos
    private Object valor;
    private Nodo izquierdo;
    private Nodo derecho;
    //constructores
    public Nodo() {
        valor = null;
        izquierdo = null;
        derecho = null;
    }
    public Nodo(Object valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }
    //getter
    public Object getValor() {
        return valor;
    }
    public Nodo getIzquierdo() {
        return izquierdo;
    }
    public Nodo getDerecho() {
        return derecho;
    }
    //setter
    public void setValor(Object valor) {
        this.valor = valor;
    }
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }
    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    


    
    

    
}
