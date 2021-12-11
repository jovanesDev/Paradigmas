package TP6.Animales;

public class Delfin  extends  Animal implements  Acuatico{

    public Delfin(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar(){
        System.out.println("Soy muy rapido  y inteligente");
    }

    @Override
    protected void describir(){
        System.out.println("Soy un Delfin");
    }


}
