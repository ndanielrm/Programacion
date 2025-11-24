/*En este programa vamos a simular un taller mecánico.
    El taller va a contar con funciones como:
    - Listar vehículos
    - Ingresar vehículo 
    - Reparar vehículo
        Si elegimos esta opción, se preguntará qué tipo de vehículo es (auto, moto, etc.)
        Ctrl+c y Ctrl+v; "\" */

import java.util.Scanner;


import java.util.Scanner;

public class Taller {

    public static void main(String[] args) {
        // Crear Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Crear objeto Taller (clase Trabajos)
        Trabajos taller = new Trabajos();

        int opcion = 0;

        do {
            System.out.println("----- Taller Mecánico -----");
            System.out.println("1. Ingresar vehículo");
            System.out.println("2. Listar vehículos");
            System.out.println("3. Eliminar vehículo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    taller.ingresarVehiculo(sc);
                    break;
                case 2:
                    taller.listarVehiculos();
                    break;
                case 3:
                    taller.eliminarVehiculo(sc);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println(); // Línea en blanco para claridad
        } while(opcion != 4);

        sc.close();
    }
}

