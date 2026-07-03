public class Condicionais_3 {
    public static void main(String[] args) {

        int mes = 2;

        /*
        if(mes ==1){
            System.out.println("Janeiro");
        }
        else if (mes == 2){
            System.out.println("Fevereiro");
        }
        else if (mes == 3){
            System.out.println("Março");
        }
        */

        switch (mes){
            case 1: {
                System.out.println("Janeiro");
                break;
            }
            case 2: {
                System.out.println("Fevereiro");
                break;
            }
            case 3: {
                System.out.println("Março");
                break;
            }
            default:{
                System.out.println("Mes inválido");
                break;
            }
        }
    }
}
