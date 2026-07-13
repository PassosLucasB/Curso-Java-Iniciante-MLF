public class Vetores_ForEach {
    public static void main(String[] args) {

        int[] numero = new int[6];
        numero[0] = 10;
        numero[1] = 20;
        numero[2] = 30;
        numero[3] = 40;
        numero[4] = 50;
        numero[5] = 60;

        for ( Integer i : numero){
            System.out.println(i);
        }


    }
}
