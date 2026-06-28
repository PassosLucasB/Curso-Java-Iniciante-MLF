public class Condicionais {
    public static void main(String[] args) {

        double nota1  = 10;
        double nota2 = 8;
        double nota3 = 5;
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é : " + media);

        if (media >= 6){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
