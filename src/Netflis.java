
package src; 
import src.*; 
public class Netflis extends Suscripcion{
    
    /**
    *Método que se encarga cuando un usuario contrata el plan
    *para una sola pantalla de Netflis
    *@param contratador el usuario que contrata el Servicio.
    *
    */
    public void contratarUnaPantalla(Usuario contratador){
    }
    
    /**
    *Método que se encarga cuando un usuario contrata el plan
    *con dos pantallas de Netflis.
    *@param contratador el usuario que contrata el servicio.
    */
    public void contratarDosPantallas(Usuario contratador){
    }
    
    /**
    *Metodo que se encarga cuando un usuario contrata el plan
    *para tres pantallas de Netflis.
    *@param contratador el usuario que contrata el servicio.
    */
    public void contratarTresPantallas(Usuario contratador){
    }
    
    /**
    *Constructor de la clase Netflis, para dar recomendaciones a los usuarios.
    */
    public Netflis(){
        
        
        sugerencias = new String[5];
        sugerencias[0]="Agregado recientemente en Accion y Aventura:Star Wars:Clone Wars.";
        sugerencias[1]="No sabes qué ver, prueba Una película de huevos.";
        sugerencias[2]="Prueba nuestro catalogo de Comedia.";
        sugerencias[3]="Nosotros los Nobles en Comedia.";
        sugerencias[4]="Prueba la nueva función de Shuffle,por si te aburriste.";
        
    }
    
    @Override
    public void enviarRecomendaciones(){
        sugerencias = new String[5];
        sugerencias[0]="Agregado recientemente en Accion y Aventura:Star Wars:Clone Wars.";
        sugerencias[1]="No sabes qué ver, prueba Una película de huevos.";
        sugerencias[2]="Prueba nuestro catalogo de Comedia.";
        sugerencias[3]="Nosotros los Nobles en Comedia.";
        sugerencias[4]="Prueba la nueva función de Shuffle,por si te aburriste.";
    }
    
    
    @Override
    public void cobrar(){
    }
    
    @Override
    public void dejarContratar(Usuario  usuarioADescontratar){
    }
    
}
