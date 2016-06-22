/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.quadros.paineis;

import bodyfitness.dao.CargoDAO;
import bodyfitness.pessoas.caracteristicas.Cargo;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan Bodner do Rosário <luan.rosario.bodner@gmail.com>
 */
public class CadastroCargo extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCargo
     */
    public CadastroCargo() {
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

        CadastroCargoPanel = new javax.swing.JPanel();
        nomeCargoTField = new javax.swing.JTextField();
        cargoButton = new javax.swing.JButton();
        ccLabel = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        CadastroCargoPanel.setLayout(null);

        nomeCargoTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCargoTFieldActionPerformed(evt);
            }
        });
        CadastroCargoPanel.add(nomeCargoTField);
        nomeCargoTField.setBounds(100, 270, 310, 50);

        cargoButton.setText("Criar Cargo");
        cargoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoButtonActionPerformed(evt);
            }
        });
        CadastroCargoPanel.add(cargoButton);
        cargoButton.setBounds(150, 350, 210, 40);

        ccLabel.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
        ccLabel.setForeground(new java.awt.Color(254, 254, 254));
        ccLabel.setText("Criação de Cargos");
        CadastroCargoPanel.add(ccLabel);
        ccLabel.setBounds(60, 20, 470, 110);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        CadastroCargoPanel.add(image);
        image.setBounds(-840, -100, 2030, 970);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroCargoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroCargoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCargoTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCargoTFieldActionPerformed
        // TODO add your handling code here:
        
        String field = nomeCargoTField.getText();
        System.out.println(field);
    }//GEN-LAST:event_nomeCargoTFieldActionPerformed

    private void cargoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoButtonActionPerformed
        // TODO add your handling code here:
        CargoDAO dao = new CargoDAO();
        if(this.nomeCargoTField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de Cargos em Branco", "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        else if(dao.consultarPorFuncao(this.nomeCargoTField.getText().toLowerCase()) != null) {
             JOptionPane.showMessageDialog(null, "Cargo já existe", "Erro", JOptionPane.ERROR_MESSAGE);
             this.nomeCargoTField.setText("");
        }
        else {
            dao.persist(new Cargo(this.nomeCargoTField.getText()));
            JOptionPane.showMessageDialog(null, "Cargo adicionado com sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            this.CadastroCargoPanel.setToolTipText("");
        }
    }//GEN-LAST:event_cargoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCargo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroCargoPanel;
    private javax.swing.JButton cargoButton;
    private javax.swing.JLabel ccLabel;
    private javax.swing.JLabel image;
    private javax.swing.JTextField nomeCargoTField;
    // End of variables declaration//GEN-END:variables
}
