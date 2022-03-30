
package ex03;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        double cotacaoDolar, dolares;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cotação do dolar em reais");
        cotacaoDolar = sc.nextDouble();        
        System.out.println("Digite um valor em dolares");
        dolares = sc.nextDouble();        
        System.out.println("O valor em reais é igual a :" + (cotacaoDolar * dolares));
    }    
}
