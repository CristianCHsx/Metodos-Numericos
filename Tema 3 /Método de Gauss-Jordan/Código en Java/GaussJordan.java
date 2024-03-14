package gauss.jordan;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class GaussJordan {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de ecuaciones en el sistema: ");
        int n = scanner.nextInt(); // Lee el número de ecuaciones del usuario

        double[][] coefficients = new double[n][n + 1]; // Matriz extendida [coeficientes | términos independientes]

        // Lee los coeficientes y términos independientes del usuario
        System.out.println("Por favor, ingrese los coeficientes de las ecuaciones y los términos independientes:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ecuación " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el coeficiente de x" + (j + 1) + ": ");
                coefficients[i][j] = scanner.nextDouble();
            }
            System.out.print("Ingrese el término independiente de la ecuación " + (i + 1) + ": ");
            coefficients[i][n] = scanner.nextDouble();
        }

        // Aplica el método de Gauss-Jordan
        for (int i = 0; i < n; i++) {
            // Hace que el coeficiente diagonal actual sea 1
            double divisor = coefficients[i][i];
            for (int j = i; j <= n; j++) {
                coefficients[i][j] /= divisor;
            }
            // Hace que todos los otros coeficientes en la columna sean 0
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = coefficients[k][i];
                    for (int j = i; j <= n; j++) {
                        coefficients[k][j] -= factor * coefficients[i][j];
                    }
                }
            }
        }

        // Imprime la solución
        System.out.println("La solución del sistema de ecuaciones es:");
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + coefficients[i][n]);
        }

        scanner.close();
    }
    
}
