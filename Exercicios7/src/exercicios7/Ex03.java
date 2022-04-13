package exercicios7;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int num, fatorial = 1, mult = 2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um valor:");
        num = sc.nextInt();
        
        if(num < 0)
            System.out.println("o numero é negativo");
        else{
            for (int i = 1; i <= num; i++) {
                fatorial = i * fatorial;                
//                System.out.println(fatorial);
            }
            System.out.println(num + "! = " + fatorial);
            //5! = 5 x 4 x 3 x 2 x 1 = 120
            //4! = 4 x 3 x 2 x 1 = 24
            //3! = 3 x 2 x 1 = 6
            //2! = 2 x 1 = 2
            //1! = 1
            //0! = 1 (OBS: o fatorial de 0 é sempre 1).
        }
    }
}
