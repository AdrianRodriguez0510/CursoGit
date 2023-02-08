public class Nodo {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    private Nodo siguiente;

    public Nodo(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}
