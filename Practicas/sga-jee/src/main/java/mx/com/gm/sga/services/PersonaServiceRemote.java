
package mx.com.gm.sga.services;

import java.util.*;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Persona;

@Remote
public interface PersonaServiceRemote {
    public List<Persona> listarPersonas();
    public Persona econtrarPersonaPorId(Persona persona);
    public Persona econtrarPersonaPorEmail(Persona persona);
    public void registrarPersona(Persona persona);
    public void modificarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
    
}
