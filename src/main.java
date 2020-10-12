
package src; 
import src.*; 
import java.util.LinkedList;
import java.util.List;
public class main{


    public static void main(String[] args){
        Usuario u = new PagoEnEfectivo(12, "s");
        Suscripcion s = new Yutube();
        
        UnaPantallaNetflis pn = new UnaPantallaNetflis();
        DosPantallasNetflis pd = new DosPantallasNetflis();
        CuatroPantallasNetflis pan = new CuatroPantallasNetflis();

        Servicio sc = new Yutube();
        PremiumYutube p = new PremiumYutube();
        PremiumTwitsh pt = new PremiumTwitsh();
        PremiumSpootify ps = new PremiumSpootify();
        PremiumHammazon ph = new PremiumHammazon();
        NormalYutube ny = new NormalYutube();
        NormalTwitsh nt = new NormalTwitsh();
        NormalSpootify ns = new NormalSpootify();
        NormalHammazon nh = new NormalHammazon();
        
        System.out.println("MAIN FUNCIONANDO");
        
        Yutube yutube = new Yutube();
        Spootify spootify = new Spootify();
        Netflis netflis = new Netflis();
        Hammazon hammazon = new Hammazon();
        Twitsh twitsh = new Twitsh();

        Usuario Alicia = new PagoEnEfectivo(500, "Alicia");
        Usuario Bob = new PagoEnEfectivo(70, "Bob");
        Usuario Cesar = new PagoEnEfectivo(40, "Cesar");
        Usuario Diego = new PagoEnEfectivo(200, "Diego");
        Usuario Erika = new PagoEnEfectivo(220, "Erika");
        List<Servicio> listaservicios = new LinkedList<>();
        listaservicios.add(yutube);
        listaservicios.add(spootify);
        listaservicios.add(netflis);
        listaservicios.add(hammazon);
        listaservicios.add(twitsh);

        
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("Día 0");
        yutube.contratarpremium(Alicia);
        spootify.contratarpremium(Alicia);
        netflis.contratarCuatroPantallas(Alicia);
        hammazon.contratarpremium(Alicia);
        
        twitsh.contratarpremium(Bob);
        yutube.contratarpremium(Bob);
        spootify.contratarpremium(Bob);
        netflis.contratarCuatroPantallas(Bob);
        hammazon.contratarpremium(Bob);
        twitsh.contratarpremium(Bob);
        
        spootify.contratarpremium(Cesar);
        yutube.contratarnormal(Cesar);

        netflis.contratarDosPantallas(Diego);
        hammazon.contratarpremium(Diego);

        netflis.contratarCuatroPantallas(Erika);
        twitsh.contratarnormal(Erika);
        spootify.contratarnormal(Erika);
        yutube.contratarnormal(Erika);


        System.out.println("///////////////////////////////////////////////////");
        System.out.println("Día 1");
        for(Servicio acobrar: listaservicios) acobrar.cobrar();

        
        
        
    }


}
