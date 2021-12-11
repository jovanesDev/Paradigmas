package TP2.salud;

public class Medico extends  ProfesionalDeSalud {

    protected  long matricula;
    protected  String especializacion;

    public Medico(String id, String nombre, long dni, String hospital, long matricula, String especializacion) {
        super(id, nombre, dni, hospital);
        this.matricula = matricula;
        this.especializacion = especializacion;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
