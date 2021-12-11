package TP8.primos;

import java.util.Map;
import java.util.TreeMap;

public class CalcPrimos {

    protected Map<Integer,Boolean> numerosPrimos = new TreeMap<Integer,Boolean>();

    protected boolean esPrimo(int n){

        //--Si el n ya fue calculado antes
        if(numerosPrimos.containsKey(n)){
            return numerosPrimos.get(n);
        }

        int cont = 0;

        for(int i = 2; i < n-1; i++){
            if(n % i == 0){
                cont++;
            }
        }

        if(cont == 0){
            numerosPrimos.put(n, true);
            return true;
        }else{
            return false;
        }
    }

    protected void primosConocidos(){
        for(Map.Entry<Integer,Boolean> n : numerosPrimos.entrySet()){
            int key = n.getKey();
            System.out.println("Numero Primo: " + key);
        }
    }
}
