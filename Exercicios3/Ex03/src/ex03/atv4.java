
package ex03;

import java.util.Scanner;

public class atv4 {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);            
        double salarioFuncioanrio;        
        System.out.println("Informe o salario");
        salarioFuncioanrio = sc.nextDouble();
        System.out.println("Você recebeu um aumento de 25% e ficou com: " + ((0.25 * salarioFuncioanrio)+salarioFuncioanrio));
    }    
}
