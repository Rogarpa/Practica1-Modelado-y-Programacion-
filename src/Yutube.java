
package src;
import src.*;
import java.util.LinkedList;
public class Yutube extends Suscripcion {
    
    String bienvenidoDeVuelta = "Bienvenido de vuelta a Yutube";
    String tipoSuscripcion = "Gracias por suscribirte al plan";
    String mensajecobro = "Se cobraron %d de el plan";
    String mensajeDespedida = "Lamentamos que dejes el servicio de Yutube";
    
    public Yutube(){
        contratosActivos = new LinkedList<>();
        contratosPasivos = new LinkedList<>(); 
        sugerencias = new String[6];
        sugerencias[0]="Yutube";
        sugerencias[1]="Ver a continuación:Destacados de la Semana.";
        sugerencias[2]="¿No tienes tiempo de ver tu video?.Agregalo a la sección Ver más tarde.";
        sugerencias[3]="Para ver a tus Yutuberos preferidos ve a Suscripciones.";
        sugerencias[4]="Revisa tu historial por si no terminaste de ver un video.";
        sugerencias[5]="Prueba memes para ver los videos aleatorios más recientes.";
    }
    
    
    /**
    *Método que se encarga cuando un usuario contrata el plan
    *normal de Yutube.
    *@param contratador el usuario que contrata el plan.
    */

    public void contratarnormal(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "normal de Yutube", tipoSuscripcion, contratador, new NormalYutube());
    }
    
    /**
    *Método que se encarga cuando un usuario contrata el plan
    *premium de Yutube.
    *@param contratador el usuario que contrata el plan.
    */
    public void contratarpremium(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "premium de Yutube", tipoSuscripcion, contratador, new PremiumYutube());
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


