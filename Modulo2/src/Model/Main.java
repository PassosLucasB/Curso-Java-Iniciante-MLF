package Model;



public class Main {
    public static void main(String[] args) {

        Goku goku = new Goku();
        goku.nome = "Goku";
        goku.poderDeLuta = 9000;
        goku.lutar();
        goku.kamehameha();

        Vegetta vegetta = new Vegetta();
        vegetta.nome = "Vegetta";
        vegetta.poderDeLuta = 8500;
        vegetta.lutar();
        vegetta.finalFlash();
    }
}
