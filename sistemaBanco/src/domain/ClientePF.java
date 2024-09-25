package domain;

public class ClientePF extends Cliente {

    private String cpf;

    public ClientePF(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    @Override
    public void adicionarConta(Conta conta) {
        System.out.println("Conta adicionada com sucesso!");
    }

    @Override
    public String toString() {
        return "ClientePF{" +
                "nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
