import Envio.EnvioIntermunicipal;
import Envio.EnvioInternacional;
import Envio.EnvioMunicipal;
import Envio.IEnvio;
import Modelo.ModeloEnvio;
import TiempoEnvio.TiempoEnvio;

public class Principal {

  public static void main(String[] args) {
    IEnvio[] envios = {
      new EnvioMunicipal(5000),
      new EnvioIntermunicipal(15000),
      new EnvioInternacional(15000)
    };

    TiempoEnvio.imprimirTiempoEnvio(envios);
    ModeloEnvio.crearTipoEnvio(envios);
  }
}
