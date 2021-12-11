package TP2;

import TP2.AulasVirtuales.Alumno;
import TP2.AulasVirtuales.Docente;
import TP2.AulasVirtuales.Materia;
import TP2.AulasVirtuales.Persona;

public class TP2Main {

    public static void main(String[] args) {

        //Moto harley = new Moto(250,"Harley",2);
        //Auto mercedes = new Auto("Mercedes",4,4);

        //System.out.println(harley);
        //System.out.println(mercedes);

        Docente Massera = new Docente("Martin","Programacion");
        Alumno Hovhannes = new Alumno(1,"Hovhannes");
        Alumno PIPI = new Alumno(2,"PIPI");

        Alumno[] alumnos = {Hovhannes,PIPI};

        Materia programacion = new Materia(Massera,alumnos);

        Persona[] todo = programacion.retornarTodo();

        for (Persona t:todo) {
            System.out.println(t);
        }
    }

}
