/*
 * Este programa genera una matriz de 4x4 con valores aleatorios y realiza varias operaciones con ella,
 * como imprimir la matriz, la diagonal principal, la diagonal secundaria, las esquinas, el elemento central
 * y los vectores centrales.
 */
package javaestructuradatos;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que representa un objeto Ejercicio5.
 */
public class Ejercicio5 {
    private Scanner lc;
    private int[][] matriz;
    
    /**
     * Constructor de la clase Ejercicio5.
     */
    public Ejercicio5() {
        lc = new Scanner(System.in);
        matriz = new int[4][4];
    }
    
    /**
     * Método para generar valores aleatorios en la matriz.
     */
    public void ValoresMatriz() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        System.out.println("\n<---- Matriz ---->");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" | " + matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
    /**
     * Método para imprimir la diagonal principal de la matriz.
     */
    public void DiagonalPrincipal() {
        System.out.println("<---- Diagonal Principal ---->");
        for (int i = 0; i < 4; i++) {
            System.out.println(" | " + matriz[i][i] + " | ");
        }
        System.out.println("");
    }
    
    /**
     * Método para imprimir la diagonal secundaria de la matriz.
     */
    public void DiagonalSecundaria() {
        System.out.println("<---- Diagonal Secundaria ---->");
        for (int i = 0; i < 4; i++) {
            System.out.println(" | " + matriz[i][3 - i] + " | ");
        }
        System.out.println("");
    }

    /**
     * Método para imprimir las esquinas de la matriz.
     */
    public void Esquinas() {
        System.out.println("<---- Esquinas ---->");
        for (int i = 0; i < 4; i++) {
            System.out.println(" | " + matriz[i][0] + " | " + matriz[i][3] + " | ");
            i++;
            i++;
        }
        System.out.println("");
    }
    
    /**
     * Método para imprimir el elemento central de la matriz.
     */
    public void Central() {
        System.out.println("<---- Central ---->");
        for (int i = 0; i < 4; i++) {
            System.out.println(" | " + matriz[i][1] + " | ");
        }
        System.out.println("");
    }
    
    /**
     * Método para imprimir los vectores centrales de la matriz.
     */
    public void VectorCentral() {
        System.out.println("<---- Vector Central ---->");
        for (int i = 0; i < 4; i++) {
            System.out.print(" | " + matriz[1][i] + " | ");
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.print(" | " + matriz[2][i] + " | ");
        }
        System.out.println("");
    }
    
    /**
     * Método principal que ejecuta el programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Ejercicio5 diseho;
        diseho = new Ejercicio5();
        diseho.ValoresMatriz();
        diseho.DiagonalPrincipal();
        diseho.DiagonalSecundaria();
        diseho.Esquinas();
        diseho.Central();
        diseho.VectorCentral();
    }
}
