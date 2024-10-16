
# Ejemplo de Implementación de una Interfaz en Kotlin

Este archivo contiene un ejemplo de implementación del concepto de **interfaz** en Kotlin, utilizando el caso de figuras geométricas para ilustrar cómo se logra el polimorfismo en este lenguaje.

## Descripción del Ejemplo

### Interfaz Figura:
La interfaz `Figura` define dos métodos abstractos:
- `calcularArea()`: Para calcular el área de una figura.
- `calcularPerimetro()`: Para calcular el perímetro de una figura.

### Clases que Implementan la Interfaz:
1. **Circulo**: Implementa la interfaz `Figura` y proporciona su propia implementación para calcular el área y el perímetro de un círculo.
2. **Rectangulo**: Implementa la interfaz `Figura` y proporciona su propia implementación para calcular el área y el perímetro de un rectángulo.

### Código:

```kotlin
// Definición de la interfaz Figura
interface Figura {
    fun calcularArea(): Double
    fun calcularPerimetro(): Double
}

// Implementación de la clase Circulo
class Circulo(private val radio: Double) : Figura {

    // Implementación del método calcularArea
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }

    // Implementación del método calcularPerimetro
    override fun calcularPerimetro(): Double {
        return 2 * Math.PI * radio
    }
}

// Implementación de la clase Rectangulo
class Rectangulo(private val largo: Double, private val ancho: Double) : Figura {

    // Implementación del método calcularArea
    override fun calcularArea(): Double {
        return largo * ancho
    }

    // Implementación del método calcularPerimetro
    override fun calcularPerimetro(): Double {
        return 2 * (largo + ancho)
    }
}

// Función principal para ejecutar el programa
fun main() {
    // Crear un círculo con radio 5
    val miCirculo: Figura = Circulo(5.0)
    println("Área del círculo: ${miCirculo.calcularArea()}")
    println("Perímetro del círculo: ${miCirculo.calcularPerimetro()}")

    // Crear un rectángulo con largo 4 y ancho 6
    val miRectangulo: Figura = Rectangulo(4.0, 6.0)
    println("Área del rectángulo: ${miRectangulo.calcularArea()}")
    println("Perímetro del rectángulo: ${miRectangulo.calcularPerimetro()}")
}
```

## Cómo Ejecutar el Código:

1. Guarda el código en un archivo llamado `Main.kt`.
2. Compílalo usando el siguiente comando:
   ```bash
   kotlinc Main.kt -include-runtime -d Main.jar
   ```
3. Ejecuta el archivo JAR generado:
   ```bash
   java -jar Main.jar
   ```

## Resultado Esperado:

```
Área del círculo: 78.53981633974483
Perímetro del círculo: 31.41592653589793
Área del rectángulo: 24.0
Perímetro del rectángulo: 20.0
```

Este ejemplo demuestra cómo se pueden usar interfaces en Kotlin para definir contratos que deben ser implementados por diferentes clases.
