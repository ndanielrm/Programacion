import java.util.Scanner;

public class MenuOpciones {

    // Función para contar del 1 al 10 con un ciclo for
    public static void contarDelUnoAlDiez() {
        System.out.println("Contando del 1 al 10 con un for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Función para contar del 10 al 1 con un ciclo while
    public static void contarDelDiezAlUno() {
        System.out.println("Contando del 10 al 1 con un while:");
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    // Función para pedir números hasta que el usuario ingrese 0 usando do-while
    public static void pedirNumerosHastaCero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Introduce números hasta que ingreses 0:");
        do {
            numero = scanner.nextInt();
            if (numero != 0) {
                System.out.println("Has ingresado el número: " + numero);
            }
        } while (numero != 0);
        System.out.println("¡Has ingresado 0! Fin del programa.");
        
    }
    

    // Función para recorrer un arreglo de enteros con for-each
    public static void recorrerArreglo(int[] arreglo) {
        System.out.println("Recorriendo el arreglo con un for-each:");
        for (int numero : arreglo) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        do {
            // Mostrar menú de opciones
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Contar del 1 al 10 con for");
            System.out.println("2. Contar del 10 al 1 con while");
            System.out.println("3. Pedir números hasta que ingreses 0 con do-while");
            System.out.println("4. Recorrer un arreglo de enteros con for-each");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    contarDelUnoAlDiez();
                    break;
                case 2:
                    contarDelDiezAlUno();
                    break;
                case 3:
                    pedirNumerosHastaCero();
                    break;
                case 4:
                    int[] arreglo = {10, 20, 30, 40, 50};
                    recorrerArreglo(arreglo);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}

