package TP4.animal;

public class Pato  extends  Animal{

    public Pato(String nombre) {
        super(nombre, "pajarito");
    }

    @Override
  public void hacerRuido() {
        System.out.println("CUA CUA");
    }

    @Override
    public void describir() {
        super.describir();
    }
}
