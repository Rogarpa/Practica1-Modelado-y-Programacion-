package src; 
import src.CalculadorCobro;
import java.util.List;
public abstract class Suscripcion implements Servicio{
    protected List<Contrato> contratosActivos;
    protected List<Usuario> contratosPasivos;
    protected CalculadorCobro lectorDePlanes;
    protected String sugerencias;
    
    //FALTA DOCUMENTAR
    public void enviarRecomendaciones(){
    }

    protected class Contrato{
        public Usuario contratador;
        public Plan planContratado;
        public String nombrePlan;

        //FALTA DOCUMENTAR
        public Contrato(Usuario aSuscribir, Plan planAContratar, String nombrePlan){
            this.contratador = aSuscribir;
            this.planContratado = planAContratar;
            this.nombrePlan = nombrePlan;
        }

       
    }
}
