package TP6.vehiculos;

public class Helicoptero extends Vehiculo implements Volador {

    @Override
    public void volar() {
        System.out.println("Soy helicoptero y estoy volando");
    }
}
