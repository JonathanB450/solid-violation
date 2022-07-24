package Envio;

import Modelo.ITipoEnvio;
import TiempoEnvio.ITiempoEnvio;

public class EnvioMunicipal extends Envio implements ITiempoEnvio, ITipoEnvio{

    public EnvioMunicipal(Integer precio) {
        super();
        this.setTipo("Municipal");
        this.setPrecio(precio);
        this.setTiempoEnvio(12);
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
