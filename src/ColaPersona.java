import jdk.swing.interop.SwingInterOpUtils;

public class ColaPersona {
    private NodoCola primero;
    private NodoCola ultimo;




    public void encolar(Persona t){
        NodoCola nuevo = new NodoCola(t);
        if(primero == null){
            primero = nuevo;
           // System.out.println("Encoló");
        }
        else{
           ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
    }

    public void eliminar(){
        if(primero !=null){
            NodoCola eliminar = primero;
            primero = primero.siguiente;
            eliminar.siguiente = null;
        }
    }

    public Persona obtener(){
        Persona trabajo = null;
        if(primero !=null){
            trabajo= primero.persona;
        }
        return trabajo;
    }

    public void mostrarColaCompleta(){
        String colaEnString = "";
        if(this.primero != null) {

            NodoCola aux = primero;
            while (aux != null) {
                System.out.println("Persona: " + aux.persona.getNombre() + " Edad: " + aux.persona.getEdad() + " - ");
                aux = aux.siguiente;
            }
        }
    }
    public float calcularEntrada(){
        String colaEnString = "";
        NodoCola aux = primero;
        float montoTotal=0;

        if(this.primero != null) {
            while (aux != null) {
                if(aux.persona.getEdad() <=10){
                    System.out.println("Persona: " + aux.persona.getNombre() + " Edad: " + aux.persona.getEdad() +
                            "Valor entrada: " + "$1");
                    montoTotal+= 1;
                }
                if(aux.persona.getEdad() >10 && aux.persona.getEdad() <=17){
                    System.out.println("Persona: " + aux.persona.getNombre() + " Edad: " + aux.persona.getEdad() +
                            "Valor entrada: " + "$2.5");
                    montoTotal +=2.5;
                }
                else{
                    System.out.println("Persona: " + aux.persona.getNombre() + " Edad: " + aux.persona.getEdad() +
                            "Valor entrada: " + "$3.5");
                    montoTotal +=3.5;
                }
                primero = aux.siguiente;
               // eliminar();
                aux = aux.siguiente;
            }
        }
        return montoTotal;
    }
}
