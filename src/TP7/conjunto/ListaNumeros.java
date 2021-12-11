package TP7.conjunto;

public class ListaNumeros implements Conjunto{

    public boolean pertenece (Object o){
        if(o instanceof Integer && ((Integer)o)%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
