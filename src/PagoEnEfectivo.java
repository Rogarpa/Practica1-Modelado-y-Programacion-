package src;
import java.util.List;
import src.*;
public class PagoEnEfectivo implements Usuario{

    protected List<Servicio> serviciosSuscritos;
    protected int dineroDisponible;
    protected String nombre;

    /*Construye un usuario que pagara en efectivo */
    public PagoEnEfectivo(int dineroDisponible,String nombre){
        this.dineroDisponible=dineroDisponible;
        this.nombre=nombre;
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public void agregarServicio(Servicio s){
        
        
        
        
        
        
    }
    
    @Override
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public void eliminarServicio(Servicio s){
    }

    @Override
    public void cobro(int cobroDeServicios){
        if(dineroDisponible <= cobroDeServicios){
            throw new ExcepcionFondosInsuficientes();
        }else{
                dineroDisponible += - cobroDeServicios;
        }
    }

}
