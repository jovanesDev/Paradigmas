package TP9.heap;
public class Heap2 {
    public static void main(String[] args) {
        infinteObject();
    }

    public static Heap cadenaDeObjetos() {
        Heap myObject = new Heap("Mi objeto");
        while (true) {
            for (int i = 0; i < 1000000; i++) {
                for (int j = 0; j < 1000000; j++) {
                    Heap nuevoObjeto = new Heap("Nuevo objeto");
                    nuevoObjeto.objUnion = myObject;
                    myObject = nuevoObjeto;
                    //OutOfMemoryError al crear objetos y encadenarlos entre si de manera
                    // que el GC no los pueda borrar

                }
            }
            return myObject;
        }
    }

    public static Object infinteObject() {
        Object newObject = null;
        while (true) {
            for (int i = 0; i < 1000000; i++) {
                for (int j = 0; j < 1000000; j++) {
                    newObject = new Object(); //Nunca se rompe por falta de memoria
                    System.out.println(newObject);
                }
            }
            return newObject;
        }
    }

}