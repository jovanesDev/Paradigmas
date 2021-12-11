package TP7.conjunto;


import java.util.List;

public class ListaObject implements Conjunto{

    protected List<Object> listaObject;

    public ListaObject(List<Object> listaObject){
        this.listaObject = listaObject;
    }

    public void agregar(Object objeto){
        listaObject.add(objeto);
    }

    public boolean pertenece (Object o){
        if(listaObject.contains(o)){
            return true;
        }else{
            return false;
        }
    }
}
