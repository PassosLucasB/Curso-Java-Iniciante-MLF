
/*

1- Faça um algoritmo em Java que receba três notas e seus respectivos pesos,
calcule e mostra a média ponderada dessas notas.

*/

import java.util.Scanner;

public class MediaPonderada_Exercicio {
    public static void main(String[] args) {

    // Mp = x1*k1 + x2*k2 + ...) / (k1 + k2 + ....)

    Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite o peso da nota 1: ");
        float peso1 = sc.nextFloat();

        System.out.println("Digite a nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite o peso da nota 2: ");
        float peso2 = sc.nextFloat();

        System.out.println("Digite a nota 3: ");
        float nota3 = sc.nextFloat();
        System.out.println("Digite o peso da nota 3: ");
        float peso3 = sc.nextFloat();

        float media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada é : " +  media);



    }
}
