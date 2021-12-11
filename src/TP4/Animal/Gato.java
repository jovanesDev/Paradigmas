package TP4.Animal;

public class Gato extends Animal {



    public Gato(String nombre) {
        super(nombre, "perro");
    }

    @Override
  public   void hacerRuido() {
        System.out.println("MIAU MIAU ");
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("MIAU MIAU ");
    }
}
