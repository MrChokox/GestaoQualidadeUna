
package ex03;

import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {            
         Scanner sc = new Scanner(System.in);         
        double area, diagonalMaior, diagonalMenor;
        System.out.println("Digite um valor para a diagonal maior");
        diagonalMaior = sc.nextDouble();
        System.out.println("Digite um valor para a diagonal menor");
        diagonalMenor = sc.nextDouble();        
        area = (diagonalMaior * diagonalMenor)/2;
        System.out.println("O valor da area é " + area);
    }    
}
