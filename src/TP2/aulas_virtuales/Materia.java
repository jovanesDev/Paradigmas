package TP2.aulas_virtuales;

import java.util.Arrays;

public class Materia {

    protected Docente docente;
    protected Alumno[] alumnos;

    public Materia(Docente docente, Alumno[] alumnos) {
        this.docente = docente;
        this.alumnos = alumnos;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public Persona[] retornarTodo () {

        Persona [] todo = new Persona[alumnos.length + 1];
        todo[0] = docente;
        for (int i = 1; i < todo.length; i++) {

            todo[i] = alumnos[i - 1];
        }

         return todo;
    }


    @Override
    public String toString() {
        return "Materia{" +
                "docente=" + docente +
                ", alumnos=" + Arrays.toString(alumnos) +
                '}';
    }
}
