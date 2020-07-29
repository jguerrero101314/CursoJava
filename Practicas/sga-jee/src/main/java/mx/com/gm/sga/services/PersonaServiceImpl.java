package mx.com.gm.sga.services;

import java.util.*;
import javax.ejb.Stateless;
import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Joel", "Guerrero", "jguerrero@hotmail.com", "6303-3932"));
        personas.add(new Persona(2, "Jose", "Guerra", "jguera@hotmail.com", "6453-3242"));

        return personas;
    }

    @Override
    public Persona econtrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona econtrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {

    }

    @Override
    public void modificarPersona(Persona persona) {

    }

    @Override
    public void eliminarPersona(Persona persona) {

    }

}
