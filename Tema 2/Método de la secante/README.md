# **Método de la secante**

El método de la secante en un metodo abierto, se suele a similar al metodo de newton rapshon sin embargo en el metodo de newton raphson se tiene que calcular una derivada y esto en algunos casos puede ser complicado de calcular, asi que el metodo de la secante viene a facilitarlo un poquito ya que se puede calcular a traves de una diferencia finita dividida hacia atras o de otro modo utilizando una recta secante entre dos puntos.

La aproximacion se puede obtener con la siguiente formula:


![image](https://github.com/CristianCHsx/Metodos-Numericos/assets/162630564/d21e395e-b435-442f-ba7a-7ec76ef6801f)


En este metodo no se necesitan intervalos pero se necesitan de dos valores propuestos para poder iniciar con las iteraciones, estos son Xi y Xi-1.

## **Algoritmo**

1. Se dan los valores de: Xi y Xi-1
2. Se calcula $f(Xi) y f(Xi-1)$
3. Se obtiene $Xi+1$ con la formula
4. Se cambian los valores de Xi y Xi-1 a lo obtenido con la formula
     - Xi-1 = Xi
     - Xi= Xi+1
5. Regresa al paso 2 para encontrar la nueva raiz
