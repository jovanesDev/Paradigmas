package examen.clinica;

import examen.clinica.errors.EspecialidadIncorrectaException;

public class Paciente extends Persona {
    private int afiiliado;
    private String obraSocial;
    private  Medico medicoCabecera;

    public Paciente(int dni, String nombre, int afiiliado, String obraSocial) {
        super(dni, nombre);
        this.afiiliado = afiiliado;
        this.obraSocial = obraSocial;
    }

    public Medico getMedicoCabecera() {
        return medicoCabecera;
    }

    public void setMedicoCabecera(Medico medicoCabecera) throws EspecialidadIncorrectaException {
        if(medicoCabecera.getEspecialidad().equalsIgnoreCase("clinica")){
            this.medicoCabecera = medicoCabecera;
            System.out.println("El medico se asigno correctamente !");
            return;
        }
        throw new EspecialidadIncorrectaException("El medico que intenta asignar tiene la especialidad incopatible con el paciente");
    }
}
