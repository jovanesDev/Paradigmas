package TP3;

public class Matematica {


    public static int sumar (int numero1 , int numero2) {

        return  numero1 + numero2;
    }

    public static int multiplicar (int numero1 , int numero2) {

        return  numero1 * numero2;
    }

    public static Multiplicador dameMultiplicador (int param) {

        Multiplicador multiplicador = new Multiplicador(param);

        return  multiplicador;
    }
}
