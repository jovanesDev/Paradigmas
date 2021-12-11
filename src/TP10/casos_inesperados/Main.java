package TP10.casos_inesperados;

import TP10.casos_inesperados.persona_exceptions.exceptions.PerosnaYaExiste;
import TP10.casos_inesperados.persona_exceptions.exceptions.PersonaMenorException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list_numbers = new ArrayList<Integer>();
        list_numbers.add(2);
        list_numbers.add(7);
        list_numbers.add(10);
        list_numbers.add(5);
        //list_numbers.add(12);
        //list_numbers.add(11);
        //list_numbers.add(15);

        // ------------------------------------------------
        // sacando el numero mayor a 10

        try{
            int f = biggerThanTen(list_numbers);
            System.out.println(f);
        }catch (RuntimeException err) {
            System.out.println(err.getMessage());
        }

        // ------------------------------------------
        // generando persona si cumple todos los requisitos

        try{
            //generatePerson(20,20,""); // esto atrapa al IllegalArgumentException
            //generatePerson(1,20,"Sergio"); // esto capta PersonaMenorException
            generatePerson(20,20,"Sergio");
            //generatePerson(20,20,"Sergio"); // esto capta PerosnaYaExiste
        }catch (Exception err) {
            System.out.println(err.getMessage());
        }

    }


    public static Integer biggerThanTen (List<Integer> list_numbers) throws RuntimeException {

        for ( Integer num: list_numbers
             ) {
                if(num > 10){
                   return  num;
                }
            }
        throw new RuntimeException("No hay numeros mayores a 10");
    }

    public static void generatePerson (int edad, int dni, String nombre) throws IllegalArgumentException,Exception {

        //if(edad <= 0 ) throw  new Exception ("edad no puede ser menor al 0");
        //if( dni <= 0  || dni > 99999999) throw new Exception ("el dni no puede ser menor a 0 o mayor a 99999999");
        //f(nombre == null || nombre == "") throw  new Exception("El nombre no puede ser vacio / null");

        if((edad <= 0) || (dni <= 0  || dni > 99999999) || (nombre == null || nombre == "") ) {
            throw  new IllegalArgumentException("Los Argumentos son incorrectos");
        }
        Persona person = new Persona(edad,dni,nombre);

        CheckValidationsBeforeToRegister(person);


        System.out.println(person);
    }


    public static void CheckValidationsBeforeToRegister (Persona person) throws PerosnaYaExiste, PersonaMenorException {
        if(Persona.registro.containsKey(person.getDni())){
            throw new PerosnaYaExiste("La persona que intenta crear ya esta registrado");
        }else if (person.getEdad() < 18) {
            throw new PersonaMenorException("La persona que intenta crear es menor de 18 ");
        }else {
            Persona.registro.put(person.getDni(),person);
        }


    }


}


