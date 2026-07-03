package model;

/**
 * Clase que representa el tour Paseo Lacustre,
 * incluye los atributos heredados de la clase padre Servicio turístico
 * además del tipo de embarcación que se utilizará durante el recorrido.
 */

public class PaseoLacustre extends ServicioTuristico {

    //Atributos de la clase FPaseoLacustre
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombreTour, double duracionHoras, String tipoEmbarcacion) {
        super(nombreTour, duracionHoras);

        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    //Métodos getter
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    //Métodos setter
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Metodo mostrarInformacion heredado de la clase padre ServicioTuristico para sobrescribirlo.
     */

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(
                "\n--- Paseo Lacustre ---" +
                "\nTipo de embarcación: " + tipoEmbarcacion);
    }
}
