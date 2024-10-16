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
