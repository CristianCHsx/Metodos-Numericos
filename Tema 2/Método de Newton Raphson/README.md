# **Método de Newton Rapshon**

Es un metodo iterativo que busca resolver ecuaciones de una forma mas aproxmiada. Esto debido a la utilizacion de una tangente en la curva de la ecuacion.
Este curva cruza por algun punto del eje x, lo cual nos indicaria en que parte estaria la raiz.

Un agregado que tiene este metodo, es la utilizacion de derivadas ya que se tiene que derivar la funcion principal para encontrar el valor de la pendiente. Esto ira aproximara el valor hacia la raiz.

Para este metodo se tiene que tener un valor el cual sera el numero con el que empezará a trabajar con todo el proceso del metodo, el cual es pasar por la f(x) principal y f'(x).
Despues se utilizara la siguiente formula:

![image](https://github.com/CristianCHsx/Metodos-Numericos/assets/162630564/a72f966d-510b-48bf-b0b6-74ce2662d7ee)

Donde xi es el valor de valor inicial.

El resultado de este valor sera por el cual se remplazara x para la siguiente iteracion. Todo esto hasta llegar a la raiz o hasta que el valor llegue de f(x) llegue a 0.

## **Algoritmo**

1. Se elige un punto inicial x0 cercano a la raíz buscada
2. Se calcula la pendiente f′(x0) de la función en el punto x0
3. Se utiliza la ecuación de la tangente para encontrar el punto de intersección con el eje x, que se denomina siguiente aproximación x1
4. Se repiten los pasos 2 y 3 utilizando la última aproximación como punto inicial, hasta que se alcance la precisión deseada

### Aplicaciones

Este metodo se puede usar parar resolver gran variedad de ecuaciones, aunque si se conoce que la ecuacion tiene mas de una posible raiz o raices multiples. Se tendra que ingresar como valor inicial un valor cercano a la raiz.
Por otro lado este metodo puede ser utilizado para:
+ Calcular las raices de ecuaciones polinomicas
+ Aproximarse a soluciones de ecuaciones diferenciales
