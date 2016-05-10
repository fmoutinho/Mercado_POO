/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Fernando
 */
public enum FormaPagamento {

    DINHEIRO("Dinheiro"),
    CARTAO("Cartão");

    private final String tipo;

    private FormaPagamento(String tipo) {
        this.tipo = tipo;
    }

    public String tipo() {
        return tipo;
    }
}
