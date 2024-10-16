
# Conceptos de Abstracción e Interfaz en Programación Orientada a Objetos (POO)

## Abstracción
La **abstracción** es uno de los pilares fundamentales de la Programación Orientada a Objetos (POO). Este concepto se refiere al proceso de ocultar los detalles complejos de una clase y mostrar solo los aspectos esenciales que son relevantes para el usuario. La abstracción simplifica la complejidad y permite que los programadores trabajen en un nivel de alta generalización sin preocuparse por los detalles internos.

### Ejemplo:
Imagina un coche: los detalles internos como el motor y el sistema eléctrico están ocultos, mientras que el usuario interactúa solo con el volante, los pedales y la palanca de cambios.

En código, la abstracción se logra mediante **clases abstractas** y **métodos abstractos**, donde se define la estructura general, pero los detalles de implementación se dejan a las clases concretas.

### Ventajas de la Abstracción:
- **Simplicidad**: Reduce la complejidad al ocultar detalles irrelevantes.
- **Reusabilidad**: El código abstracto puede ser reutilizado en diferentes contextos.
- **Mantenibilidad**: Facilita la modificación y el mantenimiento del sistema.

## Interfaz
Una **interfaz** es una estructura que define un conjunto de métodos que una clase debe implementar. A diferencia de una clase abstracta, la interfaz no proporciona código concreto, sino que establece los contratos que deben seguir las clases que la implementan.

Las interfaces son útiles para definir comportamientos comunes entre clases no relacionadas, promoviendo flexibilidad y desacoplamiento. Una clase puede implementar varias interfaces.

### Ejemplo:
Si tenemos una interfaz `Vehiculo` con métodos como `arrancar()`, `detener()`, y `acelerar()`, cualquier clase que implemente esta interfaz (como `Coche`, `Moto`, `Bicicleta`) debe proporcionar su propia implementación de estos métodos.

```java
interface Vehiculo {
    void arrancar();
    void detener();
    void acelerar();
}

class Coche implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Coche arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Coche detenido");
    }

    @Override
    public void acelerar() {
        System.out.println("Coche acelerando");
    }
}
```

### Ventajas de las Interfaces:
- **Polimorfismo**: Permite que una clase adopte diferentes comportamientos al implementar múltiples interfaces.
- **Desacoplamiento**: Facilita el diseño de clases independientes, lo que aumenta la flexibilidad del sistema.
- **Múltiples implementaciones**: Una clase puede implementar varias interfaces, evitando las limitaciones de la herencia simple.

## Diferencias clave entre Abstracción e Interfaz:
- Las **clases abstractas** pueden tener métodos con implementación concreta, mientras que las **interfaces** no, salvo excepciones como los métodos por defecto en versiones modernas de Java.
- Una clase puede heredar de **una sola clase abstracta**, pero puede implementar **múltiples interfaces**.

## Ejemplo de Implementación
```java
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

```



1. **Interfaz Animal:** Define dos métodos, sonido() y moverse(), que las clases que implementen la interfaz deben definir.
2. **Clase Perro:** Implementa los métodos de la interfaz Animal, proporcionando su propia lógica para los métodos sonido() y moverse().
3. **Clase Gato:** También implementa la interfaz Animal con su propia lógica.
4. **Clase Main:** Es la clase principal donde se crean los objetos miPerro y miGato, ambos del tipo Animal, pero que se comportan de manera diferente según su implementación.

Esto ilustra el uso del polimorfismo, ya que ambas instancias (miPerro y miGato) se tratan como objetos del tipo Animal, pero ejecutan comportamientos distintos en tiempo de ejecución dependiendo de la clase que implementa la interfaz.
