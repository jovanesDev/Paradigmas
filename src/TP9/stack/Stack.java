package TP9.stack;

public class Stack {
    public int size;

    public int[] generateArray(int size) {
        return new int[size];
    }

    public int[] agregarValor(int posicion, int value) {
        int[] array = generateArray(10);
        array[posicion] = value;
        return array;
    }

    public void printArray() {
        int valor = 0;
        int[] array = agregarValor(10, valor);
        //error ArrayIndexOutOfBounds por querer agregar un valor en una posicion que no existe
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + size);
        }
    }
}

