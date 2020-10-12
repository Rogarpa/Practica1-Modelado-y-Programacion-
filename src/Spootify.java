
package src; 
import src.*; 
import java.util.List;
public class Spootify extends Suscripcion{
    
    /**
    *Método que se encarga cuando un usuario contrata un plan
    *normal de Spootify.
    *@param contratador el usuario que contrata el plan.
    */
    public void contratarnormal(Usuario contratador){
    }
    
    /**
    *Metodo que se encarga cuando un usuario contrata un plan
    *premium de Spootify
    *@param contratador
    */
    public void contratarpremium(Usuario contratador){
    }
    
    @Override
    public void enviarRecomendaciones(){
        sugerencias = new String[5];
        sugerencias[0]="Un viaje al pasado,escucha Top hits 2012.";
        sugerencias[1]="Escuchado recientemente:Twenty One Pilots.";
        sugerencias[2]="Podcast Nuevo:Asesinos Seriales.";
        sugerencias[3]="Octubre comienza y nos resignamos escucha en Podcast: Sectas.";
        sugerencias[4]="Preparamos tu Daily Mix:Daily Mix 3.";
    }
    
    @Override
    public void cobrar(){
    }
    
    @Override
    public void dejarContratar(Usuario  usuarioADescontratar){
    }
    
}
