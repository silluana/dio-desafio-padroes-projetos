package br.com.dio.desafio.model;

import org.springframework.stereotype.Component;

@Component
public class Compra {
    
    private Double totalCompra;
    private Double valorPagamentoFinal;

    private Pagamento pagamento;

    public void calcularPagamentoFinal(Pagamento pagamento, Double totalCompra) {
        this.pagamento = pagamento;
        this.totalCompra = totalCompra;
        this.valorPagamentoFinal = pagamento.calcularTaxaJuros(totalCompra);
    }

    public Double getTotalCompra() {
        return totalCompra;
    }

    public Double getValorPagamentoFinal() {
        return valorPagamentoFinal;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}
