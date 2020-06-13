public class Caja {
    
    public int ancho;
    public int alto;
    public int profundo;
    
    public Caja(){
        System.out.println("Constructor vacio");
    }
    
    public Caja( int ancho, int alto, int profundo){
        System.out.println("Constructor con argumentos");
        
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumenCaja(){ 
        return this.ancho * this.alto * this.profundo;
      
    }
    
}
