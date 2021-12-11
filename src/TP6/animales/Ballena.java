package TP6.animales;

public class Ballena extends Animal implements Acuatico{

    public Ballena(String nombre){
        super(nombre);
    }

    @Override
    public void nadar(){
        System.out.println("Estoy nadando en Oceano Pacifico");
    }

    @Override
    protected void describir(){
        System.out.println("Soy una Mobidic");
    }


}
