package TP6.vehiculos;

public class Avion extends Vehiculo implements Volador {

    @Override
    public void volar() {
        System.out.println("Soy avion y estoy volando");
    }
}
