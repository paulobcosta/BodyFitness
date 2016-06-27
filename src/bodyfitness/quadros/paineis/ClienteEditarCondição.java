/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.quadros.paineis;

import javax.swing.JFrame;

/**
 *
 * @author Luan Bodner do Rosário <luan.rosario.bodner@gmail.com>
 */
public class ClienteEditarCondição extends javax.swing.JFrame {

    /**
     * Creates new form ClienteEditarCondição
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public ClienteEditarCondição(Long id) {
        initComponents();
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuAvaliaçãoPanel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        indicesButton = new javax.swing.JButton();
        msuperioresButton = new javax.swing.JButton();
        minferioresButton = new javax.swing.JButton();
        dcutaneaButton = new javax.swing.JButton();
        editarTreinoButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        menuAvaliaçãoPanel.setLayout(null);

        header.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        header.setForeground(new java.awt.Color(254, 254, 254));
        header.setText("Condição do Cliente");
        menuAvaliaçãoPanel.add(header);
        header.setBounds(340, 50, 330, 70);

        indicesButton.setText("Editar índices");
        indicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicesButtonActionPerformed(evt);
            }
        });
        menuAvaliaçãoPanel.add(indicesButton);
        indicesButton.setBounds(150, 210, 300, 75);

        msuperioresButton.setText("Editar Membro Superiores");
        msuperioresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msuperioresButtonActionPerformed(evt);
            }
        });
        menuAvaliaçãoPanel.add(msuperioresButton);
        msuperioresButton.setBounds(150, 350, 300, 75);

        minferioresButton.setText("Editar Membros Inferiores");
        minferioresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minferioresButtonActionPerformed(evt);
            }
        });
        menuAvaliaçãoPanel.add(minferioresButton);
        minferioresButton.setBounds(540, 210, 300, 75);

        dcutaneaButton.setText("Editar Dobras Cutaneas");
        dcutaneaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcutaneaButtonActionPerformed(evt);
            }
        });
        menuAvaliaçãoPanel.add(dcutaneaButton);
        dcutaneaButton.setBounds(540, 350, 300, 75);

        editarTreinoButton.setText("Editar Treino");
        editarTreinoButton.setToolTipText("");
        editarTreinoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTreinoButtonActionPerformed(evt);
            }
        });
        menuAvaliaçãoPanel.add(editarTreinoButton);
        editarTreinoButton.setBounds(350, 500, 300, 75);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        image.setText("jLabel1");
        menuAvaliaçãoPanel.add(image);
        image.setBounds(-50, -60, 1090, 990);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuAvaliaçãoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuAvaliaçãoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicesButtonActionPerformed
        // TODO add your handling code here:

        PainelClienteEditarIndices indices = new PainelClienteEditarIndices(this.getId());
        indices.setVisible(true);

    }//GEN-LAST:event_indicesButtonActionPerformed

    private void msuperioresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msuperioresButtonActionPerformed
        // TODO add your handling code here:
        
        ClienteEditarMembrosSuperiores indices = new ClienteEditarMembrosSuperiores();
        indices.setVisible(true);
        
    }//GEN-LAST:event_msuperioresButtonActionPerformed

    private void minferioresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minferioresButtonActionPerformed
        // TODO add your handling code here:
        
        ClienteEditarMembrosInferiores indices = new ClienteEditarMembrosInferiores(this.getId());
        indices.setVisible(true);
    }//GEN-LAST:event_minferioresButtonActionPerformed

    private void dcutaneaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcutaneaButtonActionPerformed
        // TODO add your handling code here:
        
        ClienteEditarDCutaneas indices = new ClienteEditarDCutaneas();
        indices.setVisible(true);
    }//GEN-LAST:event_dcutaneaButtonActionPerformed

    private void editarTreinoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTreinoButtonActionPerformed
        // TODO add your handling code here:
        
        ClienteEditarTreino indices = new ClienteEditarTreino();
        indices.setVisible(true);
        
    }//GEN-LAST:event_editarTreinoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteEditarCondição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteEditarCondição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteEditarCondição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteEditarCondição.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ClienteEditarCondição().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dcutaneaButton;
    private javax.swing.JButton editarTreinoButton;
    private javax.swing.JLabel header;
    private javax.swing.JLabel image;
    private javax.swing.JButton indicesButton;
    private javax.swing.JPanel menuAvaliaçãoPanel;
    private javax.swing.JButton minferioresButton;
    private javax.swing.JButton msuperioresButton;
    // End of variables declaration//GEN-END:variables
}
