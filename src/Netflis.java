package src; 
import src.*;
import java.util.LinkedList;
public class Netflis extends Suscripcion{

    String bienvenidoDeVuelta = "Bienvenido de vuelta a Netflis";
    String tipoSuscripcion = "Gracias por suscribirte al plan";
    String mensajecobro = "Se cobraron %d de el plan";
    String mensajeDespedida = "Lamentamos que dejes el servicio Netflis";
    
    public Netflis(){
        contratosActivos = new LinkedList<>();
        contratosPasivos = new LinkedList<>(); 
    }
    
    //FALTA DOCUMENTAR
    public void contratarUnaPantalla(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "una pantalla de Netflis", tipoSuscripcion, contratador, new UnaPantallaNetflis());
    }

    //FALTA DOCUMENTAR
    public void contratarDosPantallas(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "dos pantallas de Netflis", tipoSuscripcion, contratador, new DosPantallasNetflis());
    }

    //FALTA DOCUMENTAR
    public void contratarTresPantallas(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "tres pantallas de Netflis", tipoSuscripcion, contratador, new TresPantallasNetflis());
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
