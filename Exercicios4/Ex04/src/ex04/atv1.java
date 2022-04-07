
package ex04;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
       
        double nota1,nota2,media;
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Bem vindo ao sistema de boletim");
        
        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = sc.nextDouble();
        System.out.println("Agora Digite a segunda nota: ");
        nota2 = sc.nextDouble();        
        
        media = (nota1 + nota2)/4;
        
        if(media >= 7 )
            System.out.println("MÉDIA: "+media+ "\nAluno APROVADO");        
        else if(media < 7)
            System.out.println("MÉDIA: "+media+"\nAluno REPROVADO");        
        else
            System.out.println("NOTA INVALIDA");    
         
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    
}
