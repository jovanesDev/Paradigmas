package TP2;

public class Moto extends Vehiculo {
    protected int cilindrada;

    public Moto (int cilindrada,String nombre, int ruedas){

        super(nombre,ruedas);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada + '\'' +
                 "nombre=" + super.getNombre() + '\'' +
                "ruedas= " + super.getRuedas() + '\'' +
                '}';
    }
}
