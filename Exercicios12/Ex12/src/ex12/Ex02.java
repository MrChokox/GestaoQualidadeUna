package ex12;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite um valor para ser dividido:");
            int a = input.nextInt();
            System.out.println("Digite um valor para ser o dividendo:");
            int b = input.nextInt();
            Exceptions met = new Exceptions();
            System.out.println(met.dividir(a, b));
        }
    }
}
