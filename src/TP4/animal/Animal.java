package TP4.animal;

abstract public class Animal {
    String nombre;
    String especie;

    public Animal(String nombre,String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    abstract public void hacerRuido ();
    public void  describir (){
        System.out.println("Animal.describir");
    };
}
