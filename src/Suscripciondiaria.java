public abstract class Suscripciondiaria implements Suscripcion{
    List<interna> suscriptores;


    public void cobrar(){

    }

    public void cobrarnuevodia(){

    }

    public void dejarcontratar(Suscriptor supuestosuscriptor){

    }



    public class Interna{
        Suscriptor cliente;

        Calculadorcobro cobrador;

        boolean contratacionactiva;

        Interna(Suscriptor cliente,Calculadorcobro cobrador,boolean contratacionactiva)

    }
}
