package TP3.auto;

public class FabricaDeAutos {

    protected String marca;
    static int year;
    public FabricaDeAutos(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        FabricaDeAutos.year = year;
    }

    public Auto fabricarAuto (String modelo) {
        if(year == 0){
            System.out.println("Error");
            return null;
        }
        return  new Auto(this.marca,modelo,year);
    }
}
