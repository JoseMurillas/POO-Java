/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaestructuradatos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Ejercicio3 {
    private Scanner lc;
    private int [] vector;
    private int tamahoArray;
    private boolean registro;
    
    
    public Ejercicio3(){
        lc = new Scanner(System.in);
        this.tamahoArray = tamahoArray;

    }
    
    public void TamahoArreglo(){
        System.out.println("Ingresa el tamahno del vector: ");
        tamahoArray = lc.nextInt();
        vector = new int[tamahoArray];
    }
    public void IngresarDatos(){
        for(int i = 0; i < tamahoArray; i++){
            System.out.println("Ingresa los datos del arreglos");
            vector[i] = lc.nextInt();
        }
    }
    public void OrdenMenorMayor(){
        //Se ejecua el bucle dos veces: uno para recorrer el array y otro para la comparaciones
        for (int i = 0; i < tamahoArray - 1; i++) {
            //Se genera un registro de los intercambios
            registro = true;
            for (int j = 0; j < tamahoArray-i-1; j++) {
                
                //para ordenar en orden menor a mayor
                if (vector[j]>vector[j+1]) {
                    int intercambio = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = intercambio;
                    
                    registro = false;
                }
            }
            if(registro == true){
                break;
            }
        }
        System.out.println("----Arreglo Ordenado Menor a Mayor----");
        String menorMayor = Arrays.toString(vector);
        System.out.println(menorMayor);
    }
        public void OrdenMayorMenor(){
        //Se ejecua el bucle dos veces: uno para recorrer el array y otro para la comparaciones
        for (int i = 0; i < tamahoArray - 1; i++) {
            //Se genera un registro de los intercambios
            registro = true;
            for (int j = 0; j < tamahoArray-i-1; j++) {
                
                //para ordenar en orden menor a mayor
                if (vector[j]<vector[j+1]) {
                    int intercambio = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = intercambio;
                    
                    registro = false;
                }
            }
            if(registro == true){
                break;
            }
        }
        System.out.println("----Arreglo Ordenado Mayor a Menor----");
        String mayorMenor = Arrays.toString(vector);
        System.out.println(mayorMenor);
    }
    public void imprimir (){
        System.out.println("----Arreglo Original----");
        String original = Arrays.toString(vector);
        System.out.println(original);
    }
    public static void main(String[] args){
        Ejercicio3 vectorOrden;
        vectorOrden = new Ejercicio3();
        vectorOrden.TamahoArreglo();
        vectorOrden.IngresarDatos();
        vectorOrden.imprimir();
        vectorOrden.OrdenMayorMenor();
        vectorOrden.OrdenMenorMayor();
        
    }
}
