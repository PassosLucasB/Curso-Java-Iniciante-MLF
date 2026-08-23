package Exemplo2;

// Subclasse (Funcionario que herda de Pessoa
public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, int idade, double salario){
// Chama o construtor da superclasse
        super(nome, idade);
        this.salario = salario;
    }
    //Getter e Setter para salario
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        if(salario > 0 ){
            this.salario = salario;
        }else}
    throw new IllegalArgumentException(“Salário deve ser maior que zero”);}
}
}
