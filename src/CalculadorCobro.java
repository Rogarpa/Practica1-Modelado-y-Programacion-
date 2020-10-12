
public class CalculadorCobro{
    Plan cobroPlanACalcular;

    /**
    *Método que actualiza el monto a cobrar al usuario
    *dependiendo del plan que elija
    *@param cobroPlanACalcular el plan que el usuario tiene.
    */
    public void setCobroPlanACalcular(Plan cobroPlanACalcular) {
        this.cobroPlanACalcular = cobroPlanACalcular;
    }

    /**
    *Metodo que calcula el nivel de la Suscripcion del usuario.
    *@return el nivel de la Suscripcion del usuario.
    */
    public int calcularnivelsuscripcion(){
        return 0;
    }

}
