package TP6.Tareas;

public class ProcesoUno extends Procesador implements Tarea {

    protected String cadenaCaracteres;

    public ProcesoUno(String nombre, String cadenaCaracteres){
        super(nombre);
        this.cadenaCaracteres = cadenaCaracteres;
    }

    @Override
    public void ejecutar(){
        System.out.println(cadenaCaracteres);
    }

    @Override
    public String getNombre(){
        return super.nombre;
    }
}
