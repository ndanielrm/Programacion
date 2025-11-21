import java.util.Scanner;
public class Terminal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        terminal: while (true) {
            System.out.println("INGRESE UNA OP");
            System.out.println("OP 1 Cal");
            System.out.println("OP 2 Salir");

            input = sc.next().toLowerCase();

            switch (input) {
                case "1":
                    System.out.print("Ingrese dos valores: ");
                    int v1 = sc.nextInt();
                    int v2 = sc.nextInt();
                    int v3 = v1+v2;
                    System.out.println("La suma es: "+v3);
                    break;
                case "2":
                    break terminal;
            }
            
        }sc.close();

    }

}