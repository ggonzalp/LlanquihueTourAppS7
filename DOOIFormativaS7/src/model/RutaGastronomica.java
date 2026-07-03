package model;

/**
 * Clase que representa el tour Ruta Gastronómica,
 * incluye los atributos heredados de la clase padre Servicio turístico
 * además del número de paradas durante el recorrido.
 */
public class RutaGastronomica extends ServicioTuristico {

    //Atributos de la clase GRutaGastronómica
    private int numeroParadas;

    public RutaGastronomica(String nombreTour, double duracionHoras, int numeroParadas) {
        super(nombreTour, duracionHoras);

        this.numeroParadas = numeroParadas;
    }

    //Metodos getter
    public int getNumeroParadas() {
        return  numeroParadas;
    }

    //Metodos setter
    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    /**
     * Metodo mostrarInformacion heredado de la clase padre ServicioTuristico para sobrescribirlo.
     */

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(
                "\n--- Ruta Gastronómica ---" +
                "\nNúmero de paradas: " + numeroParadas);
    }
}
