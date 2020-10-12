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
    }
    
    //FALTA DOCUMENTAR
    public void contratarnormal(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "normal de Hammazon", tipoSuscripcion, contratador, new NormalHammazon());
    }
    
    //FALTA DOCUMENTAR
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
