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
    private Collection<Produto> produtos;
    private FormaPagamento formaPagamento;
    private double valorPago;
    private double troco;


}
