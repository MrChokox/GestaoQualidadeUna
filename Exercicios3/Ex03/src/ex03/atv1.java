package ex03;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        int num1,num2,num3;        
        Scanner sc = new Scanner(System.in);        
        
        System.out.println("Digite 3 valores");
        System.out.println("Valor 1");
        num1 = sc.nextInt();
        System.out.println("Valor 2");
        num2 = sc.nextInt();
        System.out.println("Valor 3");
        num3 = sc.nextInt();
        
        double total = (num1 + num2 + num3)/3;
        System.out.println("A média é " + total);
    }
}
