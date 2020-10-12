
public class Yutube extends Suscripcion {

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
        sugerencias[0]="Prueba memes para ver los videos aleatorios más recientes.";
        sugerencias[1]="Ver a continuación:Destacados de la Semana.";
        sugerencias[2]="¿No tienes tiempo de ver tu video?.Agregalo a la sección Ver más tarde.";
        sugerencias[3]="Para ver a tus Yutuberos preferidos ve a Suscripciones.";
        sugerencias[4]="Revisa tu historial por si no terminaste de ver un video.";

    }


    @Override
    public void cobrar(){
    }

    @Override
    public void dejarContratar(Usuario  usuarioADescontratar){
        System.out.println(0);
    }

}
