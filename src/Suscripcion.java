public abstract class Suscripcion implements Servicio{
    protected List<Contrato> contratosActivos;
    protected List<Usuario> contratosPasivos;
    protected Calculadorcobro lectorDePlanes;
    protected String sugerencias;
    
    //FALTA DOCUMENTAR
    void enviarRecomendaciones();

    protected class Contrato{
        public Usuario contratador;
        public Plan planContratado
        public String nombrePlan

        //FALTA DOCUMENTAR
        public Contrato(Usuario aSuscribir, Plan planAContratar, String nombrePlan){
            this.contratador = aSuscribir;
            this.planContratado = planAContratar;
            this.nombrePlan = nombrePlan;
        }

       
    }
}
