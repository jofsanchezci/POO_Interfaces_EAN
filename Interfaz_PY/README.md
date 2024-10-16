
# Ejemplo de Implementación de una Interfaz en Python

Este archivo contiene un ejemplo de implementación del concepto de **interfaz** en Python, utilizando clases abstractas para ilustrar cómo se puede lograr el polimorfismo en este lenguaje.

## Descripción del Ejemplo

### Interfaz Figura:
La clase `Figura` utiliza el módulo `abc` (Abstract Base Classes) para definir dos métodos abstractos:
- `calcular_area()`: Para calcular el área de una figura.
- `calcular_perimetro()`: Para calcular el perímetro de una figura.

### Clases que Implementan la Interfaz:
1. **Circulo**: Implementa los métodos abstractos para calcular el área y el perímetro de un círculo.
2. **Rectangulo**: Implementa los métodos abstractos para calcular el área y el perímetro de un rectángulo.

### Código:

```python
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
```

## Cómo Ejecutar el Código:

1. Guarda el código en un archivo llamado `main.py`.
2. Ejecuta el archivo con el siguiente comando:
   ```bash
   python main.py
   ```

## Resultado Esperado:

```
Área del círculo: 78.54
Perímetro del círculo: 31.416
Área del rectángulo: 24
Perímetro del rectángulo: 20
```

Este ejemplo demuestra cómo se pueden usar clases abstractas en Python para definir contratos que deben ser implementados por diferentes clases.
