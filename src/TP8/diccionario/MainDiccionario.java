package TP8.diccionario;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainDiccionario {

    public static void main(String[] args) {

        String oracion = " al presidente le gusta comer fruta ";

        String[] p = oracion.split(" ");
        Map<String, String> diccionary = new LinkedHashMap<String, String>();

        diccionary.put("comer", "Tomar alimento por la boca, en especial un alimento sólido, masticándolo y tragándolo para que pase al estómago.");
        diccionary.put("fruta", "Fruto comestible de ciertas plantas y árboles, en especial cuando tiene mucha agua y es de sabor dulce.");
        diccionary.put("presidente", "Persona que preside o dirige un gobierno, una reunión, una empresa, un tribunal, etc.");

        definicion(p,diccionary);
    }

    public static void definicion(String[] palabras, Map<String, String> definiciones){
        for(String p : palabras){
            if(definiciones.containsKey(p)){
                System.out.println(p + ": " + definiciones.get(p));
            }
        }
    }

}
