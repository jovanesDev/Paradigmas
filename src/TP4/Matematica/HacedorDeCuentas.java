package TP4.Matematica;

abstract public class HacedorDeCuentas {
     int n;
     
  public  HacedorDeCuentas(int param){
        this.n = param;
    }
    
    abstract public int hacerCuenta (int param);
    
}
