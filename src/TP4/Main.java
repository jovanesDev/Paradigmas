package TP4;

import TP4.animal.*;
import TP4.matematica.Exponenciador;

public class Main {

    public static void main(String[] args) {
        A a = new A(2);
        System.out.println("");
        B b = new B(4);
        System.out.println("");
        C c = new C(6);

        a.hola();
        System.out.println("");
        b.hola();
        System.out.println("");
        c.hola();

        Exponenciador po = new Exponenciador(2);

        System.out.println("");

        System.out.println( po.hacerCuenta(1));


        Animal animal1 = new Perro("Firulais");
        Chihuahua pepito  = new Chihuahua("pepito");
        Gato murzik = new Gato("murzik");
        Pato lucas = new Pato("Lucas");


        Animal [] todo = {animal1,pepito,murzik,lucas};
        System.out.println("");
        System.out.println("");
        escucharTodos(todo);
    }

    public static void escucharTodos (Animal[] array){

        for ( Animal a:
             array) {
           a.hacerRuido();
        }
    }

}
