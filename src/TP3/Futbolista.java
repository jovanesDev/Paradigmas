package TP3;

public class Futbolista {
   private  String nombre;
   private String equipo;
   private int goles;
   public static int cantidadJugadores = 0;
   public static Futbolista maximoGoleador;
   public static Futbolista[] generalFutbolistas = new Futbolista[3];

    public Futbolista(String nombre, String equipo, int goles) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.goles = goles;
        generalFutbolistas[cantidadJugadores] = this;
        cantidadJugadores++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getGoles() {
        return goles;
    }


    public void anotarGol () {
        this.goles++;
        setearMaximoJugador();
    }

    public static void setearMaximoJugador () {
        maximoGoleador = generalFutbolistas[0];
        if(generalFutbolistas[1] == null){
            return;
        }
            for(int i = 0; i < generalFutbolistas.length -1 ; i++ ){

                if(maximoGoleador.getGoles() < generalFutbolistas[i].getGoles()){
                    maximoGoleador = generalFutbolistas[i];
                }
            }

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
