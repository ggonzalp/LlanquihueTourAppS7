* LlanquihueTourApp

Descripción de la propuesta de proyecto para la agencia Llanquihue Tour.
En esta séptima semana debemos procesar información de forma local y manual. El proceso incluye producción, lectura, a través del bucle for-each, y sobrescritura a través del método
mostrarInformacion() y @Override con datos relacionados a cada tipo de servicio turístico.

* Tecnologías utilizadas
- Java 23
- IntellijIdea

* Estructura del proyecto
LlanquihueTourApp/
└── src/
    ├── data/
    │   └── GestorServicios.java
    ├── model/
    │   ├── ExcursionCultural.java
    │   ├── PaseoLacustre.java
    │   ├── RutaGastronomica.java
    │   └── ServicioTuristico.java
    └── ui/
        └── Main.java

  * Paquetes y clases (Semana 7)
1. data
   1.1 GestorServicios: Clase que representa al gestor de datos, encargada de ingresar los datos de forma local y manual.
2. model
   2.1 ExcursionCultural: Representa el tour excursion cultural.
   2.2 PaseoLacustre: Representa al tour paseo lacustre.
   2.3 RutaGastronomica: Representa el tour ruta gastronómica.
   2.4 ServicioTurictico: Representa la clase padre de los tours.
3. ui
   3.1 Main: Clase principal que da inicio al sistema.

* Ejecución

1° Clonar el repositorio: git clone https://github.com/ggonzalp/LlanquihueTourAppS7.git

2° Abrir el proyecto en IntelliJ IDEA

3° Ejecutar la clase principal: src/ui/Main.java

4° El programa cargará automáticamente los datos de la lista ingresada de forma local y manual.

Autoría Estudiante: Gabriela González Peirano 
Asignatura: Desarrollo Orientado a Objetos I 
Instituto: DuocUC
