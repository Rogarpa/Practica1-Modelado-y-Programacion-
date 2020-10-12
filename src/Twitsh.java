
public class Twitsh extends Suscripcion{

    /**
    *Método que se encarga cuando un usuario contrata el plan
    *normal de Twitsh.
    *@param contratador el usuario que lo contrata.
    */
    public void contratarnormal(Usuario contratador){
    }

    /**
    *Método que se encarga cuando un usuario contrata el plan
    *premium de Twitsh.
    *@param contratador el usuario que lo contrata.
    */
    public void contratarpremium(Usuario contratador){
    }

    @Override
    public void enviarRecomendaciones(){
        sugerencias[0]="Como nuevo streamer tenemos a tripasecatime";
        sugerencias[1]="Prueba en la Sección de: Nuevos Streamers";
        sugerencias[2]="¿Empezando tu experiencia en Twitsh?.Prueba Aleatorios.";
        sugerencias[3]="Para ver lo que suben tus streamers favoritos:Ve a la sección notificaciones.";
        sugerencias[4]="¿No encuentras a tu streamer?Prueba en la pestaña Buscar";
    }

    @Override
    public void cobrar(){
    }

    @Override
    public void dejarContratar(Usuario  usuarioADescontratar){
    }

}
