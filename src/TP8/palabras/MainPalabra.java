package TP8.palabras;

import java.util.*;

public class MainPalabra {

    public static void main(String[] args) {

        String oracion = " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting,";

        System.out.println(devolver1(oracion));
        System.out.println(devolver2(oracion));
        devolver3(oracion);
    }

    public static Set<String> devolver1(String oracion){
        String[] palabras = oracion.split(" ");

        Set<String> noDuplicados = new HashSet<>(Arrays.asList(palabras));

        return noDuplicados;
    }

    public static Set<String> devolver2(String oracion){
        String[] palabras = oracion.split(" ");

        Set<String> ordenado = new LinkedHashSet<>(Arrays.asList(palabras));

        return ordenado;
    }

    public static void devolver3(String oracion) {
        String[] palabras = oracion.split(" ");
        String temp;
        boolean ultimoElemento = true;

        Map<String, Integer> palabras_repe = new LinkedHashMap<String, Integer>();

        for(int i = 0; i < palabras.length; i++){

            int cant_p = 0;
            temp = palabras[i];

            for(int j = 0; j < palabras.length; j++){
                if(temp.equals(palabras[j])){
                    cant_p++;
                }
            }

            palabras_repe.put(palabras[i], cant_p);
        }

        for(Map.Entry<String,Integer> p : palabras_repe.entrySet()){
            System.out.println(p);
        }

    }

}
