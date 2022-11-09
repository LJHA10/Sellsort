/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sellsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luisj
 */
public class Sellsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
            String entrada;
            
            Sellsort ord = new Sellsort();
            
            int arreglo[], nElementos;
             
            System.out.println("Escriba la longitud del arreglo");
            entrada = bufer.readLine();
            nElementos = Integer.parseInt(entrada);
            
            arreglo = new int [nElementos];
            
            for(int i=0;i<nElementos;i++){
                System.out.println((i+1) + ". Escriba los numeros del arreglo");
                entrada = bufer.readLine();
                arreglo[i] = Integer.parseInt(entrada);
    }
            System.out.println("Mostrar arreglo");
            ord.mostrarArreglo(arreglo);
            ord.shell(arreglo);
            
            
    }
    
    public void shell(int[] arreglo){
        int salto, i, j,k,aux;
        salto = arreglo.length/2;
        while(salto>0){
            for(i=salto;i<arreglo.length;i++){
                j=i-salto;
                while(j>=0){
                    k=j+salto;
                    if(arreglo[j]<=arreglo[k]){
                        j = -1;
                    }else{
                        aux = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = aux;
                        j-=salto;
                    }
                }
            }
            salto = salto/2;
        }
        System.out.println("Arreglo ordenado");
        mostrarArreglo(arreglo);
    }
    public void mostrarArreglo(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
}   

