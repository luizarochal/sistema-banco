package domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class MovimentacaoBancaria {
    
    private LocalDate data;
    private LocalTime hora;
    private Double valor;

    public MovimentacaoBancaria(LocalDate data, LocalTime hora, Double valor) {
        this.data = data;
        this.hora = hora;
        this.valor = valor;
    }

    public MovimentacaoBancaria() {
        //TODO Auto-generated constructor stub
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "MovimentacaoBancaria{" +
                "data=" + data +
                ", hora=" + hora +
                ", valor=" + valor +
                '}';
    }
}
