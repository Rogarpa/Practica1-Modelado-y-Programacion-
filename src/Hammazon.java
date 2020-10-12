package src;     
import src.*;
import java.util.LinkedList;
public class Hammazon extends Suscripcion{


    String bienvenidoDeVuelta = "Bienvenido de vuelta a Hammazon";
    String tipoSuscripcion = "Gracias por suscribirte al plan";
    String mensajecobro = "Se cobraron %d de el plan";
    String mensajeDespedida = "Lamentamos que dejes el servicio de Hammazon";
    
    public Hammazon(){
        contratosActivos = new LinkedList<>();
        contratosPasivos = new LinkedList<>(); 
        sugerencias = new String[6];
        sugerencias[0]="Hammazon";
        sugerencias[1]="Tiempo de Terror:Halloween Season 1.";
        sugerencias[2]="Agregado recientemente: Malcolm in the Middle Season 3.";
        sugerencias[3]="Un nuevo episodio cada semana:The Boys.";
        sugerencias[4]="Para los amantes del Terror:The Shinning.";
        sugerencias[5]="Agregados Recientemente:Carnival Row Season 1,La casa de papel.";
    }
    
    /**
    *Método que se encarga cuando un usuario contrata el plan
    *normal de Yutube.
    *@param contratador el usuario que contrata el plan.
    */

    public void contratarnormal(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "normal de Hammazon", tipoSuscripcion, contratador, new NormalHammazon());
    }
    
    /**
    *Método que se encarga cuando un usuario contrata el plan
    *premium de Yutube.
    *@param contratador el usuario que contrata el plan.
    */

    public void contratarpremium(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "premium de Hammazon", tipoSuscripcion, contratador, new PremiumHammazon());
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
