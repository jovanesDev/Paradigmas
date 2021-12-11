package TP6.Tareas;

public class ProcesoTres extends Procesador implements Tarea {

    protected ProcesoTres(String nombre){
        super(nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(super.global = "Modificamos  global");
    }

    @Override
    public String getNombre() {
        return super.global;
    }
}
