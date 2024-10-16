from abc import ABC, abstractmethod

# Definición de la interfaz Figura
class Figura(ABC):

    # Método abstracto para calcular el área
    @abstractmethod
    def calcular_area(self):
        pass

    # Método abstracto para calcular el perímetro
    @abstractmethod
    def calcular_perimetro(self):
        pass

# Implementación de la clase Circulo
class Circulo(Figura):
    def __init__(self, radio):
        self.radio = radio

    # Implementación del método calcular_area
    def calcular_area(self):
        return 3.1416 * self.radio * self.radio

    # Implementación del método calcular_perimetro
    def calcular_perimetro(self):
        return 2 * 3.1416 * self.radio

# Implementación de la clase Rectangulo
class Rectangulo(Figura):
    def __init__(self, largo, ancho):
        self.largo = largo
        self.ancho = ancho

    # Implementación del método calcular_area
    def calcular_area(self):
        return self.largo * self.ancho

    # Implementación del método calcular_perimetro
    def calcular_perimetro(self):
        return 2 * (self.largo + self.ancho)

# Clase principal para ejecutar el programa
if __name__ == "__main__":
    # Crear un círculo con radio 5
    mi_circulo = Circulo(5)
    print("Área del círculo:", mi_circulo.calcular_area())
    print("Perímetro del círculo:", mi_circulo.calcular_perimetro())

    # Crear un rectángulo con largo 4 y ancho 6
    mi_rectangulo = Rectangulo(4, 6)
    print("Área del rectángulo:", mi_rectangulo.calcular_area())
    print("Perímetro del rectángulo:", mi_rectangulo.calcular_perimetro())
