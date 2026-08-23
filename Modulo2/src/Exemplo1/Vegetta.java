package Exemplo1;

public class Vegetta extends PersonagemDBZ{

    @Override
    public void transformar() {
        super.transformar();
        System.out.println(nome + " virou um Super Saiyajin e disse: EU SOU O PRINCIPE DOS SAIYAJINS!!!");;
    }

    public void finalFlash(){
        System.out.println(nome+ " Lançou um Final Flash!!!");
    }
}
