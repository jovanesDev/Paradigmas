package TP6.Vehiculos;

public class Avion extends Vehiculo implements Volador {

    @Override
    public void volar() {
        System.out.println("Soy avion y estoy volando");
    }
}
