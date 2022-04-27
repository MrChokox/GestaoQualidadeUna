package atividadedeoo;

import java.util.Scanner;

public class AtividadeDeOO {

    public static void main(String[] args) {
        double valorDeposito, valorSaque;
        Scanner input = new Scanner(System.in);
//        Retangulo retangulo = new Retangulo();
//        System.out.println(retangulo.exibe());
//        System.out.print("Informe a altura do retângulo: ");
//        retangulo.setAltura(input.nextFloat());
//        System.out.print("Informe a largura do retângulo: ");
//        retangulo.setLargura(input.nextFloat());
//        retangulo.exibe();

        
          ContaCorrente conta = new ContaCorrente();
          conta.inicializarContaCorrente(150098, 12);
          System.out.println("Digite um valor para deposito:");
          valorDeposito = input.nextDouble();
          conta.depositar(valorDeposito);
          System.out.println("Informe um valor para saque:");
          valorSaque = input.nextDouble();
          conta.sacar(valorSaque);
          System.out.println("======================");
          System.out.println(conta.exibe());
          
          
    }

}
