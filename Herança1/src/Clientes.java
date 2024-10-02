import heranca.*;
public class Clientes {
    public static void main(String[] args) {
        // Criando o objeto PF:
        PessoaFisica p1 = new PessoaFisica("Murilo Terra", "Rua Cedro, 20", "murilodunk19@gmail.com", "123.456.789-10");
        
        // Criando o objeto PJ:
        PJ p2 = new PJ("Casa de Bolos dona Maria", "Avenida Nestor Fogaça, 415", "bolosdamaria@gmail.com", "12.345.678/0001-10");

        // Criando o objeto Funcionario:
        Func func = new Func("André Moreira", "381.505.213-05", "Rua São Gonçalo, 84", 2.800);

        // Exibindo as informações
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(func);
    }
}
