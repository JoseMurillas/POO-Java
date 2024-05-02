/*
 * Este programa permite al usuario ingresar un arreglo de números y luego ordenarlo de manera ascendente y descendente.
 */
package javaestructuradatos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que representa un objeto Ejercicio3.
 */
public class Ejercicio3 {
    private Scanner lc;
    private int[] vector;
    private int tamahoArray;
    private boolean registro;
    
    /**
     * Constructor de la clase Ejercicio3.
     */
    public Ejercicio3() {
        lc = new Scanner(System.in);
    }
    
    /**
     * Solicita al usuario ingresar el tamaño del arreglo.
     */
    public void TamahoArreglo() {
        System.out.println("Ingresa el tamaño del vector: ");
        tamahoArray = lc.nextInt();
        vector = new int[tamahoArray];
    }
    
    /**
     * Permite al usuario ingresar los datos del arreglo.
     */
    public void IngresarDatos() {
        for(int i = 0; i < tamahoArray; i++) {
            System.out.println("Ingresa los datos del arreglo");
            vector[i] = lc.nextInt();
        }
    }
    
    /**
     * Ordena el arreglo de menor a mayor.
     */
    public void OrdenMenorMayor() {
        for (int i = 0; i < tamahoArray - 1; i++) {
            registro = true;
            for (int j = 0; j < tamahoArray - i - 1; j++) {
                if (vector[j] > vector[j+1]) {
                    int intercambio = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = intercambio;
                    registro = false;
                }
            }
            if (registro == true) {
                break;
            }
        }
        System.out.println("---- Arreglo Ordenado de Menor a Mayor ----");
        String menorMayor = Arrays.toString(vector);
        System.out.println(menorMayor);
    }
    
    /**
     * Ordena el arreglo de mayor a menor.
     */
    public void OrdenMayorMenor() {
        for (int i = 0; i < tamahoArray - 1; i++) {
            registro = true;
            for (int j = 0; j < tamahoArray - i - 1; j++) {
                if (vector[j] < vector[j+1]) {
                    int intercambio = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = intercambio;
                    registro = false;
                }
            }
            if (registro == true) {
                break;
            }
        }
        System.out.println("---- Arreglo Ordenado de Mayor a Menor ----");
        String mayorMenor = Arrays.toString(vector);
        System.out.println(mayorMenor);
    }
    
    /**
     * Imprime el arreglo original ingresado por el usuario.
     */
    public void imprimir() {
        System.out.println("---- Arreglo Original ----");
        String original = Arrays.toString(vector);
        System.out.println(original);
    }
    
    /**
     * Método principal que ejecuta el programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Ejercicio3 vectorOrden;
        vectorOrden = new Ejercicio3();
        vectorOrden.TamahoArreglo();
        vectorOrden.IngresarDatos();
        vectorOrden.imprimir();
        vectorOrden.OrdenMayorMenor();
        vectorOrden.OrdenMenorMayor();   
    }
}
