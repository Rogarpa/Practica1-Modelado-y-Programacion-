
package src; 
import src.*; 
import java.util.LinkedList;
public class Netflis extends Suscripcion{

    String bienvenidoDeVuelta = "Bienvenido de vuelta a Netflis";
    String tipoSuscripcion = "Gracias por suscribirte al plan";
    String mensajecobro = "Se cobraron %d de el plan";
    String mensajeDespedida = "Lamentamos que dejes el servicio Netflis";
    
    /**
    *Constructor de la clase Netflis, para dar recomendaciones a los usuarios.
    */
    
    public Netflis(){
        contratosActivos = new LinkedList<>();
        contratosPasivos = new LinkedList<>(); 
        
        sugerencias = new String[6];
        sugerencias[0]="Netflis";
        sugerencias[1]="No sabes qué ver, prueba Una película de huevos.";
        sugerencias[2]="Prueba nuestro catalogo de Comedia.";
        sugerencias[3]="Nosotros los Nobles en Comedia.";
        sugerencias[4]="Prueba la nueva función de Shuffle,por si te aburriste.";
        sugerencias[5]="Agregado recientemente en Accion y Aventura:Star Wars:Clone Wars.";
        
    }
    
     /**
    *Método que se encarga cuando un usuario contrata el plan
    *para una sola pantalla de Netflis
    *@param contratador el usuario que contrata el Servicio.
    *
    */
    public void contratarUnaPantalla(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "una pantalla de Netflis", tipoSuscripcion, contratador, new UnaPantallaNetflis());
    }
    
    /**
    *Método que se encarga cuando un usuario contrata el plan
    *con dos pantallas de Netflis.
    *@param contratador el usuario que contrata el servicio.
    */
    public void contratarDosPantallas(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "dos pantallas de Netflis", tipoSuscripcion, contratador, new DosPantallasNetflis());
    }
    
    /**
    *Metodo que se encarga cuando un usuario contrata el plan
    *para tres pantallas de Netflis.
    *@param contratador el usuario que contrata el servicio.
    */
    public void contratarCuatroPantallas(Usuario contratador){
        super.contratarAux(bienvenidoDeVuelta, "cuatro pantallas de Netflis", tipoSuscripcion, contratador, new TresPantallasNetflis());
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
