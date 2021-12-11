package TP6.animales;

import TP6.vehiculos.Volador;

public class Aguila extends  Animal implements Volador {

    public Aguila(String nombre) {
        super(nombre);
    }

    @Override
    protected void describir() {
        System.out.println("Soy una Aguila");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo muy alto y veo de lejos!");
    }
}
