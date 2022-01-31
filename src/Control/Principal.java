/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Util.Configura;
import View.TelaPrincipal;

/**
 *
 * @author Tegon Faria
 */
public class Principal {
    public static void main(String[] args) {
        Configura.LookAndFeel("Windows");
        TelaPrincipal tp = new TelaPrincipal();
        tp.setLocationRelativeTo(null);
        tp.setVisible(true);
        dao.ConnectionFactory.getConnection();
    }
}
