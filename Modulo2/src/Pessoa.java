public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private String cpf;

    /*  public = livre acesso;
        private = apenas a mesma classe tem acesso;
        protected = apenas classes do mesmo pacote ou herança têm acesso
     */

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
