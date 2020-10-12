package src; 
import src.*;
/**
 * Clase para excepciones de índices de lista inválidos.
 */
public class ExcepcionFondosInsuficientes extends IllegalArgumentException {

    /**
     * Constructor vacío.
     */
    public ExcepcionFondosInsuficientes() {}

    /**
     * Constructor que recibe un mensaje para el usuario.
     * @param mensaje un mensaje que verá el usuario cuando ocurra la excepción.
     */
    public ExcepcionFondosInsuficientes(String mensaje) {
        super(mensaje);
    }
}