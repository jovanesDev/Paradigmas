package TP2.salud;

public class Cirujano extends Medico {

    protected String especialidadCirujano;

    public Cirujano(String id, String nombre, long dni, String hospital, long matricula, String especializacion, String especialidadCirujano) {
        super(id, nombre, dni, hospital, matricula, especializacion);
        this.especialidadCirujano = especialidadCirujano;
    }

    public String getEspecialidadCirujano() {
        return especialidadCirujano;
    }

    public void setEspecialidadCirujano(String especialidadCirujano) {
        this.especialidadCirujano = especialidadCirujano;
    }
}
