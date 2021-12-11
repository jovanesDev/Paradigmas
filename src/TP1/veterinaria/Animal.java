package TP1.veterinaria;

public class Animal {
    protected String especie;
    protected float peso;
    protected String nombre;

    public Animal(String especie, float peso, String nombre){
        this.especie = especie;
        this.peso = peso;
        this.nombre = nombre;
    }

    public void descripcionAnimal () {
        System.out.println("El animal " + this.nombre + "tiene especie " + especie + "con un peso total de " + this.peso );
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer (Alimento alimento) {

        if(alimento.getEspecie().equalsIgnoreCase(this.especie)){
            this.peso = this.peso + alimento.getPeso();
        }
    }
}
