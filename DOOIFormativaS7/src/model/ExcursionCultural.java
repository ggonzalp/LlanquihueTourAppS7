package model;


/**
 * Clase que representa el tour ExcursionCultural,
 * incluye los atributos heredados de la clase padre Servicio turístico
 * además del lugar histórico que se visita durante el recorrido.
 */

public class ExcursionCultural extends ServicioTuristico {

    //Atributos de la clase FExcursiónCultural
    private String lugarHistorico;

    public ExcursionCultural(String nombreTour, double duracionHoras, String lugarHistorico) {
        super(nombreTour, duracionHoras);

        this.lugarHistorico = lugarHistorico;
    }

    //Métodos getter
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    //Métodos setter
    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Metodo mostrarInformacion heredado de la clase padre ServicioTuristico para sobresribirlo.
     */

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(
                "\n--- Excursión Cultural ---" +
                "\nLugar Histórico: " + lugarHistorico);
    }
}
