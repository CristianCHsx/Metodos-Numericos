# **Metodo de Biseccion**
Este método se utiliza para encontrar la raices de una ecuacion dada, normalmente suelen ser ecuaciones de una variable o no lineales.
Esta trata de aproximarse a la solucion de una funcion dentro de un intervalo cerrado o abierto. [a,b] 
Algunos autores lo suelen expresar de la siguiente manera los intervalos (xi,xu)

Por otro lado se debe de calcular un valor llamado Xr (Xmitad) la cual es el valor que esta a la mitad de los intervalos [a,b]. Esto se calcula con la siguiente formula
$xr=(xi-xu)/2$

El proceso es ir partiendo mitades entre estos intervalos hasta poder encontrar la raiz y atraves de la mutliplicacion de f(a) por f(xr) se puede determinar hacia que lado de la mitad cortada o subintervalo (respecto al signo que tenga el resutlado) se puede encontrar la raiz.
Este metodo da una aproximacion del resultado, esto dependiendo de la toleracia del error que se tenga.

**Este metodo se caracteriza en ir obtieniendo mitades hasta encontrar la raiz.**

## **Algoritmo**

![image](https://github.com/CristianCHsx/Metodos-Numericos/assets/162630564/26dda653-ad6e-4c49-84e1-2f73609fe814)
(Chapra, 2006)


### Aplicaciones
Este metodo es util para encontrar soluciones a ecuciones cuando su solucion analitica resulta complicada, en esos casos el método de biseccion es de gran ayudar para encontrar la raiz al problema.
Ademas es bastante utilizado en el campo de la ingenieria para encontrar soluciones a diversos problemas. Como puede ser la resolucion de ecuaciones diferenciales.

Como tambien puede ser el caso en que este mismo metodo puede ser utilizado para la creacion y utilizacion para el algoritmo de busqueda, el cual tiene un proceso similar a la hora que buscar los datos dentro de una lista.
