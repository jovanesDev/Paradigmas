package examen.perro;

import java.util.Objects;

public class Perro implements Comparable{

    protected String nombre;
    protected int cantPulgas;

    public Perro(String nombre, int cantPulgas) {
        this.nombre = nombre;
        this.cantPulgas = cantPulgas;
    }

    public int getCantPulgas() {
        return cantPulgas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return cantPulgas == perro.cantPulgas && nombre.equals(perro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantPulgas);
    }

    @Override
    public int compareTo(Object o) {
        Perro dog = (Perro) o;
        return  nombre.compareTo(dog.nombre);
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", cantPulgas=" + cantPulgas +
                '}';
    }
}
