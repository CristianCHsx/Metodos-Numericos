# **Método de Jacobi**

Este método es iterativo que se usa para resolver sistemas de ecuaciones lineales de cualquier tamaño.

Se basa principalmente en calcular sucesivamente de las raices de las ecucaiones, utilizando los valores obtenidos en cada iteraciones para remplazarlos en la nueva itereacion para obtener asi aproximaciones.

## **Algortimo**

1. Se obtiene el sistema de ecuaciones
2. Se crea el sistema matricial del sistema de ecuaciones
3. Se empieza a recorrer el sistema por fila para:
   - Calcular el valor de cada variable (x1,x2,x3)
     - Esto si la posicion i==j  dividira xn/i
     - Si i!=j entonces xn-i
  - Se actulizan los valores nuevos de x1,x2,x3,xn
  - Se obtiene el error con x1Anterior, x2Anterior, x3Anterior con x1,x2,x3
4. Repetir paso 3 hasta que
  - Error Relativo < Error Tolerado
