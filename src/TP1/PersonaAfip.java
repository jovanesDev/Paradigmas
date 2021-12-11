package TP1;

public class PersonaAfip {

    protected int dni;
    protected String apellido;
    protected String nombre;
    protected int edad;

    PersonaAfip(){}

    @Override
    public String toString() {
        return "PersonaAfip{" +
                "dni=" + dni +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    PersonaAfip(int dni, String apellido, String nombre, int edad){

        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
