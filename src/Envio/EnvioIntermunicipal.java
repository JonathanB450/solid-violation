package Envio;

import Modelo.ITipoEnvio;
import TiempoEnvio.ITiempoEnvio;

public class EnvioIntermunicipal extends Envio implements ITiempoEnvio, ITipoEnvio{

    public EnvioIntermunicipal(Integer precio) {
        super();
        this.setTipo("Intermunicipal");
        this.setPrecio(precio);
        this.setTiempoEnvio(36);
    }

    @Override
    public void imprimirTiempoEnvio() {
        this.imprimirTiempoEnvio(this.getTiempoEnvio());
    }

    @Override
    public void crearTipoEnvio() {
        this.crearTipoEnvio(this.getTipo());
    }
}
