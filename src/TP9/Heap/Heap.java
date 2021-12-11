package TP9.Heap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Heap {
    public Heap(String name) {
        this.nombre = name;
    }
    String nombre;
    Object objUnion;
    public static void main(String[] args) {
        Heap firstObj = new Heap("Casa");
        Heap secondObj = new Heap("Pistola");
        Heap thirdObj = new Heap("Barco");

        System.out.println("Objeto 1: " + firstObj.toString());
        System.out.println("Objeto 2: " + secondObj.toString());
        System.out.println("Objeto 3: " + thirdObj.toString());
        System.out.println("__________________________________");

        Heap myObject = firstObj;
        System.out.println("Mi Objeto: " + myObject.toString());
        Heap yourObject = firstObj;
        System.out.println("Tu Objeto: " + yourObject.toString());
        Heap suObject = firstObj;
        System.out.println("Su Objeto: " + suObject.toString());

        System.out.println();
        Heap theObject;
        theObject = firstObj;
        System.out.println("El objeto: " + theObject.toString());
        theObject = secondObj;
        System.out.println("El objeto: " + theObject.toString());
        theObject = thirdObj;
        System.out.println("El objeto: " + theObject.toString());

        Object o;
        o = new Object(); //Objeto que se llevara el GC.
        o = new Heap("GC");
        System.out.println(o);

        int countOfObjects = 0;
        System.out.println("\n1000 objetos permantentes (No se limpiara el GC)");
        System.out.println("_____________________________________________");
        System.out.println();
        while (countOfObjects < 1000) {
            o = new Object();
            List<Object> listaDeObjetos = new LinkedList<>();
            listaDeObjetos.add(o);
            countOfObjects++;
            System.out.println(countOfObjects + "" + listaDeObjetos);
        }
        countOfObjects = 0;
        while (countOfObjects < 1000) {
            o = new Object();
            countOfObjects++;
            System.gc();
        }


    }

    @Override
    public String toString() {
        return this.nombre;
    }

    List<Object> lista = new ArrayList<>();


}



