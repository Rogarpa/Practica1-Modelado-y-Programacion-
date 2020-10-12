


import java.util.LinkedList;
import java.util.List;
public class PagoEnEfectivo implements Usuario{

    protected List<Servicio> serviciosSuscritos;
    protected int dineroDisponible;
    protected String nombre;

    /*Construye un usuario que pagara en efectivo */
    public PagoEnEfectivo(int dineroDisponible,String nombre){
        this.dineroDisponible=dineroDisponible;
        this.nombre=nombre;
        serviciosSuscritos = new LinkedList<>();
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public void agregarServicio(Servicio s){
        for(Servicio contratadoPreviamente:serviciosSuscritos){
                if(contratadoPreviamente==s){
                    return;
                }
        }
        serviciosSuscritos.add(s);
            
    }
    
    @Override
    public void mensaje(String mensajeAImprimir){
        System.out.println(mensajeAImprimir);
    }

    @Override
    public void eliminarServicio(Servicio s){
        for(Servicio contratadoPreviamente:serviciosSuscritos){
            if(contratadoPreviamente==s){
                serviciosSuscritos.remove(s);
            }
        }
    }

    @Override
    public void cobro(int cobroDeServicios) {
        if(dineroDisponible <= cobroDeServicios){
            throw new ExcepcionFondosInsuficientes();
        }else{
                dineroDisponible += - cobroDeServicios;
        }
    }


}
