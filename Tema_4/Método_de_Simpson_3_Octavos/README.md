# Método de Simpson 3/8

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
