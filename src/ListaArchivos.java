public class ListaArchivos {
    private Nodo primero;
    private Nodo ultimo;

    public void insertarPrimero(String nombre){
        Nodo nodo = new Nodo(nombre);
        if(!esVacia()){
            nodo.setSiguiente(primero);
        }
        else{
            this.ultimo = nodo;
        }
        this.primero = nodo;
    }

    public void insertarNodoDespuesDeNombre(String nombrePrevio, String nombreNuevo){
        Nodo nodo = new Nodo(nombreNuevo);
        Nodo aux = this.primero;
        if(!esVacia()){
            while(aux.getSiguiente() !=null || aux.getNombre() == nombrePrevio) {
                if(aux.getNombre() == nombrePrevio){
                    nodo.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(nodo);

                }
                aux = aux.getSiguiente();
            }
        }
        else{
            insertarPrimero(nombreNuevo);
        }
    }

    public void insertarNodoALoUltimo(String nombre) {
        Nodo nodo = new Nodo(nombre);
        Nodo aux = this.primero;
        if (esVacia()) {
            this.insertarPrimero(nombre);
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);

        }
    }
    public void eliminarUltimo(){
        Nodo aux = this.primero;
        while(aux.getSiguiente().getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(null);
    }
    public void eliminarPrimero(){
        this.primero = primero.getSiguiente();
    }
    public void eliminarElemento(String nombre){
        if(!esVacia()){
            Nodo aux = this.primero;
            while(aux.getSiguiente().getNombre() != nombre){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());

        }
    }
    public String imprimir(){
    Nodo aux = this.primero;
    String resp = "";

    while(aux != null){
        resp += aux.getNombre() + " - ";
        aux = aux.getSiguiente();
    }
    return resp;
    }

    private boolean esVacia(){
        boolean listaVacia = false;
        if(this.primero == null) {
            listaVacia = true;
        }
        return listaVacia;
    }

    public int contarElementos(){
        int contador = 0;
        Nodo aux = this.primero;
        while(aux != null){
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    public void intercalarOrden(String nombre){
        Nodo aux = this.primero;

        while(aux !=null){
            if(aux.getSiguiente().getSiguiente().getNombre() == nombre){
                aux.getSiguiente().getSiguiente().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setSiguiente(aux.getSiguiente().getSiguiente().getSiguiente());
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
            aux = aux.getSiguiente();
        }

    }
}
