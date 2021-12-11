package TP7.ColaDeBanco;

import java.util.*;

public class Persona {
    protected int dni;
    protected String nombre;
    protected int edad;

    public String getNombre(){
        return this.nombre;
    }

    protected void mismaPersona(Persona persona){
        if(equals(persona)){
            System.out.println("Son la misma persona");
        }else{
            System.out.println("Distintas personas");
        }
    }

    public boolean equals(Persona persona) {
        if(this.dni == persona.dni){
            return true;
        }else{
            return false;
        }
    }

    //--TO STRING
    @Override
    public String toString() {
        return nombre;
    }
}
