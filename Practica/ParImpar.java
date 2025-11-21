/*Crear un algoritmo que indique si un numero es par, impar y si es divisible por 3 y 4 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número a comprobar: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
            if (num % 4 == 0) {
                if (num % 3 == 0) {
                    System.out.println("El numero es divisible por 3 y por 4");   
                } else{
                    System.out.println("El numero es divisible por 4");
                }
                
            }
        } else {
            System.out.println("El número " + num + " es impar");
            if (num % 3 == 0) {
                System.out.println("El numero es divisible por 3");
            }
        }

        sc.close();
    }
}

