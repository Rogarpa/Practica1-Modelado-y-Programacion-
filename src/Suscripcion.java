package src; 
import src.*; 
import java.util.List;
public abstract class Suscripcion implements Servicio{
    protected List<Contrato> contratosActivos;
    protected List<Usuario> contratosPasivos; 
    protected CalculadorCobro lectorDePlanes;
    protected String[] sugerencias;
    
    
    
    /** 
    * Se encarga de enviar a los Usuarios mediante su método mensaje() una recomendación.
    */
    public void enviarRecomendaciones(){
    }
    
    protected void contratarAux(String mensajeRebienvenida, String nombrePlan, String mensajeSuscripciónNueva, Usuario contratador, Plan planASuscribir){
        for(Contrato c: contratosActivos){
            if(c.contratador == contratador) return;
        }
        
        Contrato nuevoContrato = new Contrato(contratador, planASuscribir, nombrePlan);
        
        if(contratosPasivos.contains(contratador)){
            System.out.println(mensajeRebienvenida);
            contratador.agregarServicio(this);
            contratosPasivos.remove(contratador);
        }
        
        
        System.out.println(mensajeSuscripciónNueva + " "+ nombrePlan);
        contratosActivos.add(nuevoContrato);
    }
    
    protected void cobrarAux(String mensajecobro){
        CalculadorCobro cobrador = new CalculadorCobro();
        
        for(Contrato c: contratosActivos){
            
            Plan planACobrar = c.planContratado;
            Usuario usuarioACobrar = c.contratador;
            cobrador.setCobroPlanACalcular(planACobrar);
            int pago =  cobrador.calcularnivelsuscripcion();
            
            try {
                usuarioACobrar.cobro(pago);
            } catch (Exception e) {
                System.out.println(usuarioACobrar.getNombre() + "Agotó su dinero");
                dejarContratar(usuarioACobrar);
            }
            
            System.out.println(String.format(mensajecobro, pago) + " " + c.nombrePlan);
            
        }
        
    }
    
    public void dejarContratarAux(Usuario  usuarioADescontratar, Servicio aEliminarEnUsuario, String mensajeDespedida){
        usuarioADescontratar.eliminarServicio(aEliminarEnUsuario);
        for(Contrato c: contratosActivos){
            if(c.contratador == usuarioADescontratar){
                contratosActivos.remove(usuarioADescontratar);
                contratosPasivos.add(usuarioADescontratar);
                System.out.println(mensajeDespedida + " " + usuarioADescontratar.getNombre());   
            }                                
        }
    }
    
    
    protected class Contrato{
        public Usuario contratador;
        public Plan planContratado;
        public String nombrePlan;

        /**
        *Constructor de la clase contrato.
        *@param aSuscribir el usuario a suscribirse.
        *@param planAContratar el plan a contratar.
        *@param nombrePlan el nombre del plan que se contrata.
        */
        public Contrato(Usuario aSuscribir, Plan planAContratar, String nombrePlan){
            this.contratador = aSuscribir;
            this.planContratado = planAContratar;
            this.nombrePlan = nombrePlan;
        }

    }
}
