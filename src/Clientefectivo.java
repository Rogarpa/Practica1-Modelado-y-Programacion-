public class Clientefectivo{

    List<Suscripcion> suscripciones;
    int dinerodisponible;
    String nombre;

    public Clientefectivo(int dinerodisponible,String nombre){
        this.dinerodisponible=dinerodisponible;
        this.nombre=nombre;
    }

    public void agregarsuscripcion(Suscripcion s){
        for(Suscripcion suscripcionprevia:suscripciones){
                if(suscripcionprevia==s){
                    return;
                }
        }
        s.add(s);
    }

    public void setdinerodisponible(int dinerodisponible){

    }

    public void cobro(int cobrodiariodeservicio){

    if(dinerodisponible <= cobrodiarioservicio){
       for(Suscripcion s: suscripciones){
           s.dejarcontratar(this);
        }
       dinerodisponible += -cobrodiarioservicios;
       return;
    }else{
        dinerodisponible += - cobrodeservicios;
    }
    }
}
