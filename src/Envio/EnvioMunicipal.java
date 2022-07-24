package Envio;

public class EnvioMunicipal implements IEnvio{

    private String tipo = "Municipal";
    private Integer precio;
    private Integer tiempoEnvio = 12;

    public EnvioMunicipal(Integer precio) {
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