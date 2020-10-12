package src;
import src.*;
import java.util.LinkedList;
public class Twitsh extends Suscripcion{

    String bienvenidoDeVuelta = "Bienvenido de vuelta a Twitsh";
    String tipoSuscripcion = "Gracias por suscribirte al plan";
    String mensajecobro = "Se cobraron %d de el plan";
    String mensajeDespedida = "Lamentamos que dejes el servicio de Twitsh";

    /**
    *Constructor vacio de la clase.
    */
    public Twitsh(){
        contratosActivos = new LinkedList<>();
        contratosPasivos = new LinkedList<>();
        sugerencias = new String[5];
        sugerencias[0]="Como nuevo streamer tenemos a tripasecatime";
        sugerencias[1]="Prueba en la Sección de: Nuevos Streamers";
        sugerencias[2]="¿Empezando tu experiencia en Twitsh?.Prueba Aleatorios.";
        sugerencias[3]="Para ver lo que suben tus streamers favoritos:Ve a la sección notificaciones.";
        sugerencias[4]="¿No encuentras a tu streamer?Prueba en la pestaña Buscar";
    }

        /**
    *Método que se encarga cuando un usuario contrata el plan
    *normal de Twitsh.
    *@param contratador el usuario que lo contrata.
    */
    public void contratarnormal(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "normal de Twitsh", tipoSuscripcion, contratador, new NormalTwitsh());
    }

    /**
    *Método que se encarga cuando un usuario contrata el plan
    *premium de Twitsh.
    *@param contratador el usuario que lo contrata.
    */
    public void contratarpremium(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "premium de Twitsh", tipoSuscripcion, contratador, new PremiumTwitsh());
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
