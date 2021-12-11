package TP3;

public class Multiplicador {

    private int numero;

    public Multiplicador(int numero) {
        this.numero = numero;
    }

    public int multiplicar (int param) {

        return  numero * param;
    }

    @Override
    public String toString() {
        return "Multiplicador{" +
                "numero=" + numero +
                '}';
    }
}
