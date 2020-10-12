
public class Hammazon extends Suscripcion{

    /**
    *Método que se encarga cuando un usuario contrata el plan
    *normal de Yutube.
    *@param contratador el usuario que contrata el plan.
    */
    public void contratarnormal(Usuario contratador){

    }

    /**
    *Método que se encarga cuando un usuario contrata el plan
    *premium de Yutube.
    *@param contratador el usuario que contrata el plan.
    */
    public void contratarpremium(Usuario contratador){

    }

    @Override
    public void enviarRecomendaciones(){

        sugerencias[0]="Agregados Recientemente:Carnival Row Season 1,La casa de papel.";
        sugerencias[1]="Tiempo de Terror:Halloween Season 1.";
        sugerencias[2]="Agregado recientemente: Malcolm in the Middle Season 3.";
        sugerencias[3]="Un nuevo episodio cada semana:The Boys.";
        sugerencias[4]="Para los amantes del Terror:The Shinning.";

    }

    @Override
    public void cobrar(){
    }

    @Override
    public void dejarContratar(Usuario  usuarioADescontratar){
    }

}
