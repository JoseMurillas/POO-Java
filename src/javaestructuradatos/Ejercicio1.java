/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaEstructuraDatos;

import java.util.Scanner;

/**
 *
 * @author SENA
 * Diseñe un programa POO que tome 2 matrices AyB y las intercambie como transpuestas.
 */
public class Ejercicio1 {
    private Scanner lc;
    private int cantidadFilas2, cantidadColumnas2;
    private int cantidadFilas1, cantidadColumnas1;
    private int [][]matriz1;
    private int [][]matriz2;
    private int [][]matrizT1;
    private int [][]matrizT2;
    
    public Ejercicio1(int cantidadFilas1, int cantidadColumnas1, int CantidadFilas2, int CantidadColunas2){
        lc = new Scanner(System.in);
        this.cantidadFilas1 = cantidadFilas1;
        this.cantidadColumnas1 = cantidadColumnas1;
        this.cantidadFilas2 = cantidadFilas2;
        this.cantidadColumnas2 = cantidadColumnas2;
        
        
    }
    
    public void CrearTamahoFC(){

        System.out.print("Ingresa la cantidad de filas para la 1 matriz: ");
        cantidadFilas1 = lc.nextInt();
        System.out.print("Ingresa la cantidad de columnas para la 1 matriz: ");
        cantidadColumnas1 = lc.nextInt();
        System.out.print("Ingresa la cantidad de filas para la 2 matriz: ");
        cantidadFilas2 = lc.nextInt();
        System.out.print("Ingresa la cantidad de columnas para la 2 matriz: ");
        cantidadColumnas2 = lc.nextInt();
        matriz1=new int[cantidadFilas1][cantidadColumnas1];
        matriz2=new int[cantidadFilas2][cantidadColumnas2];
    }
    
    public void IngresarDatos(){
        System.out.println("\n---- Componentes Matriz 1----");
        for(int i = 0; i < cantidadFilas1; i++){
            for (int j = 0; j < cantidadColumnas1; j++) {
                System.out.println("Ingresa los componentes de la matriz 1: ");
                matriz1[i][j] = lc.nextInt();
            }
        }
        System.out.println("---- Componentes Matriz 2----");
        for(int i = 0; i < cantidadFilas2; i++){
            for (int j = 0; j < cantidadColumnas2; j++) {
                System.out.println("Ingresa los componentes de la matriz 2: ");
                matriz2[i][j] = lc.nextInt();
            }
        }
    }
    
    public void Imprimir(){
        System.out.println("\n-----Matriz 1-----");
        System.out.println("Matriz 1 Normal: ");
        for(int i = 0; i < cantidadFilas1;i++){
            for(int j = 0; j < cantidadColumnas1;j++){
                System.out.print("| "+matriz1[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println("Matriz 1 Transpuesta: ");
        for(int i = 0; i < cantidadColumnas1;i++){
            for(int j = 0; j < cantidadFilas1;j++){
                System.out.print("| "+matriz1[j][i]+" | ");
            }
            System.out.println();
        } 
        System.out.println("\n-----Matriz 2-----");
        System.out.println("Matriz 2 Normal: ");
        for(int i = 0; i < cantidadFilas2;i++){
            for(int j = 0; j < cantidadColumnas2;j++){
                System.out.print("| "+matriz2[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println("Matriz 2 Transpuesta: ");
        for(int i = 0; i < cantidadColumnas2;i++){
            for(int j = 0; j < cantidadFilas2;j++){
                System.out.print("| "+matriz2[j][i]+" | ");
            }
            System.out.println();
        }
    }
    public static void main(String[] Args){
        Ejercicio1 matrizT;
        matrizT = new Ejercicio1(0,0,0,0);
        matrizT.CrearTamahoFC();
        matrizT.IngresarDatos();
        matrizT.Imprimir();
        
        
    }
}
