public class MiPila {

    private NodoPila cima = null;

    public void apilar(String nombre){
        NodoPila nodo = new NodoPila(nombre);
        if(cima !=null){
            nodo.siguiente = cima;
        }
        cima = nodo;
    }

    public void desapilar() {
        if (cima != null) {
            NodoPila eliminar = cima;
            cima = cima.siguiente;
            eliminar.siguiente = null;
        }
    }

        public String obtener(){
            if(cima !=null){
                return cima.nombre;
            }
            else{
                return null;
            }
        }


}
