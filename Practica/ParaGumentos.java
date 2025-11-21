/*Los valores que yo le paso a los metodos al momento de llamarlos (en este caso en el main), son parametros. 
 * Pero cuando hago referencia a la variable, es decir, en  "nombre" se le llama parametro
 */
public class ParaGumentos {

    public static void main(String[] args) {
        miMetodo("Pedro", 25);//<-Esto es un argumento
        miMetodo("Jacinto", 32);
    }

    static void miMetodo(String nombre, int edad ){//<-"nombre" es un parametro
        System.out.println("Hola "+ nombre+" "+edad);
    }
}
