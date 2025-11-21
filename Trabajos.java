import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trabajos {
    
    //Lista donde se almacenan los vehículos ingresados
    private List<Vehiculo> vehiculos;

    //Constructor
    public Trabajos(){
        vehiculos = new ArrayList<>();
    }
    
    //Crear vehiculo
    public void ingresarVehiculo(Scanner sc){
        System.out.print("Ingresar el tipo de vehiculo: ");
        String tipo = sc.nextLine().toUpperCase();
        System.out.print("Ingresar la marca del vehiculo: ");
        String marca = sc.nextLine().toUpperCase();
        System.out.print("Ingresar el modelo del vehiculo: ");
        int modelo = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresar la patente del vehiculo: ");
        String patente = sc.nextLine().toUpperCase();
        for (Vehiculo v : vehiculos){
            if (v.Patente().equalsIgnoreCase(patente) && v.getTipo().equalsIgnoreCase(tipo)){
                System.out.println("ERROR: La patente ya fue cargada.");
                return;
            }
        }

        Vehiculo vehiculo = new Vehiculo(tipo, marca, modelo, patente);
        vehiculos.add(vehiculo);
        System.out.println("CARGADO CORRECTAMENTE");
    }

    //Listar
    public void listarVehiculos(){
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos cargados. ");
        }else {
            System.out.println("----- Lista de Vehiculos -----");
            for (Vehiculo v : vehiculos){
                System.out.println(v);
            }
        }
    }

    //Eliminar vehiculo
    public void eliminarVehiculo(Scanner sc){
     System.out.print("Ingresar el tipo del vehiculo:");   
     String tipo = sc.nextLine().toUpperCase();
     System.out.print("Ingresar la patente: ");
     String patente = sc.nextLine().toUpperCase();

     Vehiculo vehiculoEliminar = new Vehiculo(tipo, "", 0, patente);
     if (vehiculos.remove(vehiculoEliminar)) {
        System.out.println("Vehiculo eliminado");
     }else{
        System.out.println("Vehiculo no encontrado");
     }
    }

}
