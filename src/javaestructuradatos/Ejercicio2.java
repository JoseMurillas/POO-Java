/*
 * Este programa permite al usuario ingresar dos arreglos de enteros del mismo tamaño,
 * intercambia los elementos de los arreglos entre sí y luego imprime los arreglos originales
 * y los arreglos con los elementos intercambiados.
 */
package JavaEstructuraDatos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que representa un objeto Ejercicio2.
 */
public class Ejercicio2 {
    private Scanner lc;
    private int[] A;
    private int[] B;
    private int[] a;
    private int[] b;
    private int tamahoArray;
    
    /**
     * Constructor de la clase Ejercicio2.
     * @param tamahoArray El tamaño de los arreglos.
     */
    public Ejercicio2(int tamahoArray) {
        lc = new Scanner(System.in);
        this.tamahoArray = tamahoArray;
    }
    
    /**
     * Solicita al usuario ingresar el tamaño de los arreglos.
     */
    public void TamahnoArreglo() {
        System.out.print("Ingresa el tamaño de los dos arreglos: ");
        tamahoArray = lc.nextInt();
        A = new int[tamahoArray];
        B = new int[tamahoArray];
        a = new int[tamahoArray];
        b = new int[tamahoArray];
    }
    
    /**
     * Permite al usuario ingresar los elementos de los arreglos.
     */
    public void IngresaDatos() {
        for(int i = 0; i < tamahoArray; i++) {
            System.out.println("Ingresa el valor del array 1 en la posición: " + i);
            A[i] = lc.nextInt();
        }
        for(int j = 0; j < tamahoArray; j++) {
            System.out.println("Ingresa el valor del array 2 en la posición: " + j);
            B[j] = lc.nextInt();
        }
    }
    
    /**
     * Intercambia los elementos de los arreglos entre sí.
     */
    public void Intercambio() {
        for(int i = 0; i < tamahoArray; i++) {
            a[i] = B[i];
            b[i] = A[i];
        }
        for(int j = 0; j < tamahoArray; j++) {
            A[j] = a[j];
            B[j] = b[j];
        }
    }
    
    /**
     * Imprime los arreglos originales y los arreglos con los elementos intercambiados.
     */
    public void imprimir() {
        System.out.println("---- Array Normal ----");
        String Anormal = Arrays.toString(b);
        System.out.println("A = " + Anormal);
        String Bnormal = Arrays.toString(a);
        System.out.println("B = " + Bnormal);
        
        System.out.println("---- Intercambio ----");
        String AIntercambio = Arrays.toString(A);
        System.out.println("A = " + AIntercambio);
        String BIntercambio = Arrays.toString(B);
        System.out.println("B = " + BIntercambio);
    }
    
    /**
     * Método principal que ejecuta el programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main (String[] args) {
        Ejercicio2 intercambio1;
        intercambio1 = new Ejercicio2(0);
        intercambio1.TamahnoArreglo();
        intercambio1.IngresaDatos();
        intercambio1.Intercambio();
        intercambio1.imprimir();
    }
}
