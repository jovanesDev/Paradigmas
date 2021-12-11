package TP5.equals_protected;

import java.util.Objects;

public class Animal {

    protected String especie;
    protected int peso;
    private static int count;

    public Animal(String especie, int peso) {
        this.especie = especie;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void alimentar (int peso) {
        this.count ++;
        this.peso  = this.peso + peso;
        System.out.println(" se alimento" + " " + this.count + " " + " veces");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return peso == animal.peso && especie.equals(animal.especie);
    }

}
