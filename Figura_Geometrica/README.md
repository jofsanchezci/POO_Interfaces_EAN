
# Ejemplo de Implementación de una Interfaz en Java

Este archivo contiene un ejemplo de implementación del concepto de **interfaz** en Java, utilizando el caso de figuras geométricas para ilustrar cómo funciona el polimorfismo en este contexto.

## Descripción del Ejemplo

### Interfaz Figura:
La interfaz `Figura` define dos métodos abstractos:
- `calcularArea()`: Para calcular el área de una figura.
- `calcularPerimetro()`: Para calcular el perímetro de una figura.

### Clases que Implementan la Interfaz:
1. **Circulo**: Implementa la interfaz `Figura` y proporciona su propia implementación para calcular el área y el perímetro de un círculo.
2. **Rectangulo**: Implementa la interfaz `Figura` y proporciona su propia implementación para calcular el área y el perímetro de un rectángulo.

### Código:

```java
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
```

## Cómo Ejecutar el Código:

1. Guarda el código en un archivo llamado `Main.java`.
2. Compílalo usando el comando:
   ```bash
   javac Main.java
   ```
3. Luego, ejecuta el programa con el comando:
   ```bash
   java Main
   ```

## Resultado Esperado:

```
Área del círculo: 78.53981633974483
Perímetro del círculo: 31.41592653589793
Área del rectángulo: 24.0
Perímetro del rectángulo: 20.0
```

Este ejemplo demuestra cómo se pueden usar interfaces en Java para definir contratos que deben ser implementados por diferentes clases.
