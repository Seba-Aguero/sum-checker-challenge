# Sum Checker Challenge
Este proyecto implementa dos soluciones al problema de encontrar si existe un par de números en un array cuya suma sea igual a un valor objetivo.

## Lenguaje utilizado
Java (versión 17)

## Archivos
- `SumCheckerSimple.java` → Solución sencilla con complejidad O(n²)
- `SumCheckerOptimized.java` → Solución optimizada con complejidad O(n)

## Descripción de las soluciones

### Solución Simple
Utiliza dos bucles anidados.
Para cada elemento, revisa si hay otro que complete la suma requerida.

### Solución Optimizada
Utiliza un HashSet para recordar complementos.
Para cada elemento, revisa si su complemento (requiredSum - num) ya fue visto.

## Instrucciones para compilar y ejecutar

1. Compilar:
   ```
   javac SumCheckerSimple.java

   javac SumCheckerOptimized.java
   ```

2. Ejecutar:
   ```
   java SumCheckerSimple

   java SumCheckerOptimized
   ```

## Supuestos
- El array puede contener enteros repetidos.
- Todos los elementos y el valor objetivo ("requiredSum") son números enteros.
- No se requiere entrada desde consola; el archivo contiene ejemplos internos.