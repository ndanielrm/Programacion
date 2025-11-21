import java.util.Scanner;

public class Palabras {

    // Función para comparar si las palabras son iguales
    public static void compararPalabras(String palabra1, String palabra2) {
        // Comparar con equals (sensible a mayúsculas y minúsculas)
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son completamente iguales (con mayúsculas y minúsculas).");
        } else {
            System.out.println("Las palabras NO son completamente iguales (con mayúsculas y minúsculas).");
        }
        
        // Comparar con equalsIgnoreCase (ignorando mayúsculas y minúsculas)
        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las palabras son iguales ignorando mayúsculas y minúsculas.");
        } else {
            System.out.println("Las palabras NO son iguales ignorando mayúsculas y minúsculas.");
        }
    }

    // Función para buscar una letra o porción de palabra en la primera palabra
    public static void buscarLetraOPorcion(String palabra1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una letra o porción de palabra para buscar en la primera palabra: ");
        String buscar = scanner.nextLine();
        
        int posicion = palabra1.indexOf(buscar);
        
        if (posicion == -1) {
            System.out.println("No se encontró '" + buscar + "' en la primera palabra.");
        } else {
            System.out.println("La letra o porción '" + buscar + "' se encuentra en la posición: " + posicion);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir las dos palabras
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = scanner.nextLine();
        
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        
        int opcion;
        
        do {
            // Mostrar menú de opciones
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Comparar si las palabras son completamente iguales (equals) y si ignoramos las mayúsculas (equalsIgnoreCase)");
            System.out.println("2. Buscar una letra o porción de palabra en la primera palabra");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de la opción
            
            switch (opcion) {
                case 1:
                    compararPalabras(palabra1, palabra2);
                    break;
                case 2:
                    buscarLetraOPorcion(palabra1);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 3);
        
        scanner.close();
    }
}

