/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.quadros.paineis;

/**
 *
 * @author Luan Bodner do Rosário <luan.rosario.bodner@gmail.com>
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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

        CadastroPanel = new javax.swing.JPanel();
        ImagemPanel = new javax.swing.JPanel();
        nomeClienteLabel = new javax.swing.JLabel();
        dataNascimentoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ruaLabel = new javax.swing.JLabel();
        bairroLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        numeroLabel = new javax.swing.JLabel();
        dataNascimentoTField = new javax.swing.JTextField();
        nomeTField = new javax.swing.JTextField();
        cidadeTField = new javax.swing.JTextField();
        ruaTField = new javax.swing.JTextField();
        bairroTField = new javax.swing.JTextField();
        numeroTField = new javax.swing.JTextField();
        estadoCBox = new javax.swing.JComboBox<>();
        cadastroButton = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        CadastroPanel.setLayout(null);

        ImagemPanel.setLayout(null);

        nomeClienteLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        nomeClienteLabel.setForeground(new java.awt.Color(254, 254, 254));
        nomeClienteLabel.setText("Nome :");
        ImagemPanel.add(nomeClienteLabel);
        nomeClienteLabel.setBounds(70, 130, 80, 50);

        dataNascimentoLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        dataNascimentoLabel.setForeground(new java.awt.Color(254, 254, 254));
        dataNascimentoLabel.setText("Data de Nascimento :");
        ImagemPanel.add(dataNascimentoLabel);
        dataNascimentoLabel.setBounds(70, 230, 240, 50);

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Cadastro de Clientes");
        ImagemPanel.add(jLabel1);
        jLabel1.setBounds(275, 40, 450, 62);

        ruaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        ruaLabel.setForeground(new java.awt.Color(254, 254, 254));
        ruaLabel.setText("Rua :");
        ImagemPanel.add(ruaLabel);
        ruaLabel.setBounds(70, 430, 80, 50);

        bairroLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        bairroLabel.setForeground(new java.awt.Color(254, 254, 254));
        bairroLabel.setText("Bairro :");
        ImagemPanel.add(bairroLabel);
        bairroLabel.setBounds(500, 130, 80, 50);

        cidadeLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        cidadeLabel.setForeground(new java.awt.Color(254, 254, 254));
        cidadeLabel.setText("Cidade :");
        ImagemPanel.add(cidadeLabel);
        cidadeLabel.setBounds(70, 330, 120, 50);

        estadoLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        estadoLabel.setForeground(new java.awt.Color(254, 254, 254));
        estadoLabel.setText("Estado :");
        ImagemPanel.add(estadoLabel);
        estadoLabel.setBounds(500, 330, 120, 50);

        numeroLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        numeroLabel.setForeground(new java.awt.Color(254, 254, 254));
        numeroLabel.setText("Número :");
        ImagemPanel.add(numeroLabel);
        numeroLabel.setBounds(500, 230, 120, 50);

        dataNascimentoTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascimentoTFieldActionPerformed(evt);
            }
        });
        ImagemPanel.add(dataNascimentoTField);
        dataNascimentoTField.setBounds(320, 230, 150, 50);
        ImagemPanel.add(nomeTField);
        nomeTField.setBounds(170, 130, 300, 50);
        ImagemPanel.add(cidadeTField);
        cidadeTField.setBounds(200, 330, 270, 50);
        ImagemPanel.add(ruaTField);
        ruaTField.setBounds(170, 430, 300, 50);
        ImagemPanel.add(bairroTField);
        bairroTField.setBounds(590, 130, 300, 50);
        ImagemPanel.add(numeroTField);
        numeroTField.setBounds(630, 230, 260, 50);

        estadoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC ", "AL", "AP ", "AM", "BA", "CE ", "DF ", "ES ", "GO  ", "MA  ", "MT", "MS ", "MG ", "PA", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        estadoCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoCBoxActionPerformed(evt);
            }
        });
        ImagemPanel.add(estadoCBox);
        estadoCBox.setBounds(630, 330, 150, 50);

        cadastroButton.setText("Cadastrar");
        ImagemPanel.add(cadastroButton);
        cadastroButton.setBounds(450, 550, 150, 50);

        imagem.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        imagem.setForeground(new java.awt.Color(254, 254, 254));
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        imagem.setText("jLabel2");
        ImagemPanel.add(imagem);
        imagem.setBounds(-390, -140, 2120, 830);

        CadastroPanel.add(ImagemPanel);
        ImagemPanel.setBounds(0, 0, 1000, 650);

        getContentPane().add(CadastroPanel);
        CadastroPanel.setBounds(0, 0, 1000, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataNascimentoTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascimentoTFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascimentoTFieldActionPerformed

    private void estadoCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoCBoxActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroPanel;
    private javax.swing.JPanel ImagemPanel;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JTextField bairroTField;
    private javax.swing.JButton cadastroButton;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cidadeTField;
    private javax.swing.JLabel dataNascimentoLabel;
    private javax.swing.JTextField dataNascimentoTField;
    private javax.swing.JComboBox<String> estadoCBox;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nomeClienteLabel;
    private javax.swing.JTextField nomeTField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroTField;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JTextField ruaTField;
    // End of variables declaration//GEN-END:variables
}
