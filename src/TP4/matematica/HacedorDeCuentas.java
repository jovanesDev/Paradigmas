package TP4.matematica;

abstract public class HacedorDeCuentas {
     int n;
     
  public  HacedorDeCuentas(int param){
        this.n = param;
    }
    
    abstract public int hacerCuenta (int param);
    
}
