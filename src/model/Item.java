/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fernando
 */
public class Item {

    private Produto produto;
    private double quantidade;
    private double preco;

    public Item(Produto produto, float quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Item.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Item other = (Item) obj;

        return this.produto.equals(other.getProduto());
    }

    @Override
    public String toString() {
        return this.getProduto().toString() + "    " + quantidade + "    " + preco;
    }

}
