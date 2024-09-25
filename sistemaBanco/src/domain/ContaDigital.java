package domain;

public final class ContaDigital extends ContaCorrente{

    public ContaDigital(Double saldo, Cliente cliente, Double limite) {
        super(saldo, cliente, limite);
    }

    public void cobrarTaxaManutencao(){}
}
