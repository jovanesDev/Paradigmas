package TP10.runtime_exceptions;

public class Main {

    public static void main(String[] args) {
        Integer data = null;
        Integer [] array = new Integer[5];

        try {
            data.doubleValue();
        }catch (NullPointerException err){
            System.out.println(err.getMessage());
            // retorna un NullPointerException
        }

        try {
            array[6] = 8;
        }catch (ArrayIndexOutOfBoundsException err){
            System.out.println(err.getMessage());
        }

    }
}
