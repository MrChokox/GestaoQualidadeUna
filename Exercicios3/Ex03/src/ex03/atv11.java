
package ex03;

import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int valorTabuada;
        System.out.println("Digite um valor para ver a tabuada");
        valorTabuada = sc.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(valorTabuada + " x " + i + " = " + valorTabuada * i);
        }
    }
}
