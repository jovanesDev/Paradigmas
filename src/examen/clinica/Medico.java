package examen.clinica;

public class Medico extends Persona{
        private int matricula;
        private String especialidad;

    public Medico(int dni, String nombre, int matricula, String especialidad) {
        super(dni, nombre);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
