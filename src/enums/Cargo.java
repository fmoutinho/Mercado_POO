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
public enum Cargo {

    FUNCIONARIO("Funcionario"),
    GERENTE("Gerente");

    private final String cargo;

    private Cargo(String cargo) {
        this.cargo = cargo;
    }

    public String cargo() {
        return cargo;
    }

}
