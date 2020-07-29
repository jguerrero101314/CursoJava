
package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;


public class TestHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Iniciando el EJB desde el cliente");
         try{
            Context jdni =new InitialContext();
            HolaMundoEjbRemote holaMundoEjb = (HolaMundoEjbRemote) jdni.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEjb.sumar(5, 5);
             System.out.println("resultado = " + resultado);
        }catch(NamingException e){
            e.printStackTrace(System.out);
        }
       
    }
    
}
