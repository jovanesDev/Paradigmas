package TP6.Tareas;

public class MainTareasTP6 {

    public static void main(String[] args){

        String cadenaChar = "Soy una cadena de caracteres";
        ProcesoUno tarea1 = new ProcesoUno("printString", cadenaChar);
        tarea1.ejecutar();

        int[] numeros = {1, 2, 3, 4, 5};
        ProcesoDos tarea2 = new ProcesoDos("Algebra", numeros);
        tarea2.ejecutar();

        ProcesoTres tarea3 = new ProcesoTres("Globalico");
        tarea3.ejecutar();

    }

}
