# **Método de Gauss-Seidel**

Es un metodo iterativo el cual se utiliza para hallar soluciones aproxmiadas de un sistema de ecuaciones algrebica lineal, con una precion arbitrariamente elegida.

Esta se aplica en matrices cuadradas con elementos no nulos en sus diagonales ademas de que convergencia se garantiza si la matriz es diagonalmente dominante.

## Algoritmo

1. Se obtiene el sistema de ecuaciones
2. Se crea el sistema matricial del sistema de ecuaciones
3. Se empieza a recorrer el sistema por fila para
   - Calcular el valor para cada incognita de la ecucacion
     - Si esta en la posicion i==j dividira la incognita / i
     - Si se esta en una posicion i!=j se restara a la incognita
   - Se actualiza el valor de la incognita por la obtenida aproximadamente
   - Se obtiene el error con x1Anterior, x2Anterior, x3Anterior con x1,x2,x3
   - Pasa a la siguiente fila hasta terminar
4. Se repite el paso 3 hasta que el valor del error sea menor al valor de error dado
