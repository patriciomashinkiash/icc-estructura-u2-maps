import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empCtlr = new EmpleadoContoller();
        empCtlr.addEmpleados(new Empleado(1, "Pablo", "Senior"));
        empCtlr.addEmpleados(new Empleado(2, "Juan", "Senior"));
        empCtlr.addEmpleados(new Empleado(3, "Andres", "Senior"));

        System.out.println(empCtlr.getEmpleadoById(2));

        empCtlr.displayEmpleados();

        empCtlr.displayEmpleadosSoloNombres();

        empCtlr.displayLlaves();
        
        empCtlr.displayEmpleadoValues();

    }

    private static void runMapExamlpe() {
        Mapa m = new Mapa();

        System.out.println("-----HASHMAP-----");
        m.hashMapa();

        System.out.println("\n-----LINKEDHASMAP-----");
        m.linkedHashMapa();

        System.out.println("\n-----TREEMAP-----");
        m.treeMapa();
    }

    private static void runEjerccios() {
        
    }
}
