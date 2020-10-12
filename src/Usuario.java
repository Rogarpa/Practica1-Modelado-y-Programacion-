package src;
import src.*;
public interface Usuario{
    
    /**
    *Se encarga de cobrar al usuario una cifra. Si el usuario no tiene fondos suficiente lanza la excepcion
    *@param cobroDeServicios el cobro solicitado.
    *@throws FondosInsuficientes si el Usuario no es capaz de pagar el cobro. 
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

    //FALTA DOCUMENTAR
    public String getNombre();

    public void mensaje(String mensaje);
}
