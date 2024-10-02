package heranca;

public class Cliente {
    private String nome;
    private String endereco;
    private String email;

    //Construtor
    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    // Gets para chamar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
  
    public String toString() {
        return "Nome: " + nome + ", Endereço: " + endereco + ", Email: " + email;
    }
}
