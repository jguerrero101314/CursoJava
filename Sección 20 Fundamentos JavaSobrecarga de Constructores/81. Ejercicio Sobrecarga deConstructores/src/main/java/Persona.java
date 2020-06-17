public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona(){
        //super(); se manda a llamar de manera automática
        this.idPersona = ++contadorPersonas;
    }
    
    //Copnstructor completo - sobrecarga
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
