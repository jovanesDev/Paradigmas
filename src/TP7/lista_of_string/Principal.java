package TP7.lista_of_string;

import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args){

        List<String> list = new LinkedList<String>();

        list.add("Nicolas");
        list.add("Micaela");
        list.add("Lucia");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println();

        for(String nombre : list){
            System.out.println(nombre);
        }
        System.out.println();

        list.set(0, "Micaela");
        list.set(1, "Polina");
        list.set(2, "Gregor");

        list.remove(2);

        list.add("Micaela");
        list.remove("Micaela");

        for(String nombre : list){
            System.out.println(nombre);
        }

        System.out.println(list.contains("Polina"));

        borrarTodo(list, "Gregor");


    }

    public static void borrarTodo(List<String> lista, String nombre){
        if(lista.contains(nombre)){
            lista.remove(nombre);
        }else{
            System.out.println("no existe");
        }
        System.out.println();
        for(String persona : lista){
            System.out.println(persona);
        }
    }
}
