package examen.clinica;

public class Main {

    public static void main(String[] args) {

        //Medico cirujano = new Medico(12345678,"Sergio",880965,"cirujano");
        Medico clinica  = new Medico(65087652,"Carlos",776542,"clinica");

        Paciente paciente = new Paciente(33245678,"Ricardo",921,"Swis Medical");

        try{
            paciente.setMedicoCabecera(clinica);
            // este medico tiene la especialidad incopatible con el paciente
            //paciente.setMedicoCabecera(cirujano);
        }catch (Exception err) {
            System.out.println(err.getMessage());
        }


    }
}
