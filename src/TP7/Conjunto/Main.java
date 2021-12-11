package TP7.Conjunto;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListaNumeros list = new ListaNumeros();

        System.out.println(list.pertenece(4));
        System.out.println(list.pertenece(8));

        List<Object> listaObj = new LinkedList<Object>();
        ListaObject lista2 = new ListaObject(listaObj);

        Object objeto1 = new Object();
        Object objeto2 = new Object();

        lista2.agregar(objeto1);

        System.out.println(lista2.pertenece(objeto1));

        System.out.println(lista2.pertenece(objeto2));
    }
}
