/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.quadros.paineis;

import bodyfitness.dao.EquipamentoDAO;
import bodyfitness.equipamentos.Equipamento;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author a1509950
 */
public class PainelCadastroEquipamento extends javax.swing.JFrame {

    /**
     * Creates new form CadastroEquipamento
     */
    public PainelCadastroEquipamento() {
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

        cadastroEquipamentoPanel = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        pmaximoLabel = new javax.swing.JLabel();
        pminimoLabel = new javax.swing.JLabel();
        cadastroButton = new javax.swing.JButton();
        headerLabel = new javax.swing.JLabel();
        nomeTField = new javax.swing.JTextField();
        pemaximoCBox = new javax.swing.JComboBox<>();
        pminimoCBox = new javax.swing.JComboBox<>();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cadastroEquipamentoPanel.setLayout(null);

        nomeLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(254, 254, 254));
        nomeLabel.setText("Nome :");
        cadastroEquipamentoPanel.add(nomeLabel);
        nomeLabel.setBounds(90, 180, 80, 50);

        pmaximoLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        pmaximoLabel.setForeground(new java.awt.Color(254, 254, 254));
        pmaximoLabel.setText("Peso Máximo :");
        cadastroEquipamentoPanel.add(pmaximoLabel);
        pmaximoLabel.setBounds(90, 280, 160, 50);

        pminimoLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        pminimoLabel.setForeground(new java.awt.Color(254, 254, 254));
        pminimoLabel.setText("Peso Mínimo :");
        cadastroEquipamentoPanel.add(pminimoLabel);
        pminimoLabel.setBounds(90, 380, 160, 50);

        cadastroButton.setText("Cadastrar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });
        cadastroEquipamentoPanel.add(cadastroButton);
        cadastroButton.setBounds(710, 280, 80, 50);

        headerLabel.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(254, 254, 254));
        headerLabel.setText("Cadastro de Equipamento");
        cadastroEquipamentoPanel.add(headerLabel);
        headerLabel.setBounds(320, 30, 420, 60);
        cadastroEquipamentoPanel.add(nomeTField);
        nomeTField.setBounds(180, 180, 460, 50);

        pemaximoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75", "80" }));
        cadastroEquipamentoPanel.add(pemaximoCBox);
        pemaximoCBox.setBounds(260, 280, 380, 50);

        pminimoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75", "80" }));
        cadastroEquipamentoPanel.add(pminimoCBox);
        pminimoCBox.setBounds(250, 380, 390, 50);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        imagem.setText("jLabel1");
        cadastroEquipamentoPanel.add(imagem);
        imagem.setBounds(-60, -450, 1810, 1470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastroEquipamentoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastroEquipamentoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        // TODO add your handling code here:
        EquipamentoDAO dao = new EquipamentoDAO();
        if(this.nomeTField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome do equipamento está vazio", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else if(!this.nomeTField.getText().matches("^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$")) {
            JOptionPane.showMessageDialog(null, "Nome incompatível!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else {
            Equipamento equipamento = new Equipamento();
            equipamento.setNome(this.nomeTField.getText());
            equipamento.setPesoMinimo(this.pminimoCBox.getSelectedItem().toString());
            equipamento.setPesoMaximo(this.pemaximoCBox.getSelectedItem().toString());
            equipamento.setDataDaUltimaManutencao(new Date());
            equipamento.setDataDaProximaManutencao();
            equipamento.setHabilitado(true);
            dao.persist(equipamento);
            JOptionPane.showMessageDialog(null, "Equipamento Cadastrado com Sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cadastroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PainelCadastroEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelCadastroEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelCadastroEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelCadastroEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelCadastroEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JPanel cadastroEquipamentoPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTField;
    private javax.swing.JComboBox<String> pemaximoCBox;
    private javax.swing.JLabel pmaximoLabel;
    private javax.swing.JComboBox<String> pminimoCBox;
    private javax.swing.JLabel pminimoLabel;
    // End of variables declaration//GEN-END:variables
}