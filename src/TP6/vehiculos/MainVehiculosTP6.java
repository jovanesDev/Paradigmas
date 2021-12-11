package TP6.vehiculos;

public class MainVehiculosTP6 {
    
    public static void main(String[] args) {

        Auto lamborgini = new Auto();
        Lancha titanic = new Lancha();

        Avion SU143 = new Avion();
        Helicoptero heli = new Helicoptero();

        Vehiculo vehiculo;

        vehiculo = lamborgini;
        vehiculo = titanic;
        vehiculo = SU143;
        //vehiculo = heli;

        if(vehiculo instanceof Volador){
            Volador voli = (Volador) vehiculo;
        }

        System.out.println(esVolador(vehiculo));
    }


    public  static boolean esVolador (Vehiculo vehiculo){

        return vehiculo instanceof Volador;
    }

    public static void hacerVolar (Vehiculo vehiculo) {

        if(esVolador(vehiculo)){
            Volador oo = (Volador) vehiculo;
            oo.volar();
        }else {
            System.out.println("este vehiculo no vuela ");
        }
    }
}
