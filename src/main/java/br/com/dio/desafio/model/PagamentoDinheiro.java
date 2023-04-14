package br.com.dio.desafio.model;

public class PagamentoDinheiro implements Pagamento {

    private final static Double DESCONTO = 0.05D;

    @Override
    public Double calcularTaxaJuros(Double totalCompra) {
        //Regra - pagamentos realizado com dinheiro tem um desconto de 5%

        totalCompra -= totalCompra*DESCONTO;

        return totalCompra;
    }
    
}
