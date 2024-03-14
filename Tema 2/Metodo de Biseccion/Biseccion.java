package biseccion;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Biseccion {
    
    public static double f(double x){
        return Math.pow(x, 3)-x-1;
    }
   
    public static void main(String[] args) {
        DecimalFormat de = new DecimalFormat("#.0000");
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingresa el valor de a");
        double a = sc.nextDouble();
        System.out.println("Ingrsa el valor de de b");
        double b = sc.nextDouble();
        System.out.println("Ingresa la toleracia de error");
        double tol = sc.nextDouble();
        
        int iteracion = 0;
        double errorRel=0, errorRelAnt=0,errorVV=0,fxm=0,Xmitad=0,fa=0,fb=0,xant=0,fafa=0;
        
        tol=tol*100;
        do{
            xant=Xmitad;
            Xmitad = (a+b)/2;   
            fafa=f(a)*f(Xmitad);
            
            if(fafa>0){
               
                a=Xmitad;          
            }
            if(fafa<0){
                
                b=Xmitad;
            }
            if(iteracion==0){
                errorRel=tol+1;
            }else{
                errorRel=(Math.abs((Xmitad-xant)/Xmitad))*100;
            }
            
            iteracion+=1;
            

            
        }while(errorRel>=tol);
        System.out.println("El valor aproximado de la raiz es: "+de.format(xant));
        
        
    }
    
    
    
}
