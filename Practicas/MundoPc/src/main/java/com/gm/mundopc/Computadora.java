package com.gm.mundopc;

public class Computadora {

    /**
     * Creamos las variables privadas
     */
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;

    /**
     * Creamos un constructor sin argumentos
     */
    private Computadora() {
        this.idComputadora = ++contadorComputadora;
    }

    /**
     * Creamos un constructor con argumentos
     * @param nombre aqui almacenamos el nombre
     */

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.nombre = nombre;
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComputadora() {
        return contadorComputadora;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

}
