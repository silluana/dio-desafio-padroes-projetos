package br.com.dio.desafio.model;

/**
 * Utilizando o padrão Strategy para definir o calculo da taxa de juros do pagamento 
 * de uma compra de acordo com a forma de pagamento.
 * 
 * @author Siluana Oggioni
 */

public interface Pagamento {

    Double calcularTaxaJuros(Double totalCompra);
}
