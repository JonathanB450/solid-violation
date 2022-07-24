package TiempoEnvio;
public interface ITiempoEnvio {
    default void imprimirTiempoEnvio(Integer tiempo){
        System.out.println("Tiempo envio " + tiempo + " horas");
    };

    void imprimirTiempoEnvio();
}
