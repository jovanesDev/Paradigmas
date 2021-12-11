package TP4.Matematica;

import TP4.Animal.Perro;

public class Exponenciador extends HacedorDeCuentas{

    public Exponenciador(int numero ) {
        super(numero);
    }

    @Override
    public int hacerCuenta(int param) {

        if(param == 0){
            return 1;
        }

        if(param == 1){
            return n;
        }

        int potencia = n;
        for(int i = 0 ; i < param -1; i++){

            potencia = (potencia * n);
        }
        return potencia;
    }

}
