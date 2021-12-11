package TP7.ColaDeBanco;

import java.util.*;

public class ColaDeBanco extends Persona{

    protected Deque<Persona> cola;

    public ColaDeBanco(Deque<Persona> cola){
        this.cola = cola;
    }

    //--MOSTRAR
    public void mostrar(){
        for(Persona p : cola){
            System.out.println("En la Cola: " + p.toString());
        }
    }

    //--AGREGAR
    protected void agregar(Persona persona){
        if(persona.edad >= 60){
            System.out.println(persona.nombre + " por ser mayor puede ponerse al principio de la cola");
            cola.addFirst(persona);
        }else{
            cola.addLast(persona);
            System.out.println(persona.getNombre() + " se suma a la cola");
        }

    }

    //--ATENDER
    protected Persona atender(){
        if(cola.peek() != null){
            System.out.println("Fue atendido/a: " + cola.peek());
            return cola.poll();
        }else{
            System.out.println("No hay nadie en la cola para atender");
        }
        return null;
    }
}
