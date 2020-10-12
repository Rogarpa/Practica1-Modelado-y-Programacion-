package src; 
import src.*;
import java.util.LinkedList;
public class Twitsh extends Suscripcion{
    
    String bienvenidoDeVuelta = "Bienvenido de vuelta a Twitsh";
    String tipoSuscripcion = "Gracias por suscribirte al plan";
    String mensajecobro = "Se cobraron %d de el plan";
    String mensajeDespedida = "Lamentamos que dejes el servicio de Twitsh";
    
    public Twitsh(){
        contratosActivos = new LinkedList<>();
        contratosPasivos = new LinkedList<>(); 
    }
    
    //FALTA DOCUMENTAR
    public void contratarnormal(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "normal de Twitsh", tipoSuscripcion, contratador, new NormalTwitsh());
    }
    
    //FALTA DOCUMENTAR
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
