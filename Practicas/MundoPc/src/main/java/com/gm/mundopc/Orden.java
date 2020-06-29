
package com.gm.mundopc;


public class Orden {
    
    private  int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static  final int  MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    public void agregarComputadora(Computadora computadora){
       if( contadorComputadoras < MAX_COMPUTADORAS ){
            this.computadoras[this.contadorComputadoras++] = computadora;
       }else{
           System.out.println("Se ha superado el maximo de productos: " + MAX_COMPUTADORAS);
       }
    }
  /*  public double calcularTotal(){
        double total = 0;
        
        for (int i = 0; i < this.contadorComputadoras; i++) {
            Computadora computadora = this.computadoras[i];
            total += computadora.getPrecio();
        } 
        return total;
    }*/
    
    public void mostrarOrden(){
        System.out.println("Orden #:" + this.idOrden);
       // System.out.println("Total de la orden: $" + this.calcularTotal());
        System.out.println("Computadoras de la orden:");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            Computadora computadora = computadoras[i];
            System.out.println(computadora);
        }
    }
}
