// Definición de la interfaz Figura
interface Figura {
    double calcularArea();
    double calcularPerimetro();
}

// Implementación de la clase Circulo
class Circulo implements Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Implementación del método calcularPerimetro
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

// Implementación de la clase Rectangulo
class Rectangulo implements Figura {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    // Implementación del método calcularPerimetro
    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear un círculo con radio 5
        Figura miCirculo = new Circulo(5);
        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());

        // Crear un rectángulo con largo 4 y ancho 6
        Figura miRectangulo = new Rectangulo(4, 6);
        System.out.println("Área del rectángulo: " + miRectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + miRectangulo.calcularPerimetro());
    }
}
