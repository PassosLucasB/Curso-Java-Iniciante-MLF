package Exemplo1;



public class Main {
    public static void main(String[] args) {

        PersonagemDBZ[] personagemDBZS = new PersonagemDBZ[2];

        personagemDBZS[0] = new Goku();
        personagemDBZS[0].nome = "Goku";
        personagemDBZS[0].poderDeLuta = 9000;

        personagemDBZS[1] = new Vegetta();
        personagemDBZS[1].nome = "Vegetta";
        personagemDBZS[1].poderDeLuta = 8500;

        for(PersonagemDBZ personagemDBZ : personagemDBZS){
            personagemDBZ.transformar();
            personagemDBZ.lutar();
        }




        /*
        Goku goku = new Goku();
        goku.nome = "Goku";
        goku.poderDeLuta = 9000;
        goku.lutar();
        goku.kamehameha();
        goku.transformar();

        Vegetta vegetta = new Vegetta();
        vegetta.nome = "Vegetta";
        vegetta.poderDeLuta = 8500;
        vegetta.lutar();
        vegetta.finalFlash();
        vegetta.transformar();

        */


    }
}
