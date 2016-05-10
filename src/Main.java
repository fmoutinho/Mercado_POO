
import model.Usuario;
import util.BaseDeDados;
import view.FrmLogin;
import view.FrmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando
 */
public class Main {

    public static void main(String[] args) {
        BaseDeDados baseDeDados = new BaseDeDados();
        Usuario usuarioAtual = null;
        FrmPrincipal frmPrincipal = null;
        
        FrmLogin frmLogin = new FrmLogin(baseDeDados, usuarioAtual, frmPrincipal);
  


    }

}
