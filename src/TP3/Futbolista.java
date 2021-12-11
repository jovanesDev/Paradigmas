package TP3;

public class Futbolista {
   private  String nombre;
   private final String equipo;
   private int goles;
   public static Futbolista maximoGoleador;

    public Futbolista(String nombre, String equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getGoles() {
        return goles;
    }


    public void anotarGol () {

        this.goles++;
        setearMaximoJugador();
    }

    public void setearMaximoJugador() {
        if(maximoGoleador == null){
            maximoGoleador = this;
        }
        if(this.getGoles() > maximoGoleador.getGoles()) maximoGoleador = this;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", goles=" + goles +
                '}';
    }
}
