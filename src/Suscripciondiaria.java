public abstract class Suscripciondiaria implements Suscripcion{
    List<interna> suscriptores;


    public void cobrar(){
        this.cobrarnuevodia();

    }

    public void cobrarnuevodia(){
        for(Interna i:suscriptores){
            if(i.boolean){
                i.cliente.cobro(i.cobrador.Calculadorcobro());
            }
        }

    }

    public void dejarcontratar(Suscriptor supuestosuscriptor){
        for(Intera i:suscriptores){
            if(i.boolean && i.cliente==suscriptor){
                i.boolean;
            }
        }
    }



    public class Interna{
        Suscriptor cliente;

        Calculadorcobro cobrador;

        boolean contratacionactiva;

        public Interna(Suscriptor cliente,Calculadorcobro cobrador,boolean contratacionactiva){
            
        }

    }
}
