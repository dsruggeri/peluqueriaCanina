
package dsr.peluqueriacanina.entidades;

import dsr.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String tipoAnimal, String raza, 
            String observaciones, String color, String alergico, 
            String atencionEspecial, String nombreDuenio, String celular, 
            String direccion) {
        
        Duenio duenio = new Duenio();
        
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celular);
        duenio.setDireccion(direccion);       
        
        
        Mascota mascota = new Mascota();
        
        mascota.setNombreMascota(nombreMascota);
        mascota.setTipoAnimal(tipoAnimal);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setAlergico(alergico);
        mascota.setObservaciones(observaciones);
        mascota.setDuenio(duenio);
        
        controlPersis.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        
            
       return controlPersis.traerMascotas();
        
        
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMascota, 
            String tipoAnimal, String raza, String observaciones, String color, 
            String alergico, String atencionEspecial, String nombreDuenio, 
            String celular, String direccion) {
        
        masco.setNombreMascota(nombreMascota);
        masco.setTipoAnimal(tipoAnimal);
        masco.setRaza(raza);
        masco.setObservaciones(observaciones);
        masco.setColor(color);      
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atencionEspecial);
        
        //modifico mascota
        controlPersis.modificarMascota(masco);
        
        //busco al duenio
        Duenio duenio = this.buscarDuenio(masco.getDuenio().getId()); 
        
        //modifico duenio
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celular);
        duenio.setDireccion(direccion);
        
        //llamo a modificar duienio
        //dentro de esta clase pero fuera de este método
        this.modificarDuenio(duenio);
                
        
    }

    private Duenio buscarDuenio(int id) {
        return controlPersis.traerDuenio(id);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }
    
    
    
}
