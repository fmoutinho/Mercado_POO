/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import enums.Cargo;
import enums.Medida;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Gerente;
import model.Produto;
import model.Usuario;
import model.Venda;
import model.Caixa;
import model.Item;

/**
 *
 * @author Fernando
 */
public class BaseDeDados {

    private Usuario usuarioAtual;
    private Set<Usuario> usuarios;
    private Set<Produto> produtos;
    private ArrayList<Venda> vendas;
    private Set<Caixa> caixas;
    private Set<Item> estoque;

    private static BaseDeDados instance = null;

    public static BaseDeDados getInstance() {
        if (instance == null) {
            instance = new BaseDeDados();
        }
        return instance;
    }

    private BaseDeDados() {
        this.usuarios = new HashSet<>();
        this.produtos = new HashSet<>();
        this.vendas = new ArrayList<>();
        this.caixas = new HashSet<>();
        this.estoque = new HashSet<>();
        insereUsuario("Leonardo Murta", "lmurta", "murtauff", Cargo.GERENTE);
        insereUsuario("Fernando Moutinho", "fmoutinho", "fernandouff", Cargo.FUNCIONARIO);
        insereUsuario("Julia Bandeira", "jbandeira", "juliauff", Cargo.FUNCIONARIO);
        insereUsuario("Mateus Reis", "mreis", "mateusuff", Cargo.FUNCIONARIO);
        insereUsuario("Teste Gerente", "g", "g", Cargo.GERENTE);
        insereUsuario("Teste Funcionario", "f", "f", Cargo.FUNCIONARIO);
        insereProduto("Biscoito", "POO-Bisc2016.1", 5, Medida.UNIDADE);
        insereCaixa(1);
        insereCaixa(2);
        insereCaixa(3);

    }

    public void insereUsuario(String nome, String login, String senha, Cargo cargo) {

        switch (cargo) {
            case FUNCIONARIO:
                usuarios.add(new Funcionario(nome, login, senha));
                break;
            case GERENTE:
                usuarios.add(new Gerente(nome, login, senha));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Cargo não encontrado");

        }
    }

    public void insereProduto(String nome, String codigo, double preco, Medida medida) {
        produtos.add(new Produto(nome, codigo, preco, medida));

    }

    public void editaProduto(Produto produto) {
        for (Produto aux : produtos) {
            if (produto.equals(aux)) {
                aux.setMedida(produto.getMedida());
                aux.setPreco(produto.getPreco());
            }
        }

    }

    public void excluiProduto(Produto produto) {
        for (Produto aux : produtos) {
            if (produto.equals(aux)) {
                produtos.remove(aux);
            }
        }
    }

    public void insereCaixa(int numero) {
        caixas.add(new Caixa(numero));
    }

    public Iterable<Usuario> listaUsuarios() {
        return this.usuarios;
    }

    public Usuario getUsuarioAtual() {
        return usuarioAtual;
    }

    public void setUsuarioAtual(Usuario usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public Set<Caixa> getCaixas() {
        return caixas;
    }

    public void setCaixas(Set<Caixa> caixas) {
        this.caixas = caixas;
    }

    public Iterable<Item> getEstoque() {
        return estoque;
    }

    public void insereEstoque(Produto produto, float quantidade) {
        estoque.add(new Item(produto, quantidade));
    }

    public void editaEstoque(Item itemEstoque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
