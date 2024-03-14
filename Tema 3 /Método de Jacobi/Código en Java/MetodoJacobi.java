/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodojacobi;

import java.util.Scanner;

public class MetodoJacobi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del sistema
        System.out.print("Ingrese el tamaño del sistema (2, 3 o 4): ");
        int tam = scanner.nextInt();

        // Validar el tamaño del sistema
        if (tam < 2 || tam > 4) {
            System.out.println("Tamaño del sistema no válido. Debe ser 2, 3 o 4.");
            return;
        }

        // Solicitar la matriz de coeficientes y el vector de resultados
        double[][] matrizCoeficientes = new double[tam][tam];
        double[] vectorResultados = new double[tam];

        System.out.println("Ingrese la matriz de coeficientes:");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("Ingrese el elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrizCoeficientes[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Ingrese el vector de resultados:");
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese el elemento [" + (i + 1) + "]: ");
            vectorResultados[i] = scanner.nextDouble();
        }

        // Definir el vector inicial (puede ser cualquier valor)
        double[] vectorInicial = new double[tam];

        // Definir el número máximo de iteraciones
        int maxIteraciones = 1000;
        double[] vectorAnterior = new double[tam]; 
        // Realizar iteraciones en el método de Jacobi
        for (int k = 0; k < maxIteraciones; k++) {
            System.out.print("Iteración " + (k + 1) + ": ");

            // Calcular nuevos valores de x
            double[] x = new double[tam];
            for (int i = 0; i < tam; i++) {
                double sum = 0;
                for (int j = 0; j < tam; j++) {
                    if (j != i) {
                        sum += matrizCoeficientes[i][j] * vectorInicial[j];
                    }
                }
                x[i] = (vectorResultados[i] - sum) / matrizCoeficientes[i][i];
            }
            
             double errorAbsoluto = calcularErrorAbsoluto(x, vectorAnterior);

            if (k > 0 && errorAbsoluto < 0.05) {
                System.out.println("Error absoluto menor al 5% en la iteración " + (k + 1) + ".");
                break; // Romper el ciclo si el error es menor al 1%
            }
            // Mostrar resultados de la iteración
            for (int i = 0; i < tam; i++) {
                System.out.printf("x%d = %.4f", i + 1, x[i]);
            }
            System.out.println();

            // Actualizar el vector inicial para la próxima iteración
            System.arraycopy(x, 0, vectorInicial, 0, tam);
            System.arraycopy(x, 0, vectorAnterior, 0, tam);
            
        }

        
    }
    private static double calcularErrorAbsoluto(double[] vectorActual, double[] vectorAnterior) {
        double maxError = 0;
        for (int i = 0; i < vectorActual.length; i++) {
            double error = Math.abs((vectorActual[i] - vectorAnterior[i]) / Math.abs(vectorActual[i]));
            maxError = Math.max(maxError, error);
        }
        return maxError;
    }
}
