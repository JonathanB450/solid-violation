package Modelo;
import Envio.IEnvio;

public class ModeloEnvio {

    public static void crearTipoEnvio(IEnvio envio){
        //TODO
        System.out.println("Envio del tipo " + envio.getTipo() + " fue creado en la base de datos");
    }

    public static void crearTipoEnvio(IEnvio envios[]){
        //TODO
        for(IEnvio envio: envios){
            System.out.println("Envio del tipo " + envio.getTipo() + " fue creado en la base de datos");
        }
    }
}
