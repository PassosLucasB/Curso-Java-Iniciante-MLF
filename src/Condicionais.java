import java.sql.SQLOutput;

public class Condicionais {
    public static void main(String[] args) {

        double nota1  = 8;
        double nota2 = 2;
        double nota3 = 3;
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é : " + media);

        if (media >= 6){
            System.out.println("Aluno aprovado");
        }
        else if (media >= 5 && media < 6){
            System.out.println("Aluno recuperação");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }
}
