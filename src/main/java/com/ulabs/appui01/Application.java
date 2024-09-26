/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.appui01;

import com.ulabs.appui01.lib.router.EventManager;
import com.ulabs.appui01.lib.router.Router;
import com.ulabs.appui01.ui.UILogin;
import com.ulabs.appui01.ui.UIMain;

/**
 *
 * @author manuelguarniz
 */
public class Application {
    public static void main(String[] args) {
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UILogin login = new UILogin();
                login.setLocationRelativeTo(null);
                login.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
                UIMain main = new UIMain();
                main.setLocationRelativeTo(null);
                main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
                Router.route().events.subscribe("login", login);
                Router.route().events.subscribe("main", main);
                
                Router.route().on("main", "open");
            }
        });
    }
}
