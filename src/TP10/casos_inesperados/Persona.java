package TP10.casos_inesperados;

import java.util.HashMap;
import java.util.Map;

public class Persona {
    private int edad;
    private int dni;
    private String nombre;

    public static Map<Integer ,Persona> registro  = new HashMap<>();

    public Persona(int edad, int dni, String nombre) {
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
