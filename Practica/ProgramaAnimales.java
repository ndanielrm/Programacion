// Clase abstracta Animal
abstract class Animal {
    // Método abstracto que debe ser implementado por las subclases
    public abstract void hacerSonido();
}

// Interfaz Mascota
interface Mascota {
    void jugar();
}

// Clase Perro que hereda de Animal e implementa Mascota
class Perro extends Animal implements Mascota {
    @Override
    public void hacerSonido() {
        System.out.println("El perro dice: ¡Guau guau!");
    }

    @Override
    public void jugar() {
        System.out.println("El perro está jugando con la pelota.");
    }
}

// Clase Gato que hereda de Animal e implementa Mascota
class Gato extends Animal implements Mascota {
    @Override
    public void hacerSonido() {
        System.out.println("El gato dice: ¡Miau!");
    }

    @Override
    public void jugar() {
        System.out.println("El gato está jugando con una bola de estambre.");
    }
}

// Clase principal para probar el código
public class ProgramaAnimales {
    public static void main(String[] args) {
        // Crear objetos de Perro y Gato
        Perro miPerro = new Perro();
        Gato miGato = new Gato();

        // Probar métodos del perro
        System.out.println("Perro:");
        miPerro.hacerSonido();
        miPerro.jugar();

        // Probar métodos del gato
        System.out.println("\nGato:");
        miGato.hacerSonido();
        miGato.jugar();
    }
}


