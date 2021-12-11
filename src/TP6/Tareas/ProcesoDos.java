package TP6.Tareas;

public class ProcesoDos extends Procesador implements Tarea {

    int[] listaNumero = new int[2];

    protected ProcesoDos (String nombreTarea, int[] listaNum){
        super(nombreTarea);
        this.listaNumero = listaNum;
    }

    @Override
    public void ejecutar() {
        for(int num : this.listaNumero){
            System.out.print(num*5 + " ");
        }
        System.out.println();
        for(int num : this.listaNumero){
            System.out.print(num+7 + " ");
        }
        System.out.println();
    }

    @Override
    public String getNombre() {
        return super.nombre;
    }
}
