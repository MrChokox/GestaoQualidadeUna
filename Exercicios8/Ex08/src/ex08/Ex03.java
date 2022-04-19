package ex08;
import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //Leia 10 números reais a partir do teclado e os armazene em um vetor. O algoritmo deve
        //imprimir o vetor, o menor e o maior número informado.
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior = 0, menor = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + i + "º numero:");
            int num = sc.nextInt();
            vetor[i] = num;            
            if(i == 0){
                maior = num;
                menor = num;
            }
            if(num > maior)
                maior = num;
            if(num < menor)
                menor = num;
        }
//        System.out.println("Vetor: " + Arrays.toString(vetor));
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0)
                System.out.println("Posição: " + i + " valor: " + vetor[i]);
        }
        System.out.println("O maior número é: " + maior + " e o menor valor é: " + menor);
    }
}
