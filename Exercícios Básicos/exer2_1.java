/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class exer2_1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Dígito: ");
        int choice = num.nextInt();
        
        switch(choice){
            case 1:
                System.out.print("Informe um número: ");
                int n1 = num.nextInt();
                if(n1 >= 10){
                    System.out.println("MAIOR");
                }else{
                    System.out.println("MENOR");
                }
                break;
            case 2:
                System.out.print("Informe um número: ");
                int n2 = num.nextInt();
                if(n2 % 2 == 0){
                    n2 = n2*5;
                }
                if(n2%3==0){
                    n2--;
                }
                
                System.out.println(n2);
                break;
            case 3:
                System.out.print("Informe a quantidade de palavras: ");
                int nP = num.nextInt();
                num.nextLine(); //POR QUE FOI NECESSÁRIO?
                
                String[] words = new String[nP];
              
                for(int i = 0; i < nP; i++){
                    System.out.print("Palavra "+(i+1)+" : ");
                    words[i] = num.nextLine();
                }
                
                for(int i = nP - 1; i >= 0; i--){
                    System.out.print(words[i] + " ");
                }
                break;
            case 4:
                System.out.print("Informe um número: ");
                int a = num.nextInt();
                System.out.print("Informe um número: ");
                int b = num.nextInt();
                int mdc = 0;
                if(a > b){
                    int min = a;
                    a = b;
                    b = min;
                }
                for(int i = a; i >= 1; i--){
                    if(a%i==0 & b%i == 0){
                        mdc = i;
                        break;
                    }

                }
                System.out.println(mdc);
                break;
            case 5:
                int soma = 0;
                for(int i = 0;;i++){
                    System.out.print("Informe um número: ");
                    
                    if(num.hasNextInt()){
                        int n5 = num.nextInt();
                        soma+=n5;
                    }else{
                        break;
                    }
                }
                System.out.println(soma);
                break;
            default:    
                break;
        }
       
    }
}
