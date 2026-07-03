package data;

import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;
import model.ExcursionCultural;

import java.util.ArrayList;
import java.util.List;

/**
 *Clase que representa al gestor de datos, encargada de ingresar
 *los datos de forma local y manual.
 */

public class GestorServicios {

    public List<ServicioTuristico> generarServiciosTuristicos() {

        List<ServicioTuristico> serviciosTuristicos = new ArrayList<>();

        serviciosTuristicos.add(new ServicioTuristico("Servicio turístico", 00.00));
        serviciosTuristicos.add(new PaseoLacustre("Lago todos los santos", 3.30, "Lancha"));
        serviciosTuristicos.add(new RutaGastronomica("Ruta del chocolate", 2.00, 2));
        serviciosTuristicos.add(new ExcursionCultural("Museo", 3.20, "Museo Llanquihue"));
        serviciosTuristicos.add(new PaseoLacustre("Lago llanquihue", 3.30, "Catamarán"));
        serviciosTuristicos.add(new RutaGastronomica("Ruta del kuchen", 2.00, 2));
        serviciosTuristicos.add(new ExcursionCultural("Iglesias", 3.20, "Iglesia Llanquihue"));


        return serviciosTuristicos;
    }
}