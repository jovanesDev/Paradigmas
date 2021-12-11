package TP1;

import TP1.veterinaria.Alimento;
import TP1.veterinaria.Animal;

public class TP1Main {

    public static void main(String[] args) {

        //PersonaAfip personaAfip = new PersonaAfip(19063187,"Petrosyan","Hovhannes",25);
        //PersonaAfip personaAfip1 = new PersonaAfip();

        Animal simba = new Animal("leon",102f,"Simba");
        Animal pumba = new Animal("jabali",85f,"Pumba");
        Alimento carne = new Alimento("leon",20f);

        simba.comer(carne);
        System.out.println(simba.getPeso());
    }
}
