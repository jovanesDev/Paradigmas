package TP4.Animal;

public class Perro extends Animal {


    public Perro(String nombre) {
        super(nombre, "perro");
    }

    @Override
  public void hacerRuido() {
        System.out.println("WOW WOW");
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("GUA GUA");
    }
}
