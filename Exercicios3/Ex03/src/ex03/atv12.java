
package ex03;

import java.util.Scanner;

public class atv12 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double a, b, c, delta, x1, x2;
        
        System.out.println("Informe o valor do coeficiente a:");
        a = sc.nextDouble();
        
        System.out.println("Informe o valor do coeficiente b:");
        b = sc.nextDouble();
        
        System.out.println("Informe o valor do coeficiente c:");
        c = sc.nextDouble();
        
        delta = Math.pow(b, 2) - (4 * a * c);
        x1 = ((-(b) + Math.sqrt(delta))/(2*a));        
        x2 = ((-(b) - Math.sqrt(delta))/(2*a));
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
    } 
}
