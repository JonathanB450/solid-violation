package Envio;

public class Envio{

  private String tipo;
  private Integer precio;
  private Integer tiempoEnvio;

  public Envio(){
    this.tipo = "";
    this.precio = 0;
    this.tiempoEnvio = 0;
  }

  public Envio(String tipo, Integer precio, Integer tiempoEnvio) {
    this.tipo = tipo;
    this.precio = precio;
    this.tiempoEnvio = tiempoEnvio;
  }

  public String getTipo() {
    return this.tipo;
  }

  public Integer getPrecio() {
    return this.precio;
  }

  public Integer getTiempoEnvio() {
    return this.tiempoEnvio;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setPrecio(Integer precio) {
    this.precio = precio;
  }

  public void setTiempoEnvio(Integer tiempoEnvio) {
    this.tiempoEnvio =tiempoEnvio;
  }

}