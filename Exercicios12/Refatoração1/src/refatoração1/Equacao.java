package refatoração1;

import java.util.Scanner;

public class Equacao {

    private double a, b, c, delta, x1, x2;

    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void entrada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        a = input.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = input.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = input.nextDouble();
    }
    
    public double equacaoPrimeiroGrau(){
        return x1 = -c / b;
    }
    
    public void setDelta(){
        delta = (b * b) - (4 * a * c);
    }
    
    
    public void setX1(){
        x1 = (-b - Math.sqrt(delta)) / (2 * a);
    }
    
    public void setX2(){
        x2 = (-b + Math.sqrt(delta)) / (2 * a);
    }
    

    public void calcular() {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {           
            System.out.println("Esta é uma equação de primeiro grau, o valor da raiz é: " + equacaoPrimeiroGrau());
        } else if (a != 0) {
            System.out.println("Esta é uma equação de segundo grau"); 
            
            setDelta();
            setX1();
            setX2();
            
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais");
            } else if (delta == 0) {
                setX1();
                setX2();
                System.out.println("Esta equação possui duas raízes reais iguais: x1 = " + x1 + " e x2 = " + x2);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes, raiz 1: " + x1 + "\n raiz 2: " + x2);
            }

        }
    }
}
