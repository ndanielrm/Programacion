public class NumArre {

    // Función que intenta duplicar el valor de un número
    public static void duplicarNumero(int x) {
        x = x * 2;  // Duplicamos el valor
        System.out.println("Valor dentro de duplicarNumero: " + x);
    }

    // Función que duplica el valor de cada elemento del arreglo
    public static void duplicarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;  // Duplicamos cada valor en el arreglo
        }
    }

    public static void main(String[] args) {
        // Probando duplicarNumero
        int numero = 5;
        System.out.println("Antes de duplicarNumero: " + numero);
        duplicarNumero(numero);  // Llamada a duplicarNumero
        System.out.println("Después de duplicarNumero: " + numero);  // El valor de numero no cambia

        // Probando duplicarArreglo
        int[] arreglo = {1, 2, 3, 4, 5};
        System.out.print("Antes de duplicarArreglo: ");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();

        duplicarArreglo(arreglo);  // Llamada a duplicarArreglo

        System.out.print("Después de duplicarArreglo: ");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

