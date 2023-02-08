public class EdadMayor {

    public static int personaMayor(Persona[] person){
        int edad=person[0].getEdad();
        for(int i = 0; i< person.length; i++){
            if(person[i].getEdad() > edad){
                edad = person[i].getEdad();
            }
        }
        return edad;
    }
}
