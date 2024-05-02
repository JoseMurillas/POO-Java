/*
 * Este programa genera una matriz de 3x3 con valores aleatorios, encuentra los dos valores más grandes y los dos valores más pequeños en la matriz,
 * y luego imprime la matriz junto con los arreglos que contienen los valores extremos.
 */
package javaestructuradatos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase que representa un objeto Ejercicio4.
 */
public class Ejercicio4 {
    private Scanner lc;
    private int[][] matriz;
    private int[] maximo;
    private int[] minimo;

    /**
     * Constructor de la clase Ejercicio4.
     */
    public Ejercicio4() {
        lc = new Scanner(System.in);
        matriz = new int[3][3];
        minimo = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        maximo = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
    }

    /**
     * Genera valores aleatorios para la matriz.
     */
    public void ValoresMatriz() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    /**
     * Encuentra los dos valores más grandes en la matriz.
     */
    public void ValoresGrandes() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = matriz[i][j];
                if (valor > maximo[0]) {
                    maximo[1] = maximo[0];
                    maximo[0] = valor;
                } else if (valor > maximo[1] && valor != maximo[0]) {
                    maximo[1] = valor;
                }
            }
        }
    }

    /**
     * Encuentra los dos valores más pequeños en la matriz.
     */
    public void ValoresPequeños() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = matriz[i][j];
                if (valor < minimo[0]) {
                    minimo[1] = minimo[0];
                    minimo[0] = valor;
                } else if (valor < minimo[1] && valor != minimo[0]) {
                    minimo[1] = valor;
                }
            }
        }
    }

    /**
     * Imprime la matriz y los arreglos que contienen los valores extremos.
     */
    public void Imprimir() {
        System.out.println("<---- Matriz Generada ---->");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + matriz[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("<---- Arreglo de los dos valores máximos ---->");
        System.out.println(Arrays.toString(maximo));
        System.out.println("<---- Arreglo de los dos valores mínimos ---->");
        System.out.println(Arrays.toString(minimo));
    }

    /**
     * Método principal que ejecuta el programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Ejercicio4 comparacion;
        comparacion = new Ejercicio4();
        comparacion.ValoresMatriz();
        comparacion.ValoresGrandes();
        comparacion.ValoresPequeños();
        comparacion.Imprimir();
    }
}
