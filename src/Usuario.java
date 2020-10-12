package src; 
import src.*;
public interface Usuario{

    /**
    *Se encarga de cobrar al usuario una cifra. Si el usuario no tiene fondos suficiente lanza la excepcion
    *@param cobroDeServicios el cobro solicitado.
    *@throws ExcepcionFondosInsuficientes si el Usuario no es capaz de pagar el cobro. 
    */
    void cobro(int cobroDeServicios);

    /**
     * Agrega un servicio al registro de servicios contratados por el Usuario. Si el Usuario lo contrato previamente, no le.
     * @param s servicio a agregar.
     */
     void agregarServicio(Servicio s);

    /**
     * Elimina un servicio a la lista de servicios que cobran diario contratados por el Usuario. Si el Usuario no lo contrato previamente, no lo elimina.
     * @param s servicio a eliminar
     */
    void eliminarServicio(Servicio s);

    /**
    *Método para obtener el nombre del usuario.
    */
    public String getNombre();


    /**
    *Método que permite enviar mensajes a los usuarios.
    *@param mensajeAImprimir el mensaje que se le enviará.
    */
    public void mensaje(String mensajeAImprimir);
}
