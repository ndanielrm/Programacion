import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!input.equals("salir")) {
            System.out.print("Ingrese comando: ");
            input = sc.next().toLowerCase();
            System.out.println(input);

            
        }
        System.out.println("Terminó el loop");
        sc.close();
    }

}
