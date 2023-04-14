package br.com.dio.desafio.model;

public class PagamentoPix implements Pagamento {

    @Override
    public Double calcularTaxaJuros(Double totalCompra) {
        //Regra- Pagamento com pix não há valor de acrescimo de juros
        
        return totalCompra;
    }
    
}
