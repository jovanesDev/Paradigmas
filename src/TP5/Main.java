package TP5;

import TP5.equals1.Album;
import TP5.equals2.Persona;
import TP5.equals_protected.Animal;
import TP5.equals_protected.Perro;

public class Main {
    public static void main(String[] args) {

        System.out.println("____________________________");
        System.out.println("equals 1");

        Album uno = new Album("Eminem","Music to be murdered");
        Album dos = new Album("Eminem","Music to be murdered");
        Album tres = new Album("Rihanna","Diamonds");

        System.out.println(uno.equals(dos));
        System.out.println(uno == dos);
        System.out.println(uno.equals(tres));

        System.out.println("____________________________");
        System.out.println("equals 2");

        Persona pUno = new Persona(19063187,true,"Hovhannes");
        Persona pDos = new Persona(19063187,true,"Eliana");

        System.out.println(pUno.equals(pDos));

        System.out.println("____________________________");
        System.out.println("equals protected");

        Animal animalUno = new Animal("Pajaro",43);
        Animal animalDos = new Animal("Pajaro",43);

        animalUno.alimentar(10);

        Perro jackie = new Perro("Mamifero",50,"Pitbull");
        Perro zeus = new Perro("Mamifero",50,"Caniche");

        System.out.println(jackie.equals(zeus));

    }
}
