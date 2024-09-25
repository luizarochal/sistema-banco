package domain;

public final class ContaPoupanca extends Conta{

    private static Double taxaMensal = 10.0;
    private static Double taxaRendimento = 0.05;

    public ContaPoupanca(Double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    @Override
    public void cobrarTaxaManutencao() {
        if (getSaldo() >= taxaMensal) {
            setSaldo(getSaldo() - taxaMensal);
        } else {
            System.out.println("Saldo insuficiente para cobrar a taxa de manutenção.");
        }
    }

    public void creditarRendimento() {
        setSaldo(getSaldo() + (getSaldo() * taxaRendimento));
    }
    
}
