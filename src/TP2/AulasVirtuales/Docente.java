package TP2.AulasVirtuales;

public class Docente extends Persona {
    protected String materia;

    public Docente(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "materia='" + materia + '\'' +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}
