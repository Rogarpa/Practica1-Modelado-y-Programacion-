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
    }
    
    //FALTA DOCUMENTAR
    public void contratarnormal(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "normal de Spootify", tipoSuscripcion, contratador, new NormalSpootify());
    }
    
    //FALTA DOCUMENTAR
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
