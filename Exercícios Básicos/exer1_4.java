package com.mycompany.mavenproject1;

/*
Desenvolva um programa em Java capaz de imprimir os números da sequência de Fibonacci até 100 
(não é para imprimir os cem primeiros números da sequência, apenas é para imprimir os números até o próximo ultrapassar cem). 
Os números devem ser separados por espaços, e não deve haver quebra de linha entre eles.
*/

public class exer1_4 {
    public static void main(String[] args){
        int a = 0,b = 1;
        int next = 0;

        System.out.print(a+"\t"+b+"\t");
        for(int i = 3;(a+b)<100;i++){
            next = a + b;
            a = b;
            b = next;
            System.out.print(next+"\t");
        }
    }
}

