
package ex03;

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Salario minimo
        double salarioFuncionario, referenciaSalariosMinimos;
        double salarioMinimo = 1212;                
        System.out.println("Digite o seu salario: ");
        salarioFuncionario = sc.nextDouble();
        referenciaSalariosMinimos = salarioFuncionario/salarioMinimo;
        System.out.printf("Você recebe um salario equivalente a: %.2f", referenciaSalariosMinimos);
    }
}
