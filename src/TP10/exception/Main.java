package TP10.exception;

public class Main {
    public static void main(String[] args) throws Exception {
        int numero = -15;
        //noNegative(numero);
        // sin try y catch rompe el programa
        try{
            noNegative(numero);
        }catch (Exception err){
            System.out.println(err.getMessage());
        }

    }

    public static void noNegative (int numero) throws Exception{
        if(numero < 0){
            Exception negativo = new Exception("El numero no puede ser negativo");
            throw  negativo;
        }
    }
}


