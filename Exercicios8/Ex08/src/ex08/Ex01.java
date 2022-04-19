package ex08;

import java.util.Arrays;
import java.util.Scanner;

//package ex01;

public class Ex01 {
    public static void main(String[] args) {
        //Leia 10 números inteiros a partir do teclado e os armazene em um vetor. O algoritmo
        //deve imprimir o vetor e apresentar a soma dos números pares.
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int somaPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + i + "º numero:");
            int num = sc.nextInt();
            vetor[i] = num;
            if(num%2 == 0)
                somaPares = somaPares + num;
        }        
        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.println("Soma dos números pares: " + somaPares);
        
    }
}
