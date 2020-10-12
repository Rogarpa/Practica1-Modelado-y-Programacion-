package src;    
import src.*;
import java.util.LinkedList;
public class Spootify extends Suscripcion{

    String bienvenidoDeVuelta = "Bienvenido de vuelta a Spootify";
    String tipoSuscripcion = "Gracias por suscribirte al plan";
    String mensajecobro = "Se cobraron %d de el plan";
    String mensajeDespedida = "Lamentamos que dejes el servicio Spootify";
    
    public Spootify(){
        contratosActivos = new LinkedList<>();
        contratosPasivos = new LinkedList<>(); 
        sugerencias = new String[5];
        sugerencias[0]="Un viaje al pasado,escucha Top hits 2012.";
        sugerencias[1]="Escuchado recientemente:Twenty One Pilots.";
        sugerencias[2]="Podcast Nuevo:Asesinos Seriales.";
        sugerencias[3]="Octubre comienza y nos resignamos escucha en Podcast: Sectas.";
        sugerencias[4]="Preparamos tu Daily Mix:Daily Mix 3.";
    }
    

    /**
    *Método que se encarga cuando un usuario contrata un plan
    *normal de Spootify.
    *@param contratador el usuario que contrata el plan.
    */
    public void contratarnormal(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "normal de Spootify", tipoSuscripcion, contratador, new NormalSpootify());
    }
    
    /**
    *Metodo que se encarga cuando un usuario contrata un plan
    *premium de Spootify
    *@param contratador
    */
    public void contratarpremium(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "premium de Spootify", tipoSuscripcion, contratador, new PremiumSpootify());
    }
    
    @Override
    public void cobrar(){
        super.cobrarAux(mensajecobro);
    }
    
    @Override
    public void dejarContratar(Usuario usuarioADescontratar){
    super.dejarContratarAux(usuarioADescontratar, this, mensajeDespedida);
    }
    
}
