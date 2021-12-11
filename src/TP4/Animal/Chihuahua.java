package TP4.Animal;

public class Chihuahua extends  Perro{
    public Chihuahua(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println("soy un chihuahua");
    }
}
