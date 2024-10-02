package heranca;
public class Func {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    //construtor da classe
    public Func(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    // Usando o get pra chamar os atributos
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

   //Mostrando os atributos
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Salário: R$" + salario;
    }
}
