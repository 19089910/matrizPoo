package application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, M;
        N = sc.nextInt();
        M = sc.nextInt();
        int[][] matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == x){
                    System.out.println("Position " + i +"," + j + ":");
                    //j=0 j>0 j>0 l=3 se for = 0 nao tem numero a esqueda
                    //10  8   15  12  matriz[0][1-1] = 10
                    //21  11  23  8   l = matriz[j].length
                    //14  5   13  19  langth(3)-1=2 > j(3); nao tem direita; langth(3)-1=2 > j(1) tem direita
                    if(j > 0){
                        System.out.println("esquerda: " + matriz[i][j-1]);
                    }
                    if (i > 0){
                        System.out.println("cima: " + matriz[i-1][j]);
                    }
                    if(j < matriz[j].length-1){
                        System.out.println("direita: " + matriz[i][j+1]);
                    }
                    if(i < matriz.length-1){
                        System.out.println("baixo: " + matriz[i+1][j]);
                    }

                }
            }
        }
    }

        /*for (int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.println(matriz[i][j]);

            }
        }*/


}
