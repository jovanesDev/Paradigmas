package TP7.ArraySorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {8, 0, 2, 3};

        java.util.Arrays.sort(numeros);

        for(int n : numeros){
            System.out.println(n);
        }

        java.util.Arrays.asList(numeros);
        System.out.println("_________________________________");

        List<Integer> listofNumbers = new ArrayList<Integer>();

        listofNumbers.add(5);
        listofNumbers.add(4);
        listofNumbers.add(3);
        listofNumbers.add(2);

        java.util.Collections.sort(listofNumbers);

        for(int n : listofNumbers){
            System.out.println(n);
        }

        listofNumbers.toArray();
    }
}
