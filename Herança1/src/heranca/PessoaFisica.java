package heranca;

public class PessoaFisica extends Cliente {
    private String cpf;

   //construtor 
    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }
//chamando os atributos
    public String getCpf() {
        return cpf;
    }

    public String toString() {
        return super.toString() + ", CPF: " + cpf;
    }
}
