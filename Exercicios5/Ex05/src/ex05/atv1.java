
package ex05;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        double notaFinal = 0, media = 0, maiorNota = 0, menorNota = 0;
        int totalFaltas, maiorNoventa = 0, menorSetenta = 0, contador = 0;        
        Scanner sc = new Scanner(System.in);
        
        
        while (notaFinal >= 0) {
            
            System.out.println("Digite a nota do aluno:");
            notaFinal = sc.nextDouble();
            System.out.println("Digite o total de faltas:");
            totalFaltas = sc.nextInt();
            
            if(notaFinal < 0)
                break;
            
            contador++;
            
            media+= notaFinal;
            
            if(notaFinal > maiorNota)
                maiorNota = notaFinal;
            if(notaFinal < menorNota)
                menorNota = notaFinal;
            else if(menorNota == 0)
                menorNota = notaFinal;
               
            
            if(notaFinal >= 90 && totalFaltas < 20)
                maiorNoventa++;
            if(notaFinal < 70 || totalFaltas >= 20)
                menorSetenta++;
            
            System.out.println("Caso deseje sair do loop informe uma nota negativa\n");
                
        }
        System.out.println("A quantidade de alunos com nota maior a 90 é: " + maiorNoventa);
        System.out.println("A quantidade de alunos reprovados é: " + menorSetenta);
        System.out.println("A maior nota foi: " + maiorNota);
        System.out.println("A menor nota foi: " + menorNota);
        media = media/contador;
        System.out.println("A media de notas foi: " + media);
    }
}
