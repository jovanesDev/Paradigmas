package TP6.Animales;

public class MainAnimalesTP6 {

    public static void main(String[] args){
        Leon leon = new Leon("Mufasa");
        Aguila aguila = new Aguila("Zazu");
        Delfin delfin = new Delfin("Flipper");
        Ballena ballena = new Ballena("Mobidic");

        Animal[] animales = {leon, aguila, delfin, ballena};
        Acuatico[] acuaticos = Animal.dameAcuatico(animales);

        for(Acuatico acuatico: acuaticos){
            System.out.println("Soy acuatico ya que " + acuatico.getClass());
        }

        Animal.showDeAnimales(animales);
    }

}
