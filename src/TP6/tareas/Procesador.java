package TP6.tareas;

public abstract class Procesador {

    protected String nombre;
    protected static String global = "Soy global !!";

    protected Procesador(String nombre) {
        this.nombre = nombre;
    }

    protected void procesarBatch(Tarea[] listaTareas) {

    }
}
