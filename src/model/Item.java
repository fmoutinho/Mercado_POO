/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.Medida;

/**
 *
 * @author Fernando
 */
public class Item {

    private Produto produto;
    private float quantidade;
    private Medida medida;

    public Item(Produto produto, float quantidade, Medida medida) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.medida = medida;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Medida getMedida() {
        return medida;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }

}
