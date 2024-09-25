package domain;

public final class Transferencia extends MovimentacaoBancaria{
    private Conta contaDestino;

    public Transferencia() {
    }

    public Conta getContaDestino() {
        return contaDestino;
    }
    
}
