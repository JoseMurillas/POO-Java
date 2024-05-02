/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaestructuradatos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Ejercicio5 {
        private Scanner lc;
    private int [][] matriz;
    
    public Ejercicio5(){
        lc = new Scanner (System.in);
        matriz = new int[3][3];
    }
    public void ValoresMatriz(){
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }
    public void DiagonalPrincipal(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
            }
        }
    }
    
    public static void main (String[] args){
        Ejercicio5 diseho;
        diseho = new Ejercicio5();
        diseho.ValoresMatriz();
        diseho.DiagonalPrincipal();
    }
}

