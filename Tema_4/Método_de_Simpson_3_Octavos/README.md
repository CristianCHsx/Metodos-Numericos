# Método de Simpson 3/8
Es un metodo de integracion numerica que busca aproximar el resultado a una integral definida. Este método es una variente al metodo de simpson de 1/3.

La diferencia clave entre este y el otro método es en la forma de caso particula que se puede usar. Puede considerarse un poco mas exacto al resultado pero con unos requisitos previos.

Por ejemplo el numero de intervalos que se pueden utilizar deben ser multiplos de 3. Ya que regla lo maneja asi, utilizando puntos establecidos para ta tener un medida mas aprxomiada.

Si los valores de los intervalos fueran diferentes a un multiplo de 3 no se podria aplicar este metodo.
De igual modo existe la forma simple de aplicar y la forma compuesta (multivariable)

∫[a,b] f(x) dx ≈ (3h/8) * [f(a) + 3f(m1) + 3f(m2) + f(b)]

# Codigo en Java
```java
package simpsonun8;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author crist
 */
public class SimpsonUn8 {
    
    
    public static double f(double x){
        return 1/x;
    }

    public static double simpSimple(double a, double b, int n){
        double h,sum=0;
        double xi[] = new double [n+1];
        h=(b-a)/3;
        for (int i = 0; i <= n; i++) {
            xi[i]=a;
            a+=h;
            if(i>0&&i<n){
                sum += 3*f(xi[i]);
            }else{
                sum +=f(xi[i]);
            }   
        }
      
        sum = ((3*h)/8)*sum;
        
        return sum;
    }
    
    public static double simpCompuesta(double a, double b, int n){
        double h,sum=0;
        double xi[] = new double [n+1];
        h=(b-a)/n;
        
        for (int i = 0; i <= n; i++) {
            xi[i]=a;
            a+=h;
            if(i==0||i==n){
                sum+=f(xi[i]);
            }else if(i%3==0){
                sum+=2*f(xi[i]);
            }else{
                sum+=3*f(xi[i]);
            }
        }
        
        sum = ((3*h)/8)*sum;
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.####");
        double a,b;
        int n;
        
        System.out.println("Ingresa el valor de a:");
        a = sc.nextDouble();
        System.out.println("Ingresa el valor de b:");
        b = sc.nextDouble();
        System.out.println("Ingresa el numero de intervalos(n):");
        n = sc.nextInt();
        
        if(n==3){
            System.out.println(df.format(simpSimple(a,b,n)));
        }else if (n%3==0){
            System.out.println(df.format(simpCompuesta(a,b,n)));
        }     
        
    }
    
}

```
