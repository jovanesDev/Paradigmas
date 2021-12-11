package TP8.carrito_compras;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainCarrito {

    public static void main(String[] args) {

        //** CARRITO 1 **
        Map<Product, Integer> carrito = new HashMap<Product, Integer>();

        Product bebida = new Product("Pepsi", 771);
        Product pan_blanco = new Product("Lacteo", 431);
        Product papas = new Product("Lays", 91);

        carrito.put(bebida, 5);
        carrito.put(pan_blanco, 3);
        carrito.put(papas, 2);
        carrito.put(bebida, 4);

        System.out.println(carrito);

        //** CARRITO 2 **
        Map<Product, Integer> carrito2 = new TreeMap<>();

        carrito2.put(bebida, 2);
        carrito2.put(pan_blanco, 4);
        carrito2.put(papas, 9);

        System.out.println(carrito2);
    }
}
