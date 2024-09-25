package domain;

public abstract sealed class Conta permits ContaCorrente, ContaPoupanca {
    private Double saldo;
    private Cliente cliente;

    public Conta(Double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void gerarExtrato(){
        System.out.println("Extrato da conta de " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public abstract void cobrarTaxaManutencao();

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
