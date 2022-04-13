package exercicios7;

import java.util.Scanner;

public class Ex02 {    
    public static void main(String[] args) {         
    //Leia 2 números inteiros positivos e que imprima todos os números inteiros existentes
    //entre esses dois limites informados.
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor:");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo número:");
        num2 = sc.nextInt();  
        System.out.println("\n====================");
        
        if(num1 > num2){
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);
            }
        }else if(num2 > num1){
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        }else{
            System.out.println("Erro ao executar o for");
        }
        System.out.println("====================");
          
    }
}
