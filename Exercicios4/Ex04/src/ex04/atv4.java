package ex04;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        double altura,peso,imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo(a) ao meu programa para verificar seu peso\nMe informe seu peso atual: ");
        peso = sc.nextDouble();
        System.out.println("Ok, agora digite sua altura: ");
        altura = sc.nextDouble();
        imc = peso/(altura*altura);
        if(imc < 20)
            System.out.println("Você está abaixo do peso");
        else if(imc <= 25)
            System.out.println("Peso Normal");
        else if(imc <=30)
            System.out.println("Você está com sobre peso");
        else if(imc <= 40)
            System.out.println("Você está Obeso");
        else if(imc > 40)
            System.out.println("Você está com obesidade morbida");
       
    }
}
