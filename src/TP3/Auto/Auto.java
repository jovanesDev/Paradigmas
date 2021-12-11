package TP3.Auto;

public class Auto {

   protected String marca ;
   protected String modelo;
   protected int yaer;


    Auto(String marca, String modelo, int yaer) {
      this.marca = marca;
      this.modelo = modelo;
      this.yaer = yaer;
   }


   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public int getYaer() {
      return yaer;
   }

   public void setYaer(int yaer) {
      this.yaer = yaer;
   }

   @Override
   public String toString() {
      return "Auto{" +
              "marca='" + marca + '\'' +
              ", modelo='" + modelo + '\'' +
              ", yaer=" + yaer +
              '}';
   }
}
