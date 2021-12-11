package TP8.Primos;

public class MainPrimos {

    public static void main(String[] args) {

        int n1 = 54;
        int n2 = 1;
        int n3 = 44;
        int n4 = 11;
        int n5 = 3;
        int n6 = 17;

        CalcPrimos calculadora_P = new CalcPrimos();

        System.out.println(calculadora_P.esPrimo(n1));
        System.out.println(calculadora_P.esPrimo(n2));
        System.out.println(calculadora_P.esPrimo(n3));
        System.out.println(calculadora_P.esPrimo(n4));
        System.out.println(calculadora_P.esPrimo(n5));
        System.out.println(calculadora_P.esPrimo(n6));

        calculadora_P.primosConocidos();
    }
}
