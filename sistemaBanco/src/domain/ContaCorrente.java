package domain;

public sealed class ContaCorrente extends Conta permits ContaDigital{

    private Double limite;
    private static Double taxaJuros = 0.07;
    private static Double taxaMensal = 20.0;

    public ContaCorrente(Double saldo, Cliente cliente, Double limite) {
        super(saldo, cliente);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    @Override
    public void cobrarTaxaManutencao() {
        if (getSaldo() >= taxaMensal) {
            setSaldo(getSaldo() - taxaMensal);
        } else {
            System.out.println("Saldo insuficiente para cobrar a taxa de manutenção.");
        }
    }
}
