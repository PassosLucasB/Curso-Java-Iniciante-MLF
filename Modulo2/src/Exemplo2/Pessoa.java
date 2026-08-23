package Exemplo2;

public class Pessoa{
    private String nome;
    private int idade;

    // O construtor leva o mesmo nome da classe e passando por parâmetro o nome e a idade
    public Pessoa(String nome, int idade){
        this.nome = nome;	//Inicializando o atributo nome do objeto Pessoa
        this.idade = idade;	//Inicializando o atributo idade do objeto Pessoa
    }

    //Métodos getters e setters para encapsulamento para acessar os atributos
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if (idade > 0){
            this.idade = idade;
        }else{
            throw new IllegalArgumentException(“Idade deve ser maior que zero”);}
    }
}
