package model;

/**
 * Clase padre que representa al servicio turístico ofrecido por la agencia.
 */

public class ServicioTuristico {

    //Atributos de la clase dServicioTurístico
    private String nombreTour;
    private double duracionHoras;

    public ServicioTuristico(String nombreTour, double duracionHoras) {

        //Asignación de atributos
        this.nombreTour = nombreTour;
        this.duracionHoras = duracionHoras;
    }

    //Métodos getter
    public String getNombreTour () {
        return nombreTour;
    }

    public double getDuracionHoras () {
        return duracionHoras;
    }

    //Métodos setter
    public void setNombreTour (String nombreTour){
        this.nombreTour = nombreTour;
    }

    public void setDuracionHoras (double duracionHoras){
        this.duracionHoras = duracionHoras;
    }

    /**
     * Metodo mostrar información heredado y sobrescrito por las subclases.
     */

    public void mostrarInformacion() {
        System.out.println("\n=== Servicios Turísticos ===" +
                "\nNombre del Tour: " + nombreTour +
                "| Duración del Tour: " + duracionHoras);
    }
}



