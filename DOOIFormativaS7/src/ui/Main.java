package ui;

import model.ServicioTuristico;
import data.GestorServicios;
import java.util.List;

/**
 * Clase principal del proyecto LlanquihueTourApp
 * Se encarga de recibir, recorrer y mostrar la
 * lista de servicios turísticos de la agencia.
 *
 */

public class Main {

    /**
     * Modo principal donde se ejecuta la aplicación.
     * @param args argumentos de la línea de comandos.
     */

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        List<ServicioTuristico> serviciosTuristicos = gestor.generarServiciosTuristicos();

        for (ServicioTuristico servicioTuristico : serviciosTuristicos) {
            servicioTuristico.mostrarInformacion();
        }
    }
}