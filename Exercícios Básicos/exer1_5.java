/*
Desenvolva um programa em Java capaz de imprimir todos os números primos menores que 100. 
Os números devem ser separados por espaços, e não deve haver quebra de linha entre eles 
(o número 1 NÃO É PRIMO).
 */
package com.mycompany.mavenproject1;

public class exer1_5 {
    public static void main(String[] args){
        
        int last = 1;
        boolean isPrimo;
        
        for(int i = 1; i <= 100; i++){
            isPrimo = true;
            for(int j = 1; j<=last;j++){
                if(i % j == 0 && j != i && j != 1){
                    isPrimo = false;
                    break;
                }
            }
            
            if(isPrimo){
                last = i;
                System.out.print(last+"\t");
            }
        }
        
    
    }
}
