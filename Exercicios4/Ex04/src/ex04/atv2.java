package ex04;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        double l1, l2, l3;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro lado do triangulo:");
        l1 = sc.nextDouble();
        System.out.println("Agora o segundo:");
        l2 = sc.nextDouble();
        System.out.println("Por fim o terceiro:");
        l3 = sc.nextDouble();
        
        if(l1 == l2 && l2 == l3)
            System.out.println("Você tem um triangulo equilatero");
        else if(l1 == l2 || l1 == l3 || l2 == l3)
            System.out.println("Você pode formar um triangulo isosceles");
        else
            System.out.println("Você pode formar um triangulo escaleno");
    }
}
