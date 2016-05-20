/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;
import enums.FormaPagamento;

/**
 *
 * @author Fernando
 */
public class Venda {

    private Funcionario funcionario;
    private Caixa caixa;
    private Collection<Item> itens;
    private FormaPagamento formaPagamento;
    private double valorPago;
    private double troco;

    public Venda(Funcionario funcionario, Caixa caixa, Collection<Item> itens, FormaPagamento formaPagamento, double valorPago, double troco) {
        this.funcionario = funcionario;
        this.caixa = caixa;
        this.itens = itens;
        this.formaPagamento = formaPagamento;
        this.valorPago = valorPago;
        this.troco = troco;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Collection<Item> getItens() {
        return itens;
    }

    public void setItens(Collection<Item> itens) {
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

}
