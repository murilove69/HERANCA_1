package heranca;

public class PJ extends Cliente {
    private String cnpj;

    public PJ(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj;
    }
}

