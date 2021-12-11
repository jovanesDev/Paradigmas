package TP2;

public class Auto extends Vehiculo {
    protected int cantidadDePuertas;

    public Auto(String nombre, int ruedas, int cantidadDePuertas) {
        super(nombre, ruedas);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cantidadDePuertas=" + cantidadDePuertas +
                '}';
    }
}
