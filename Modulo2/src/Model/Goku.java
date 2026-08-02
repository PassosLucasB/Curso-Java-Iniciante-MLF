package Model;

import java.sql.SQLOutput;

public class Goku  extends PersonagemDBZ{

    @Override
    public void transformar() {
        System.out.println(nome + " se transformou em super saiyajin e gritou: KAMEHAMEHA!!!");
    }

    public void kamehameha(){
        System.out.println(nome + " Lançou um kamehameha!!!");
    }
}
