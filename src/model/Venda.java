/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.FormaPagamento;
import java.util.List;
import util.BaseDeDados;

/**
 *
 * @author Fernando
 */
public class Venda {

    private int numero;
    private Usuario funcionario;
    private Caixa caixa;
    private List<Item> itens;
    private FormaPagamento formaPagamento;
    private double valorPago;
    private double troco;

    public Venda(Funcionario funcionario, Caixa caixa, List<Item> itens, FormaPagamento formaPagamento, double valorPago, double troco) {
        this.numero = BaseDeDados.getInstance().getVendas().size() + 1;
        this.funcionario = funcionario;
        this.caixa = caixa;
        this.itens = itens;
        this.formaPagamento = formaPagamento;
        this.valorPago = valorPago;
        this.troco = troco;
    }

    public Venda() {

    }

    public Usuario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Usuario funcionario) {
        this.funcionario = funcionario;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    @Override
    public String toString() {
        return "Venda numero: " + numero;
    }

}
