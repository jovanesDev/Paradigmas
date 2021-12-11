package TP7.cola_de_banco;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Persona> cola = new LinkedList<Persona>();

        ColaDeBanco colaBanco = new ColaDeBanco(cola);

        Persona nico = new Persona();
        nico.nombre = "Benjamin";
        nico.edad = 21;

        Persona lucia = new Persona();
        lucia.nombre = "Carlos";
        lucia.edad = 43;

        Persona mabel = new Persona();
        mabel.nombre = "Malena";
        mabel.edad = 66;

        colaBanco.agregar(nico);
        colaBanco.agregar(lucia);
        colaBanco.agregar(mabel);

        colaBanco.mostrar();

        colaBanco.atender();
        colaBanco.atender();
        colaBanco.atender();
        colaBanco.atender();

    }
}
