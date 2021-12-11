package TP3;

import TP3.Auto.Auto;
import TP3.Auto.FabricaDeAutos;

public class TP3Main {

    public static void main(String[] args) {

        System.out.println("__________________________");

        FabricaDeAutos toyota = new FabricaDeAutos("mercedez");
        FabricaDeAutos.setYear(2012);

        FabricaDeAutos bmw = new FabricaDeAutos("bmw");
        bmw.fabricarAuto("750i");
        toyota.fabricarAuto("yaris");
        System.out.println(toyota.fabricarAuto("yaris"));
        System.out.println(bmw.fabricarAuto("750i"));

        System.out.println("__________________________");

        System.out.println(Matematica.sumar(1,2));
        System.out.println( Matematica.multiplicar(2,2));

        Multiplicador multi = new Multiplicador(8);

        System.out.println( multi.multiplicar(5));

        System.out.println(Matematica.dameMultiplicador(5));

        System.out.println("__________________________");

        Futbolista messi = new Futbolista("Messi","PSG",10);
        Futbolista ronaldo = new Futbolista("Ronaldo","MU",9);
        Futbolista tevez = new Futbolista("Tevez","Boca",6);

        ronaldo.anotarGol();
        ronaldo.anotarGol();
        System.out.println(Futbolista.maximoGoleador);

        System.out.println("__________________________");



    }
}
