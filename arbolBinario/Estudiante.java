package arbolBinario;

public class Estudiante implements Comparable{
    //atributos
    private int codigo;
    private String nombre;
     //constructores
    public Estudiante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    //getter
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    //setter
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + "]";
    }
    //implementaciones de comparables
    @Override 
    public  boolean esMayor(Object q){
        Estudiante obj = (Estudiante) q;
        if (nombre.compareTo(obj.getNombre())>0){
            return true;
        }else
        {
            return false;
        }

    }
    @Override 
    public  boolean esMenor(Object q){
        Estudiante obj = (Estudiante) q;
        if (nombre.compareTo(obj.getNombre())<0){
            return true;
        }else
        {
            return false;
        }
        
    }
    @Override 
    public  boolean esIgual(Object q){
        Estudiante obj = (Estudiante) q;
       
        return nombre.equals(obj.getNombre());
             
    }

    
    
    
}
