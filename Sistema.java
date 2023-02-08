import javax.swing.*;
import java.net.Inet4Address;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {


//MAS CAMBIOS DESDE GITHUB
//hjdsfhjksdhfsdhfkjhskhn
    public static void main(String[] args){

        int vector1[] = {5,10,15,20,25};
        int pos = 4;
        int numero = 8;
        boolean encontre = false;
        int aux =0;
        if(numero < vector1[vector1.length-1]){
            int i =0;
            while(vector1[i] < numero) {
                i++;
            }
            vector1[i] = numero;
            }

        for(int j = 0; j < vector1.length; j++){
            System.out.println(vector1[j]);
        }




        /*List<Integer> listaVector2 = new ArrayList<>();
        listaVector2.add(10); listaVector2.add(22); listaVector2.add(30); listaVector2.add(45); listaVector2.add(65);
*/
    /*    List<Integer> grades = new ArrayList<>();
         grades.add(73); grades.add(67); grades.add(38); grades.add(33);

        List<Integer> arr = new ArrayList<>();
        int diferencia = 0;
        for(int i = 0; i < grades.size(); i++) {

            if (grades.get(i) > 37) {
                int resto = grades.get(i) % 5;//2
                int proximoMultiplo = (grades.get(i) - resto) + 5;
                diferencia = proximoMultiplo - grades.get(i);
                if (diferencia < 3) {
                    arr.add(proximoMultiplo);
                } else {
                    arr.add(grades.get(i));
                }
            }
        }
        for(int j = 0; j < arr.size(); j++){
            System.out.println(arr.get(j));
         }


       /* List<Integer> listaVector3 = new ArrayList<>();

        for(int i =0; i < listaVector1.size();i++){
            listaVector3.add(listaVector1.get(i) + listaVector2.get(i));
        }
        for(int j = 0; j < listaVector3.size(); j++){
            System.out.println(listaVector3.get(j));
        }

        /*int vector2[] = {10,22,30,45,65};
        int vector3[] = new int[5];

        /*
        for(int i = 0; i < vector1.length; i++){
            vector3[i] = (vector1[i] + vector2[i]);
        }
        for(int i = 0; i < vector3.length; i++){
            System.out.println("Posicion: "+ (i+1) + ": " +vector3[i]);
        }
        /*
        int numeros[] = {179,150,159,145,168,192,180,178,162,154,198};

        int aux = 0;
        for(int i = 0; i<numeros.length-1;i++){
            for(int j = 0; j <numeros.length-1; j++){
                if(numeros[j] > numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Posicion: "+ (i+1) + ": " +numeros[i]);
        }

      /*  int arreglo1[] = {5,4,3,2,1};
        int arreglo2[] = new int[5];
        int j = arreglo2.length -1;
        for(int i = 0; i<arreglo1.length; i++){
            arreglo2[j] = arreglo1[i];
            j--;
        }
        for(int i = 0; i < arreglo1.length; i++){
            System.out.println("Posicion: "+ (i+1) + ": " +arreglo1[i]);
        }
        for(int h = 0; h < arreglo2.length; h++){
            System.out.println("Posicion: "+ (h+1) + ": "+ arreglo2[h]);
        }


        /*
        int numeros[] = {179,150,159,145,168,192,180,178,162,154,198};

        int alturaMedia =0, sumaAltura = 0;
        for(int i = 0; i < numeros.length; i++){
            sumaAltura += numeros[i];
        }
        alturaMedia = sumaAltura/numeros.length;
        int personasMasAltas=0, personasMasBajas = 0;

        for(int i = 0; i <numeros.length; i++){
            if(numeros[i] > alturaMedia){
                personasMasAltas++;
            }
            if(numeros[i] < alturaMedia){
                personasMasBajas++;
            }
        }
        System.out.println("Altura media: "+ alturaMedia + "Personas mas altas: "+ personasMasAltas + "Personas mas bajas: "+personasMasBajas);

       /* int mediapositivos =0, medianegativos = 0, positivos =0, negativos =0, sumaPositivos =0, sumaNegativos = 0;
        for(int i = 0; i < numeros.length;i++){

            if(numeros[i] <0){
                negativos++;
                sumaNegativos += numeros[i];
            }
            else if(numeros[i] >0){
                positivos++;
                sumaPositivos +=numeros[i];
            }
        }
        medianegativos = sumaNegativos / negativos;
        mediapositivos = sumaPositivos / positivos;
        System.out.println("Positivos: " + positivos + ". Negativos: "+ negativos);
        System.out.println("Suma Positivos: " + sumaPositivos + ". SumaNegativos: " + sumaNegativos);
        System.out.println("Media Positivos: "+ mediapositivos + ".Media Negativos: " + medianegativos);*/





        /*int arreglos[], nElementos;
        nElementos =  Integer.parseInt(JOptionPane.showInputDialog("Insertar la cantidad de elementos del arreglo"));
        arreglos = new int[nElementos];
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < nElementos;i++){
            System.out.println("Ingrese un valor");
            arreglos[i] = entrada.nextInt();
        }
       int aux = 0;//metodo burbuja creciente
        for(int i = 0; i < arreglos.length-1; i++){
            for(int j = 0; j < arreglos.length-1; j++){
                if(arreglos[j] > arreglos[j+1]){
                    aux = arreglos[j];
                    arreglos[j] = arreglos[j+1];
                    arreglos[j+1] = aux;
                }
            }
        }
        for(int i = 0; i < arreglos.length;i++){
            System.out.println(arreglos[i]);
        }


        //int arregloUno[] = {10,20,30,40,50,2,8,9,10,10};

        /*int posicion = Integer.parseInt(JOptionPane.showInputDialog("Insertar posicion"));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insertar numero"));

        for(int j = 8; j > posicion; j--){
            arregloUno[j+1] = arregloUno[j];
        }
        arregloUno[posicion] = numero;2
int sumando =0;
        for(int j =0; j < arregloUno.length-1; j++){
            int elemento1 = 0, elemento2 = 0;
            boolean suma =false;
            int h = j+1;
            while(h < 9){
                sumando =arregloUno[j] + arregloUno[h];
                if( sumando == 12){
                    suma = true;
                    elemento1 = arregloUno[j];
                    elemento2 = arregloUno[h];
                }
                h++;
            }
            System.out.println("Posicion: " + j +": " + arregloUno[j]);
            System.out.println("Elementos que sumados dan 12: " + elemento1 + ", " + elemento2);
        }



      /*  int arregloA[] = new int[10];

        for(int i = 0; i < 10; i++){
            arregloA[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1 +". Digite un elemento"));
        }
        int contadorPosiciones =0;
        int ultimo = arregloA[arregloA.length-1];

        for(int i = 8; i>=0;i--){
            contadorPosiciones = 0;
           while(contadorPosiciones != desplazar) {
               arregloA[i + 1] = arregloA[i];

               contadorPosiciones++;
           }

        }


        for(int j =0; j < arregloA.length; j++){
            System.out.println("Posicion: " + j +": " + arregloA[j]);
        }*/


        /*boolean creciente = false;
        boolean decreciente = false;
        for(int i = 0;i < arregloA.length-1; i++){
            if( arregloA[i] < arregloA[i+1]){
                creciente = true;
            }
            if(arregloA[i]> arregloA[i+1]){
                decreciente = true;
            }
        }
        if(creciente = true && decreciente == false){
            System.out.println("Es creciente");
        }
        else if(creciente = false && decreciente == true){
                System.out.println("Es decreciente");
            }
        else if(creciente = true && decreciente == true){
            System.out.println("Esta desordenado");
        }
        else if(creciente = false && decreciente == false){
            System.out.println("Es igual");
        }


        /*int arregloB[] = {15,25,35,45,55,65};
        int arregloC[]= new int[arregloA.length + arregloB.length];
        int j=0;
        for(int i =0; i < arregloA.length;i++){
            arregloC[j] = arregloA[i];
            j++;
            arregloC[j]= arregloB[i];
            j++;
        }
        for(int a : arregloC){
            System.out.println(a);
        }



       /* String[] palabras = {"Ruiz","Carmona","Gonzalez","Segovia","Luciano"};

        palabras[0] = "Hola";
        palabras[1] = "Chau";
        palabras[2] = "Meli";
        palabras[3] = "Bienvenido";
        palabras[4] = "Te esperabamos";

        for(String i: palabras){
            if(i =="Bienvenido") {
                System.out.println("Palabra: " + i);
            }
        }

        int maximo =0;
        int promedio = 0;
        int suma = 0;
        System.out.println("Digite 5 elementos");
        int elementos[]= new int[5];
        for(int i = 0; i < 5; i++){
            elementos[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1 +". Digite un elemento"));
        }

        for(int i: elementos){
            if(i > maximo){
                maximo = i;

            }
            suma +=i;
            System.out.println("Elemento: " + i);
        }
        promedio = suma / elementos.length;
        System.out.println("La suma es:" + suma);
        System.out.println("El promedio es:" + promedio);
        System.out.println("El maximo es: " + maximo);*/
       /* int nelementos =0;
        nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos para el arreglo"));

        int [] elementos = new int[nelementos];

        System.out.println("Digite los elementos del arreglo");
        for(int i = 0; i < nelementos;i++){
           elementos[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1 + ". Digite un elemento"));
        }

        for(int i = 0; i < elementos.length; i++){
            System.out.println(elementos[i]);
        }*/
    }
}
