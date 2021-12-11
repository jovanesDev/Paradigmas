package TP9.stack;
public class Stack2 {
    static long fibo;
    public static void main(String[] args) {
        long positionInFibo = fibo(1000000000L);
        System.out.println("La posicion del numero ingresado en Fibonacci es " + positionInFibo);
    }

    //StackOverFlowError
    public static long fibo(long n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            fibo = fibo(n - 1) + fibo(n - 2);
        }
        return fibo;
    }
}