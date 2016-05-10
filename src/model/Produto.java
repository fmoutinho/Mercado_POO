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
    private double preco;
    private double valorMedida;
    private Medida medida;

    public Produto() {
    }

    public Produto(String nome, double preco, double valorMedida, Medida medida) {
        this.nome = nome;
        this.preco = preco;
        this.valorMedida = valorMedida;
        this.medida = medida;
    }

}
