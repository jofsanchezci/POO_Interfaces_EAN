// Definición de la interfaz Animal
interface Animal {
    void sonido();
    void moverse();
}

// Implementación de la clase Perro
class Perro implements Animal {
    @Override
    public void sonido() {
        System.out.println("El perro hace: Guau Guau");
    }

    @Override
    public void moverse() {
        System.out.println("El perro corre.");
    }
}

// Implementación de la clase Gato
class Gato implements Animal {
    @Override
    public void sonido() {
        System.out.println("El gato hace: Miau Miau");
    }

    @Override
    public void moverse() {
        System.out.println("El gato salta.");
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Creación de instancias de las clases que implementan la interfaz Animal
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        // Llamada a los métodos implementados por cada clase
        miPerro.sonido();
        miPerro.moverse();

        miGato.sonido();
        miGato.moverse();
    }
}
