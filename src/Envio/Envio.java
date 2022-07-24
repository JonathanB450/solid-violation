package Envio;

public class Envio{

  private String tipo;
  private Integer precio;
  private Integer tiempoEnvio;

  public Envio(){
    this.tipo = "";
    this.precio = 0;
  }

  public Envio(String tipo, Integer precio) {
    this.tipo = tipo;
    this.precio = precio;
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