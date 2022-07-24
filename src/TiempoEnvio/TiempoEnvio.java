package TiempoEnvio;
import Envio.IEnvio;

public class TiempoEnvio{
    public static void imprimirTiempoEnvio(Integer tiempo){
        System.out.println("Tiempo envio " + tiempo + " horas");
    };

    public static void imprimirTiempoEnvio(IEnvio envios[]){
       for(IEnvio envio: envios){
            TiempoEnvio.imprimirTiempoEnvio(envio.getTiempoEnvio());
        }
    };

}