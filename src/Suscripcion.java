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
        int i = 0;
        for(Contrato aRecomendar: contratosActivos){
            aRecomendar.contratador.mensaje("Te recomendamos: " + sugerencias[i++]);
        }
    }

    /**
    *Metodo auxiliar en la contratación de Servicios.
    *@param mensajeRebienvenida mensaje cuando se recontrata un servicio.
    *@param nombrePlan el nombre del plan a contratar.
    *@param mensajeSuscripciónNueva el mensaje que notifica de la Suscripcion.
    *@param contratador el usuario que contrata el servicio.
    *@param planASuscribir el plan al que se suscribe.
    */
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

    /**
    *Método auxiliar para el cobro de los Servicios.
    *@param mensajecobro notificación cuando se contrata un servicio.
    */
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
                System.out.println(usuarioACobrar.getNombre() + "agotó su dinero");
                dejarContratar(usuarioACobrar);
            }

            System.out.println(String.format(mensajecobro, pago) + " " + c.nombrePlan);
            enviarRecomendaciones();

        }

    }

    /**
    *Método auxiliar para la eliminación de un Servicio.
    *@param usuarioADescontratar el usuario que se da de baja del servicio.
    *@param aEliminarEnUsuario el servicio que se deja de contratar.
    *@param mensajeDespedida el mensaje que se imprime al usuario al dejar de contratar el servicio.
    */
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
