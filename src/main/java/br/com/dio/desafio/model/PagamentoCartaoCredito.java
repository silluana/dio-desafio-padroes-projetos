package br.com.dio.desafio.model;

public class PagamentoCartaoCredito implements Pagamento {

    private final static Double TAXAJUROS = 0.0349D;

    @Override
    public Double calcularTaxaJuros(Double totalCompra) {
        //Regra - Pagamentos com cartão de credito tem um acrescimo de 3,49% 
        totalCompra += totalCompra*TAXAJUROS;

        return totalCompra;
    }
    
}
