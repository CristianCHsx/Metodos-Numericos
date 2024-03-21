# **Método de la regla falsa**

Este método tiene una similitud al metodo de biseccion ya que por un lado en un metodo cerrado, en cambio este metodo puede ser mas efectivo a la hora de resolver ecuaciones no lineales.
Ya que este principalmente trada lineas rectas hacia las raices provocando que sea mas aproximado el resultado. Esto da un resultado peculiar ya que tiene similaridades con un triangulo, esto lo hace mas facil a la hora aproximar a un resultado.

En cuanto al proceso es bastante similiar al metodo de biseccion, solo que la formula de Xr (xmitad) es diferente:

![image](https://github.com/CristianCHsx/Metodos-Numericos/assets/162630564/a4cb929e-99b3-4f65-9b5e-3714b6006c3b)


Esta es la formula de la falsa posicion. Con esta se podra calcular el valor de Xr el cual momentos despues sera remplazado por uno de los intervalos de la ecuacion [a,b].
De esta manera puede asegurarse que la raiz siempre estara encerrada entre los intervalos acercandose aun mas a la obtencion de la raiz.

## Algoritmo

1. Se elige un intervalo inicial [a,b] que contiene la raíz buscada.
2. Se evalúa la función en los extremos del intervalo, f(a) y f(b).
3. Se calcula la falsa posición
4. Se evalúa la función en la falsa posición c.
5. Se compara el valor de la función en la falsa posición con el valor de la función en los extremos del intervalo.
6. Se elimina el subintervalo que no contiene la raíz.
7. Se repiten los pasos 2 a 6 utilizando el nuevo intervalo como intervalo inicial, hasta que se alcance la precisión deseada.
