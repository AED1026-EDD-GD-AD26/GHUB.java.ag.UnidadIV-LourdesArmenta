package arbolAVL;

public class Nodo {
    //Atributos
    private Object valor;
    private Nodo izquierdo;
    private Nodo derecho;
    private int fe;
    //constructores
    public Nodo() {
        valor = null;
        izquierdo = null;
        derecho = null;
        fe = 0;
    }
    public Nodo(Object valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
        fe = 0;
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
    public int getFe(){
        return fe;
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
    public void setFe(int fe){
        this.fe = fe;
    }
}
