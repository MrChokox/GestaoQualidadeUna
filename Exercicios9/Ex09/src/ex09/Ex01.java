package ex09;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        int linhas = 2, colunas = 2;
        int[][] matriz = new int[linhas][colunas];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe um número: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz:");
        imprime(matriz);
        System.out.println("Linha par e coluna impar:");
        linhaParColunaImpar(matriz);
        System.out.println("Matriz transposta");
        transposta(matriz);
    }

    public static void imprime(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
        }
        System.out.println("\n\n\n");
    }

    public static void linhaParColunaImpar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 1) {
                        System.out.print("[" + matriz[i][j] + "]");
                    }
                }
            }
        }
        System.out.println("\n\n\n");
    }

    public static void transposta(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[j][i] + "]");        
            }                    
        }
        System.out.println("\n\n\n");
    }
}
