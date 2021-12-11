package TP2.Salud;

public class ProfesionalDeSalud {
    protected  String id ;
    protected  String nombre;
    protected  long dni ;
    protected  String hospital;

    public ProfesionalDeSalud(String id, String nombre, long dni, String hospital) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.hospital = hospital;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
