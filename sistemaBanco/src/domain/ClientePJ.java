package domain;

public class ClientePJ extends Cliente{
    
    private String cnpj;

    public ClientePJ(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void adicionarConta(Conta conta){
        System.out.println("Conta adicionada com sucesso!");
    }

    public void addResponsavel(ClientePF clientePF){
        System.out.println("Cliente pessoa jurídica adicionado com sucesso!");
        System.out.println("Nome: " + clientePF.getNome());
        System.out.println("Email: " + clientePF.getEmail());
        System.out.println("CPF: " + clientePF.getCpf());
    }
}
