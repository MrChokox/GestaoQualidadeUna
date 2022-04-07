package ex04;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        double nota1,nota2,nota3,media;
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Bem vindo ao sistema de boletim");
        
        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = sc.nextDouble();
            
        System.out.println("Agora Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Agora a terceira nota: ");
        nota3 = sc.nextDouble();
        media = (nota1 + nota2 + nota3)/3;
        
        if(nota1 <= 10 && nota1 > 0 && nota2 <= 10 && nota2 > 0 && nota3 <= 10 && nota3 > 0){
            if(media >= 7 && media <= 10)
            System.out.println("MÉDIA: "+media+ "\nAluno APROVADO");
            else if(media < 3 && media >=0)
                System.out.println("MÉDIA: "+media+"\nAluno REPROVADO");
            else if(media >= 3 && media < 7)
                System.out.println("MÉDIA: "+media+"\nAluno em RECUPERAÇÃO");
            else
                System.out.println("NOTA INVALIDA");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        else
            System.out.println("As notas informadas não são válidas");
        
    }
}
