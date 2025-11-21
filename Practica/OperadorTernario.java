/*En vez de usar un Sout todo el tiempo, a un string le puedo cargar un mensaje y despues solo mostrarlo en ´pantalla
 * puede ser un String = "" o String = "Mensaje X"
 */

public class OperadorTernario {

    public static void main(String[] args) {
        
        int edad = 17;
        String mensaje = edad>17? "Puede votar" : "No puede votar";

        System.out.println(mensaje);


    }

}