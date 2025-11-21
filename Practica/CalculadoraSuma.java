/*Crear una calculadora que solicite dos numeros al usuario, que sume y que lo imprima por pantalla */

import java.util.Scanner;


class CalculadoraSuma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos numeros: ");
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        int c = a+b;
        System.out.println("La suma de los numeros "+a+" mas "+b+" es: "+c);

        sc.close();
    }
}