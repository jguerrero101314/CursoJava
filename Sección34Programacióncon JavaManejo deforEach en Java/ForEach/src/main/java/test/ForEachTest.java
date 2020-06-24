package test;

import entidad.Persona;

public class ForEachTest {
    public static void main(String[] args) {
        int edades[] = {15, 20, 41, 50};
        for(int edad : edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Karla")};
        
        System.out.println("");
        for(Persona p : personas){
            System.out.println("p = " + p);
        }
        
    }
}
