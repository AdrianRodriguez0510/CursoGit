public class PilaArray {

    int pilaNumerica[] = new int[5];
    int tope = -1;
    public void push(){
        if( tope>= pilaNumerica.length -1){
            System.out.println("La pila está llena");
        }else{
            tope+=1;
            System.out.println("Ingrese el dato");
        }
    }//dfsdfsdfsdf
}
