
package ex03;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        int anoNascimento, anoAtual;        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano de nascimento");
        anoNascimento = sc.nextInt();        
        System.out.println("Digite o ano atual:");
        anoAtual = sc.nextInt();        
        System.out.println("Sua idade atual é: " + (anoAtual - anoNascimento));
        System.out.println("Sua idade em 2050 vai ser: " + (2050 - anoNascimento));
    }
}
