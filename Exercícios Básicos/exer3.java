package com.mycompany.mavenproject1;

import java.util.Arrays;
import java.util.Scanner;


public class exer3 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        int choice = leitor.nextInt();

        switch(choice){
            case 1:

                System.out.print("Num. de numeros: ");
                int qnt = leitor.nextInt();
                Integer vetor[] = new Integer[qnt];

                for(int i = 0; i < qnt; i++){
                    vetor[i] = leitor.nextInt();
                }
                Arrays.sort(vetor);
                for(int i : vetor){
                    System.out.print(i+" ");
                }
                break;
            case 2:
                System.out.print("Num. n de numeros: ");
                int n2 = leitor.nextInt();
                System.out.print("Num. m de numeros: ");
                int m2 = leitor.nextInt();
                Integer matriz[][] = new Integer[n2][m2];

                for(int i = 0; i<n2;i++){
                    for(int j = 0; j<m2; j++){
                        matriz[i][j] = leitor.nextInt();
                    }
                }

                for(int i = 0; i<n2;i++){
                    for(int j = 0; j<m2; j++){
                        System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println("");
                }

                break;
            case 3://NÃO ENTENDI
                int n3 = leitor.nextInt();
                Integer mat[][] = new Integer[n3][n3];

                for(int i = 0; i<n3;i++){
                    for(int j = 0; j<n3; j++){
                        mat[i][j] = leitor.nextInt();
                    }
                }

                Integer diagPrincipal = 0, diagSecundaria = 0, multiplica = 1;

                for (int i = 0; i < n3; i++) {
                    for (int j = 0; j < n3; j++) {
                        multiplica = multiplica * mat[j][(i + j) % n3];
                    }
                    diagPrincipal += multiplica;
                    multiplica = 1;
                }

                for (int i = 0; i < n3; i++) {
                    for (int j = 0; j < n3; j++) {
                        multiplica *= mat[j][(((n3 -i -j -1)%n3) + n3)%n3];
                    }
                    diagSecundaria += multiplica;
                    multiplica = 1;
                }

                System.out.println(diagPrincipal-diagSecundaria);

                break;
            case 4:
                System.out.print("Num. n de numeros: ");
                int n4 = leitor.nextInt();
                System.out.print("Num. m de numeros: ");
                int m4 = leitor.nextInt();


                Integer matrizA[][] = new Integer[n4][m4];
                Integer matrizB[][] = new Integer[n4][m4];

                System.out.println("Matriz A:");
                for(int i = 0; i<n4;i++){
                    for(int j = 0; j<m4; j++){
                        matrizA[i][j] = leitor.nextInt();
                    }
                }

                System.out.println("Matriz B:");
                for(int i = 0; i<n4;i++){
                    for(int j = 0; j<m4; j++){
                        matrizB[i][j] = leitor.nextInt();
                    }
                }

                Integer matrizSoma[][] = new Integer[n4][m4];

                for(int i = 0; i<n4;i++){
                    for(int j = 0; j<m4; j++){
                        matrizSoma[i][j] = matrizA[i][j]+matrizB[i][j];
                    }
                }


                for(int i = 0; i<n4;i++){
                    for(int j = 0; j<m4; j++){
                        System.out.print(matrizSoma[i][j]+" ");
                    }
                    System.out.println("");
                }
                break;
            case 5:
                System.out.print("Num. n de numeros: ");
                int n5 = leitor.nextInt();
                System.out.print("Num. m de numeros: ");
                int m5 = leitor.nextInt();


                Integer matriza[][] = new Integer[n5][m5];
                Integer matrizb[][] = new Integer[m5][n5];

                System.out.println("Matriz A:");
                for(int i = 0; i<n5;i++){
                    for(int j = 0; j<m5; j++){
                        matriza[i][j] = leitor.nextInt();
                    }
                }

                System.out.println("Matriz B:");
                for(int i = 0; i<m5;i++){
                    for(int j = 0; j<n5; j++){
                        matrizb[i][j] = leitor.nextInt();
                    }
                }
                Integer matrizc[][] = new Integer[n5][n5];

                for (int i = 0; i < n5; i++) {
                    for (int j = 0; j < n5; j++) {
                        matrizc[i][j] = 0;
                        for (int k = 0; k < m5; k++) {
                            matrizc[i][j] += matriza[i][k] * matrizb[k][j];
                        }
                    }
                }

                for (int i = 0; i < n5; i++) {
                    for (int j = 0; j < n5; j++) {
                        System.out.print(matrizc[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                break;


        }
    }
}