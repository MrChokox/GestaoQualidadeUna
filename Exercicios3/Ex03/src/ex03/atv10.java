
package ex03;

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, comprimento, area, volume;
        
        System.out.println("Insira um valor para o raio:");
        raio = sc.nextDouble();
        comprimento = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2);
        volume = 0.75 * Math.PI * Math.pow(raio, 3);
        
        System.out.printf("O comprimento é: %.2f \n", comprimento);
        System.out.printf("A area é: %.2f \n", area);
        System.out.printf("O volume é: %.2f \n", volume);
   
    }
}
