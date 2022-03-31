
package ex03;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, pesoEngordar, pesoEmagrecer;
        System.out.println("Informe um peso: ");
        peso = sc.nextDouble();
        pesoEngordar = peso * 1.15;        
        pesoEmagrecer = 0.80 * peso;
        System.out.printf("Se você engordar 15% terá: %.2f ", pesoEngordar);
        System.out.printf("Se você emagrecer 20% terá: %.2f ", pesoEmagrecer);
        
    }
}
