package TP10.error;

public class Main {
    public static void main(String[] args) {
        int limit = 1;
        int[] array = new int[limit];

        try{
            for (int i = 0; i < limit; i++) {
                 array = new int[limit];
                 array[i] = i;
                 limit *= 10;
            }

        }catch (OutOfMemoryError err){
            System.out.println("Ultima posicion exitosa del array es" + " " + array.length );
            System.out.println(err.getMessage());
        }


    }
}
