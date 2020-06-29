
package com.gm.mundopc;


public class Monitor {
    
    private final int idMotitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    
    private Monitor(){
        this.idMotitor = ++contadorMonitores;
    }
    public Monitor( String marca, double tamano){
           this();
           this.marca = marca;
           this.tamano = tamano;
    }

    public int getIdMotitor() {
        return this.idMotitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return this.tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMotitor=" + idMotitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }

    
}
