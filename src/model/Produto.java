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
public class Produto {

    private String nome;
    private String codigo;
    private double preco;
    private double valorMedida;
    private Medida medida;

    public Produto() {
    }

    public Produto(String nome, String codigo, double preco, Medida medida) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.medida = medida;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorMedida() {
        return valorMedida;
    }

    public void setValorMedida(double valorMedida) {
        this.valorMedida = valorMedida;
    }

    public Medida getMedida() {
        return medida;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {

        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Produto.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Produto other = (Produto) obj;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

}
