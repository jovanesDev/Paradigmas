package TP6.Animales;

public class Leon extends Animal {

    public Leon(String nombre){
        super(nombre);
    }

    @Override
    protected void describir(){
        System.out.println("Soy un Leon");
    }
}
