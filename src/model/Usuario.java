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
public class Usuario {

    private String nome;
    private String login;
    private String senha;
    private boolean realizaConsulta;
    private boolean realizaVenda;
    private boolean editaEstoque;
    private boolean geraRelatorio;

    public Usuario() {
    }

    public Usuario(String nome, String login, String senha, boolean realizaConsulta, boolean editaEstoque, boolean geraRelatorio, boolean realizaVenda) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.realizaConsulta = realizaConsulta;
        this.editaEstoque = editaEstoque;
        this.geraRelatorio = geraRelatorio;
        this.realizaVenda = realizaVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isRealizaConsulta() {
        return realizaConsulta;
    }

    public void setRealizaConsulta(boolean realizaConsulta) {
        this.realizaConsulta = realizaConsulta;
    }

    public boolean isRealizaVenda() {
        return realizaVenda;
    }

    public void setRealizaVenda(boolean realizaVenda) {
        this.realizaVenda = realizaVenda;
    }

    public boolean isEditaEstoque() {
        return editaEstoque;
    }

    public void setEditaEstoque(boolean editaEstoque) {
        this.editaEstoque = editaEstoque;
    }

    public boolean isGeraRelatorio() {
        return geraRelatorio;
    }

    public void setGeraRelatorio(boolean geraRelatorio) {
        this.geraRelatorio = geraRelatorio;
    }

    @Override
    public String toString() {
        return this.login; //To change body of generated methods, choose Tools | Templates.
    }

}
