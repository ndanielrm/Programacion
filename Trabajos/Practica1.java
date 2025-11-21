import java.util.Scanner;

class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        terminal: while (true) {
            System.out.print("1.Sumar\n2.Resta\n3.Multiplicacion\n4.Division\n5.Salir\nIngrese una Opcion: ");
            input = sc.next().toLowerCase();

            switch (input) {
                case "sumar":
                case "1":
                    sumar(sc);
                    break;
                case "resta":
                case "2":
                    restar(sc);
                    break;
                case "multiplicacion":
                case "3":
                    multiplicar(sc);
                    break;
                case "division":
                case "4":
                    dividir(sc);
                    break;
                    
                case "salir":
                    System.out.println("Saliendo...");
                    break terminal;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        sc.close();
    }

    public static void sumar(Scanner sc) {
        System.out.print("Ingrese los numeros a sumar: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.println("Su resultado es: " + result);
    }
    public static void restar(Scanner sc) {
        System.out.print("Ingrese el numero a restar: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el numero que resta");
        int num2 = sc.nextInt();

        int result = num1 - num2;
        System.out.println("Su resultado es: " + result);
    }
    public static void multiplicar(Scanner sc) {
        System.out.print("Ingrese los numeros a a multiplicar: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = num1 * num2;
        System.out.println("Su resultado es: " + result);
    }
    public static void dividir(Scanner sc) {
        System.out.print("Ingrese el numero a dividir: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el numero divisor: ");
        int num2 = sc.nextInt();

        int result = num1 / num2;
        System.out.println("Su resultado es: " + result);
    }
}



