package TP2;

public class Vehiculo {
   protected String nombre;
    protected int ruedas;

    public Vehiculo(String nombre, int ruedas) {
        this.nombre = nombre;
        this.ruedas = ruedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", ruedas=" + ruedas +
                '}';
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
