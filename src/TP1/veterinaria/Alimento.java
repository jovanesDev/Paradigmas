package TP1.veterinaria;

public class Alimento {

    protected String especie;
    protected float peso;

    public Alimento(String especie, float peso) {
        this.especie = especie;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }



    @Override
    public String toString() {
        return "Alimento{" +
                "especie='" + especie + '\'' +
                ", peso=" + peso +
                '}';
    }
}
