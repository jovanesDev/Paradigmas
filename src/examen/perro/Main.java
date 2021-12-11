package examen.perro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Perro first  = new Perro("Lady",7);
        Perro second = new Perro("Ralf",2);
        Perro third = new Perro("Rex",10);

        Map<String,Perro> propetary = new HashMap<>();

        propetary.put("Miguel",first);
        propetary.put("Stefanie",second);
        propetary.put("Tony",third);

        System.out.println(propetary);


        Set<Perro> myDogs = new HashSet<>();

        myDogs.add(first);
        myDogs.add(second);
        myDogs.add(third);

        System.out.println(myDogs);

        Set<Perro> dogsName = new TreeSet<>();

        dogsName.add(first);
        dogsName.add(second);
        dogsName.add(third);

        System.out.println(dogsName);

        Set<Perro> dogsPulgas = new TreeSet<>(new Comparator<Perro>() {
            @Override
            public int compare(Perro o1, Perro o2) {
               return o1.getCantPulgas() - o2.getCantPulgas();
            }
        });

        dogsPulgas.add(first);
        dogsPulgas.add(second);
        dogsPulgas.add(third);

        System.out.println(dogsPulgas);

    }
}
