public class Switch {

    public static void main(String[] args) {
        
        String action = "Eliminar"; 
        switch (action) {
            case "Agregar":
                System.out.println("Agregando");
                break;
        
            case "Eliminar":
                System.out.println("Eliminando");
                break;
        }
    }

}
