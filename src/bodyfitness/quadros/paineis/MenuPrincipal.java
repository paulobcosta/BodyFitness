/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.quadros.paineis;

import javax.swing.JFrame;

/**
 *
 * @author a1509950
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        barraPrincipalMBar = new javax.swing.JMenuBar();
        consultasMenu = new javax.swing.JMenu();
        consultaCliente = new javax.swing.JMenuItem();
        consultaFunc = new javax.swing.JMenuItem();
        consultaEndereço = new javax.swing.JMenuItem();
        consultaPagamento = new javax.swing.JMenuItem();
        cadastroMenu = new javax.swing.JMenu();
        cadastroAdm = new javax.swing.JMenuItem();
        cadastroCargo = new javax.swing.JMenuItem();
        cadastroFunc = new javax.swing.JMenuItem();
        cadastroCliente = new javax.swing.JMenuItem();
        sairMenu = new javax.swing.JMenu();
        mudarUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        menuPanel.setLayout(null);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        image.setText("jLabel1");
        menuPanel.add(image);
        image.setBounds(-220, -50, 1270, 790);

        barraPrincipalMBar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                barraPrincipalMBarComponentAdded(evt);
            }
        });

        consultasMenu.setText("Consultas");
        consultasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasMenuActionPerformed(evt);
            }
        });

        consultaCliente.setText("Consulta Cliente");
        consultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaClienteActionPerformed(evt);
            }
        });
        consultasMenu.add(consultaCliente);

        consultaFunc.setText("Consulta Funcionário");
        consultaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaFuncActionPerformed(evt);
            }
        });
        consultasMenu.add(consultaFunc);

        consultaEndereço.setText("Consulta Endereço");
        consultaEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaEndereçoActionPerformed(evt);
            }
        });
        consultasMenu.add(consultaEndereço);

        consultaPagamento.setText("Consulta Pagamento");
        consultaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPagamentoActionPerformed(evt);
            }
        });
        consultasMenu.add(consultaPagamento);

        barraPrincipalMBar.add(consultasMenu);

        cadastroMenu.setText("Cadastro");

        cadastroAdm.setText("Cadastro Administradores");
        cadastroAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAdmActionPerformed(evt);
            }
        });
        cadastroMenu.add(cadastroAdm);

        cadastroCargo.setText("Cadastro de Cargo");
        cadastroCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCargoActionPerformed(evt);
            }
        });
        cadastroMenu.add(cadastroCargo);

        cadastroFunc.setText("Cadastro de Funcionários");
        cadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFuncActionPerformed(evt);
            }
        });
        cadastroMenu.add(cadastroFunc);

        cadastroCliente.setText("Cadastro Cliente");
        cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteActionPerformed(evt);
            }
        });
        cadastroMenu.add(cadastroCliente);

        barraPrincipalMBar.add(cadastroMenu);

        sairMenu.setText("Sair");

        mudarUsuario.setText("Trocar de Usuário");
        mudarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarUsuarioActionPerformed(evt);
            }
        });
        sairMenu.add(mudarUsuario);

        barraPrincipalMBar.add(sairMenu);

        setJMenuBar(barraPrincipalMBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menuPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraPrincipalMBarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_barraPrincipalMBarComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_barraPrincipalMBarComponentAdded

    private void consultasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultasMenuActionPerformed

    private void consultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaClienteActionPerformed
        // TODO add your handling code here:
        JFrame consultaCliente = new PainelConsultaCliente();
        
        consultaCliente.setVisible(true);
    }//GEN-LAST:event_consultaClienteActionPerformed

    private void consultaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaFuncActionPerformed
        // TODO add your handling code here:
        JFrame consultaFunc = new PainelConsultaFuncionarios();
        
        consultaFunc.setVisible(true);
    }//GEN-LAST:event_consultaFuncActionPerformed

    private void consultaEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaEndereçoActionPerformed
        // TODO add your handling code here:
        
        JFrame consultaEnd = new ConsultaEndereçoCliente();
        
        consultaEnd.setVisible(true);
    }//GEN-LAST:event_consultaEndereçoActionPerformed

    private void cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteActionPerformed
        // TODO add your handling code here:
        
        JFrame cadastroCliente = new PainelCadastroCliente();
        
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_cadastroClienteActionPerformed

    private void cadastroAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAdmActionPerformed
        // TODO add your handling code here:
        
        JFrame cadastroAdm = new CadastroAdministradores();
        
        cadastroAdm.setVisible(true);
    }//GEN-LAST:event_cadastroAdmActionPerformed

    private void cadastroCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCargoActionPerformed
        // TODO add your handling code here:
        
        JFrame cadastroCargo = new CadastroCargo();
        
        cadastroCargo.setVisible(true);
    }//GEN-LAST:event_cadastroCargoActionPerformed

    private void cadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFuncActionPerformed
        // TODO add your handling code here:
        
        JFrame cadastroFunc = new CadastroFuncionário();
        
        cadastroFunc.setVisible(true);
    }//GEN-LAST:event_cadastroFuncActionPerformed

    private void consultaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPagamentoActionPerformed
        // TODO add your handling code here:
        
        JFrame consultaPag = new ConsultaPagamento();
        
        consultaPag.setVisible(true);
    }//GEN-LAST:event_consultaPagamentoActionPerformed

    private void mudarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarUsuarioActionPerformed
        // TODO add your handling code here:
        
        JFrame loginSistema = new LoginSistema();
        
        this.setVisible(false);
        loginSistema.setVisible(true);
    }//GEN-LAST:event_mudarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraPrincipalMBar;
    private javax.swing.JMenuItem cadastroAdm;
    private javax.swing.JMenuItem cadastroCargo;
    private javax.swing.JMenuItem cadastroCliente;
    private javax.swing.JMenuItem cadastroFunc;
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JMenuItem consultaCliente;
    private javax.swing.JMenuItem consultaEndereço;
    private javax.swing.JMenuItem consultaFunc;
    private javax.swing.JMenuItem consultaPagamento;
    private javax.swing.JMenu consultasMenu;
    private javax.swing.JLabel image;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JMenuItem mudarUsuario;
    private javax.swing.JMenu sairMenu;
    // End of variables declaration//GEN-END:variables


}
