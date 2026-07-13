public class Matrizes_For {
    public static void main(String[] args) {

        int[][] matriz = new int[3][4];

        matriz[0][0] = 10;
        matriz[1][2] = 25;
        matriz[2][3] = 40;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matriz [i] [j] + "");
            }
        }System.out.println();
    }
}
