package br.com.dio.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.desafio.model.Compra;
import br.com.dio.desafio.model.Pagamento;
import br.com.dio.desafio.model.PagamentoCartaoCredito;
import br.com.dio.desafio.model.PagamentoDinheiro;
import br.com.dio.desafio.model.PagamentoPix;

@RestController
public class PagamentoController {

    @Autowired
    private Compra compra;

    @GetMapping("/")
    public String welcome(){
        return "Olá, você está na central de cálculos de pagamentos!";
    }

    @PostMapping("/pagamentopix/{totalcompra}")
    public String calcularPagamentoPix(@PathVariable("totalcompra") Double totalcompra) {
        Pagamento pagamentoSelecionado = new PagamentoPix();

        compra.calcularPagamentoFinal(pagamentoSelecionado, totalcompra);

        return "Total da compra pagando com Pix: R$ "+ String.format("%.2f", compra.getValorPagamentoFinal());
    }

    @PostMapping("/pagamentocartaocredito/{totalcompra}")
    public String calcularPagamentoCartaoCredito(@PathVariable("totalcompra") Double totalcompra) {
        Pagamento pagamentoSelecionado = new PagamentoCartaoCredito();

        compra.calcularPagamentoFinal(pagamentoSelecionado, totalcompra);

        return "Total da compra pagando com Cartão de Crédito: R$ "+ String.format("%.2f", compra.getValorPagamentoFinal());
    }

    @PostMapping("/pagamentodinheiro/{totalcompra}")
    public String calcularPagamentoDinheiro(@PathVariable("totalcompra") Double totalcompra) {
        Pagamento pagamentoSelecionado = new PagamentoDinheiro();

        compra.calcularPagamentoFinal(pagamentoSelecionado, totalcompra);

        return "Total da compra pagando com Dinheiro: R$ "+ String.format("%.2f", compra.getValorPagamentoFinal());
    }
}
