
public interface Servicio{

    /**
     * Elimina al usuario del registro de suscripciones.
     * @param usuarioADescontratar
     */
    public void dejarContratar(Usuario usuarioADescontratar);

    /**
     * Envía un cobro a los usuarios en el registro de suscripciones.
    */
    public void cobrar();

}
