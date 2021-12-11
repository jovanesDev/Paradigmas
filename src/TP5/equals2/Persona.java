package TP5.equals2;

import java.util.Objects;

public class Persona {
    protected  int dni;
    protected  boolean sexo;
    protected  String nombre;

    public Persona(int dni, boolean sexo, String nombre) {
        this.dni = dni;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni && sexo == persona.sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", sexo=" + sexo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
