package Envio;

public class EnvioInternacional implements IEnvio{

    private String tipo = "Internacional";
    private Integer precio;
    private Integer tiempoEnvio = 90;

    public EnvioInternacional(Integer precio) {
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
