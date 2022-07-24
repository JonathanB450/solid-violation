package Modelo;
import Envio.Envio;

public interface ITipoEnvio {

    default void crearTipoEnvio(String tipo) {
        //TODO
        System.out.println("Envio del tipo " + tipo + " fue creado en la base de datos");
    }

    void crearTipoEnvio();
}
