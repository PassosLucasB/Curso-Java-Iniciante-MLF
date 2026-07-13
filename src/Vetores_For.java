public class Vetores_For {
        public static void main(String[] args) {

            int[] numero = new int[6];
            numero[0] = 10;
            numero[1] = 20;
            numero[2] = 30;
            numero[3] = 40;
            numero[4] = 50;
            numero[5] = 60;

            for (int i = 0; i < numero.length; i++){
                System.out.println(numero[i]);
                if (i == 2){
                    numero[i] = 50;
                  //  System.out.println(numero[i]);
                }
            }
        }
}
