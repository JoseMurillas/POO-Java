/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaEstructuraDatos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Ejercicio2 {
    private Scanner lc;
    private int []A;
    private int []B;
    private int []a;
    private int []b;
    private int tamahoArray;
    
    public Ejercicio2(int tamahoArray){
        lc = new Scanner(System.in);
        this.tamahoArray = tamahoArray;
    }
    
    public void TamahnoArreglo(){
        System.out.print("Ingresa el tamaño de los dos arreglos: ");
        tamahoArray = lc.nextInt();
        A = new int[tamahoArray];
        B = new int[tamahoArray];
        a = new int[tamahoArray];
        b = new int[tamahoArray];
    }
    
    public void IngresaDatos(){
        for(int i = 0; i < tamahoArray; i++){
            System.out.println("Ingresa el valor del array 1 en la posicion: " + i);
            A[i] = lc.nextInt();
        }
        for(int j = 0; j < tamahoArray; j++){
            System.out.println("Ingresa el valor del array 1 en la posicion: " + j);
            B[j] = lc.nextInt();
        }
    }
    public void Intercambio(){
        for(int i = 0; i < tamahoArray; i++){
            a[i] = B[i];
            b[i] = A[i];
        }
        for(int j = 0; j <tamahoArray; j++){
            A[j] = a [j];
            B[j] = b [j];
        }
    }
    public void imprimir(){
        System.out.println("----Array Normal----");
        String Anormal = Arrays.toString(b);
        System.out.println("A =" +Anormal);
        String Bnormal = Arrays.toString(a);
        System.out.println("B =" +Bnormal);
        
        System.out.println("----Intercambio----");
        String AIntercambiol = Arrays.toString(A);
        System.out.println("A =" +AIntercambiol);
        String BIntercambiol = Arrays.toString(B);
        System.out.println("B =" +BIntercambiol);
    }
    public static void main (String[] args){
        Ejercicio2 intercambio1;
        intercambio1 = new Ejercicio2(0);
        intercambio1.TamahnoArreglo();
        intercambio1.IngresaDatos();
        intercambio1.Intercambio();
        intercambio1.imprimir();
        
    }
}
