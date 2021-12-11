package TP6.Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainSortingTP6 {
    public static void main(String[] args){

        //**-- Lista de personas --**
        List<Ordenable> personas = new ArrayList<Ordenable>();

        personas.add(new Persona(19063187));
        personas.add(new Persona(19066144));
        personas.add(new Persona(33504321));

        for(Ordenable p : personas){
            Persona persona = (Persona) p;
            System.out.println(persona.getDni());
        }

        System.out.println("______________________________");

        for(int i = 0; i < personas.size(); i++){
            for(int j = 0; j < personas.size(); j++){
                if(personas.get(i).esMayor(personas.get(j))){
                    Ordenable temp = personas.get(j);
                    personas.set(j, personas.get(i));
                    personas.set(i, temp);
                }
            }
        }


        for(Ordenable p : personas){
            Persona persona = (Persona) p;
            System.out.println(persona.getDni());
        }
        System.out.println("______________________________");


        //**-- Lista de numeros --**


        List<Ordenable> numeros = new ArrayList<Ordenable>();

        numeros.add(new Numero(50));
        numeros.add(new Numero(5));
        numeros.add(new Numero(90));
        numeros.add(new Numero(2));

        System.out.println("DESORDENADO");
        for(Ordenable o : numeros){
            Numero n = (Numero) o;
            System.out.println(n.num);
        }

        System.out.println("______________________________");

        for(int i = 0; i < numeros.size(); i++){
            for(int j = 0; j < numeros.size(); j++){
                if(numeros.get(i).esMayor(numeros.get(j))){
                    Ordenable temp = numeros.get(j);
                    numeros.set(j, numeros.get(i));
                    numeros.set(i, temp);
                }if(((Numero)numeros.get(i)).esIgual(numeros.get(j))){
                    Ordenable temp2 = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, temp2);
                }
            }
        }
        System.out.println("ORDENADO");
        for(Ordenable o : numeros){
            Numero n = (Numero) o;
            System.out.println(n.num);
        }
        System.out.println("______________________________");
        System.out.println();

        int[] nums = dameArrayAleatorio(20, false);

        System.out.println("Array Desordenado: ");
        for(int i = 0; i< nums.length; i++){
            if(i < nums.length-1){
                System.out.print(nums[i] + " , ");
            }else{
                System.out.print(nums[i]);
            }
        }
        bubbleSort(nums);
    }
    //BUBBLE SORT
    public static void bubbleSort(int[] array){
        boolean desordenado = true;
        boolean permuto;
        int valor;

        System.out.println();
        System.out.println("______________________________");

        while(desordenado){
            //ORDENAMOS
            permuto = false;
            for(int i = 1; i < array.length; i++){
                if(array[i] < array[i-1]){ //Revisa si el valor de la izquierda es mayor al de la derecha
                    valor = array[i-1];
                    array[i-1] = array[i];
                    array[i] = valor;
                    permuto = true;
                }
            }
            if(permuto == false) break;
        }

        System.out.println("\n\nBUBBLE SORT: ");
        for(int i = 0; i < array.length; i++){
            if(i < array.length-1){
                System.out.print(array[i] + " , ");
            }else{
                System.out.print(array[i]);
            }
        }

    }

    //ARRAYS ALEATORIOS
    public static int[] dameArrayAleatorio(int tam, boolean ord){
        Random rand = new Random();

        //Creacion de array
        int[] array = new int[tam];

        int num, manera_orden;

        if(ord){
            manera_orden = rand.nextInt(3);
            for(int i = 0; i < tam; i++){

                if(manera_orden == 0){
                    array[i] = (i + 1);
                }else if(manera_orden == 1){
                    array[i] = (i + 2) * 2;
                }else{
                    array[i] = (i + 3) * 3;
                }
            }
            return array;
        }else{
            for(int i = 0; i < tam; i++){
                num = rand.nextInt(1000000);
                array[i] = num;
            }
            return array;
        }
    }
}
