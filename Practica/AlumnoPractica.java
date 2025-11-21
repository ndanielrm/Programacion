public class AlumnoPractica {

    int id;
    String ApNom;

    // Método para mostrar el nombre
    public void mostrarNombre() {
        System.out.println("Nombre del alumno: " + ApNom);
    }
    //Metodo para aprobacion
    public void aprobado(double calificacion){
        if(calificacion >=6){
            System.out.println("Aprobado");
        }else{
            System.out.println("Desaprobado");
        }
    }
    //Constructor
    public AlumnoPractica(int id, String ApNom){
        this.id = id;
        this.ApNom = ApNom;
    } 

    public int getid(){
        return id;
    }

    public void setid(int id){
        this.id = id;
    }

    public String getApNom(){
        return ApNom;
    }

    public void setApNom(String ApNom){
        this.ApNom = ApNom;
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase
        AlumnoPractica alum1 = new AlumnoPractica(0, "Perez Juan");
        AlumnoPractica alum2 = new AlumnoPractica(0, null);
        
        System.out.println("La id del Alumno 1 es: "+alum1.getid());
        System.out.println("El nombre del Alumno 1 es: "+alum1.getApNom());
        alum2.setApNom("Bullisio Benson");
        alum2.setid(0);
        System.out.println("La id del Alumno 2 es: "+alum2.getid());
        System.out.println("El nombre del Alumno 2 es: "+alum2.getApNom());

        //Cambio de valor
        alum1.setid(1);
        alum1.setApNom("Herrera Carolina");
        System.out.println("_________________________");
        System.out.println("La id del Alumno 1 es: "+alum1.getid());
        System.out.println("El nombre del Alumno 1 es: "+alum1.getApNom());
        
    }
}
