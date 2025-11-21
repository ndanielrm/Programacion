import java.util.ArrayList;
import java.util.Scanner;

public class ListaAlumnos {
    static class Alumno {
        String nombre;
        int edad;

        Alumno(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Edad: " + edad;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE ALUMNOS ---");
            System.out.println("1. Crear alumno");
            System.out.println("2. Modificar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Listar alumnos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese edad del alumno: ");
                    int edad = scanner.nextInt();
                    alumnos.add(new Alumno(nombre, edad));
                    System.out.println("Alumno creado correctamente.");
                    break;

                case 2:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos para modificar.");
                        break;
                    }
                    listarAlumnos(alumnos);
                    System.out.print("Ingrese el número del alumno a modificar: ");
                    int indexModificar = scanner.nextInt();
                    scanner.nextLine();
                    if (indexModificar >= 0 && indexModificar < alumnos.size()) {
                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        System.out.print("Nueva edad: ");
                        int nuevaEdad = scanner.nextInt();
                        alumnos.set(indexModificar, new Alumno(nuevoNombre, nuevaEdad));
                        System.out.println("Alumno modificado.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos para eliminar.");
                        break;
                    }
                    listarAlumnos(alumnos);
                    System.out.print("Ingrese el número del alumno a eliminar: ");
                    int indexEliminar = scanner.nextInt();
                    if (indexEliminar >= 0 && indexEliminar < alumnos.size()) {
                        alumnos.remove(indexEliminar);
                        System.out.println("Alumno eliminado.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    listarAlumnos(alumnos);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    static void listarAlumnos(ArrayList<Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            System.out.println("\n--- Lista de Alumnos ---");
            for (int i = 0; i < alumnos.size(); i++) {
                System.out.println(i + ". " + alumnos.get(i));
            }
        }
    }
}
