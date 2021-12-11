package TP4;

public class C extends B {
    public C(int numero) {
        super(numero);
        System.out.println("estoy imprimiendo vacio el C");
        System.out.println("esto es el numero que herede del B" + " " + numero);
    }

    @Override
    public void hola() {
        super.hola();
        System.out.println("C.hola");
    }
}
