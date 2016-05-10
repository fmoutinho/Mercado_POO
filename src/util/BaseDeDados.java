/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import enums.Cargo;
import enums.Medida;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Gerente;
import model.Produto;
import model.Usuario;
import model.Venda;
import model.Caixa;

/**
 *
 * @author Fernando
 */
public class BaseDeDados {

    private Set<Usuario> usuarios;
    private ArrayList<Produto> produtos;
    private ArrayList<Venda> vendas;
    private Set<Caixa> caixas;

    public BaseDeDados() {
        this.usuarios = new HashSet<>();
        this.produtos = new ArrayList<>();
        this.vendas = new ArrayList<>();
        this.caixas = new HashSet<>();
        insereUsuario("Leonardo Murta", "lmurta", "murtauff", Cargo.GERENTE);
        insereUsuario("Fernando Moutinho", "fmoutinho", "fernandouff", Cargo.FUNCIONARIO);
        insereUsuario("Teste Gerente", "g", "g", Cargo.GERENTE);
        insereUsuario("Teste Funcionario", "f", "f", Cargo.FUNCIONARIO);
        insereUsuario("Julia Bandeira", "jbandeira", "juliauff", Cargo.FUNCIONARIO);
        insereUsuario("Mateus Reis", "mreis", "mateusuff", Cargo.FUNCIONARIO);
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

    public void insereProduto(String nome, double preco, double valorDaMedida, Medida medida) {
        produtos.add(new Produto(nome, preco, valorDaMedida, medida));

    }

    public void insereCaixa(int numero) {
        caixas.add(new Caixa(numero));
    }

    public Iterable<Usuario> listaUsuarios() {
        return this.usuarios;
    }

}
