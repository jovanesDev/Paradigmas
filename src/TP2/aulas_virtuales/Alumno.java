package TP2.aulas_virtuales;

public class Alumno extends Persona {

    protected int materiasCursando;

    public Alumno(int materiasCursando,String nombre) {
        super(nombre);

        this.materiasCursando = materiasCursando;
    }

    public int getMateriasCursando() {
        return materiasCursando;
    }

    public void setMateriasCursando(int materiasCursando) {
        this.materiasCursando = materiasCursando;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre =" + getNombre() +
                "materiasCursando=" + materiasCursando +
                '}';
    }
}
