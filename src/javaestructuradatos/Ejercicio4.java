/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaestructuradatos;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Ejercicio4 {
    private Scanner lc;
    private int [][] matriz;
    int [] maximo;
    int [] minimo;

    
    public Ejercicio4(){
        lc = new Scanner(System.in);
        matriz = new int[3][3];
        minimo = new int []{Integer.MAX_VALUE, Integer.MAX_VALUE};
        maximo = new int []{Integer.MIN_VALUE, Integer.MIN_VALUE};
    }
    
    public void ValoresMatriz(){
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }
    
    public void ValoresGrandes (){
        
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
    public void ValoresPequeños (){
       
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
    public void Imprimir(){    
        System.out.println("<---- Matriz Generada ---->");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | "+matriz[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println("<----Arreglo Numeros Maximos---->");
        String numeroMaximo = Arrays.toString(maximo);
        System.out.println(numeroMaximo);
        System.out.println("<----Arreglo Numeros Minimos---->");
        String numeroMinimo = Arrays.toString(minimo);
        System.out.println(numeroMinimo);
    }
    public static void main (String[] args){
        Ejercicio4 comparacion;
        comparacion = new Ejercicio4();
        comparacion.ValoresMatriz();
        comparacion.ValoresGrandes();
        comparacion.ValoresPequeños();
        comparacion.Imprimir();
        
    }
}
