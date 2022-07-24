package Envio;

import Modelo.ITipoEnvio;
import TiempoEnvio.ITiempoEnvio;

public class EnvioInternacional extends Envio implements ITiempoEnvio, ITipoEnvio{

    public EnvioInternacional(Integer precio) {
        super();
        this.setTipo("Internacional");
        this.setPrecio(precio);
        this.setTiempoEnvio(90);
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
