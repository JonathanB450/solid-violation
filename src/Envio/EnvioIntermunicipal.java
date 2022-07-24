package Envio;

public class EnvioIntermunicipal implements IEnvio{

    private String tipo = "Intermunicipal";
    private Integer precio;
    private Integer tiempoEnvio = 36;

    public EnvioIntermunicipal(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }

    @Override
    public Integer getTiempoEnvio() {
        return this.tiempoEnvio;
    }
}
