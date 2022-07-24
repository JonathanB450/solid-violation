import Envio.Envio;
import Envio.EnvioIntermunicipal;
import Envio.EnvioInternacional;
import Envio.EnvioMunicipal;

public class Principal {

  public static void main(String[] args) {
    EnvioMunicipal[] enviosMunicipales = {new EnvioMunicipal(5000)};
    EnvioIntermunicipal[] enviosIntermunicipales = {new EnvioIntermunicipal(15000)};
    EnvioInternacional[] enviosInternacionales = {new EnvioInternacional(25000)};

    for(EnvioMunicipal envios: enviosMunicipales){
      envios.imprimirTiempoEnvio();
      envios.crearTipoEnvio();
    }

    for(EnvioIntermunicipal envios: enviosIntermunicipales){
      envios.imprimirTiempoEnvio();
      envios.crearTipoEnvio();
    }

    for(EnvioInternacional envios: enviosInternacionales){
      envios.imprimirTiempoEnvio();
      envios.crearTipoEnvio();
    }
  }
}
