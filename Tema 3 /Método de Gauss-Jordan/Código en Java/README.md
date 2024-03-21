# **Método de Gauss-Jordan**

Es un procedimiento para resolver sistemas de ecuacinoes con 3 incognitas.

El objetivo es tratar de convertir el sistema de ecuaciones a un sistema escalonado, para esto se puede hacer cualquier operacion como dividir, sumar, restar o multiplcar para cambiar el orden de las filas. Para que en cada posicion 1:1, 2:2, 3:3 (llamados pivotes), etc pueda convertirse en 1 y los terminos restantes sean convertidos en 0.

Para convertir en 1 se tiene que dividir el valor del pivote por si mismo en toda la fila
Para convertir en 0 se tiene sustituir una fila por la suma de la misma fila mas otra fila multiplicada por un numero.


## **Algoritmo**

1. Convertir sistema de ecuaciones en una matriz aumentada
2. Utilizar operaionces para convertir la matriz en una matriz diagonal
   - Intercambiar filas
   - Multiplicar filas por un numero !=0
   - Sumar a una fila un multiplo de otra fila
3. Regresar al paso 2
4. Resolver el sistema ecuaciones apartir de la matriz diagonal
