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
public enum Medida {

    QUILO("Quilo"),
    UNIDADE("Unidade");

    private final String medida;

    private Medida(String medida) {
        this.medida = medida;
    }

    public String medida() {
        return medida;
    }

}
