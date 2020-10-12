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
    }
    
    
    //FALTA DOCUMENTAR
    public void contratarnormal(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "normal de Yutube", tipoSuscripcion, contratador, new NormalYutube());
    }
    
    //FALTA DOCUMENTAR
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


