# Método de Simpson 1/3



```java
package simpson.pkg1tercio;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author crist
 */
public class Simpson1tercio {
    
    public static double f(double x){
        return (5*Math.pow(x, 2))-x/3;
    }
    
    public static double simpSimple(double a, double b){
        double cL = (a+b)/2;
        double res = ((b-a)/6)*(f(a)+(4*f(cL))+f(b));
        return res;
    }
    
    public static double simpCompuesto(double a, double b, int n){
        double h,x=a,sum=0;
        double xi[] = new double[n+1];
        h=(b-a)/n;
       
        for (int i = 0; i <= n; i++) {
            xi[i]= x;
            x+=h;
            if(i==0||i==n){
                sum+=f(xi[i]);
            }else if((i%2)==0){
                sum+=2*f(xi[i]);
            }else{
                sum+=4*f(xi[i]);
            }
        }
        
        sum = (h/3)*sum;
        
        return sum;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.####");
        double a,b;
        int n;
        System.out.println("------------------Método de Simpson------------------");
        System.out.println("Ingresa el valor de a:");
        a = sc.nextDouble();
        System.out.println("Ingresa el valor de b:");
        b = sc.nextDouble();
        System.out.println("Ingresa el numero de intervalos(n):");
        n = sc.nextInt();
        
        if(n<2){
            System.out.println("Se necesita por lo menos dos intervalos para operar");
        }
        else if(n==2){
            System.out.println(df.format(simpSimple(a,b)));
        }else{
            System.out.println(df.format(simpCompuesto(a,b,n)));
        }
    }
    
}

```
