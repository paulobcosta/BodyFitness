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
public class CadastroAdministradores extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAdministradores
     */
    public CadastroAdministradores() {
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        CadastroAdmPanel = new javax.swing.JPanel();
        dataNascimentoLabel = new javax.swing.JLabel();
        permissaoLabel = new javax.swing.JLabel();
        salarioLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        confirmacaoLabel = new javax.swing.JLabel();
        turnoLabel = new javax.swing.JLabel();
        ruaLabel = new javax.swing.JLabel();
        bairroLabel = new javax.swing.JLabel();
        numeroLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        cidadeTField = new javax.swing.JTextField();
        numeroTField = new javax.swing.JTextField();
        bairroTField = new javax.swing.JTextField();
        ruaTField = new javax.swing.JTextField();
        senhaTField = new javax.swing.JPasswordField();
        confsenhaTField = new javax.swing.JPasswordField();
        salarioTField = new javax.swing.JTextField();
        nomeTField = new javax.swing.JTextField();
        estadoCBox = new javax.swing.JComboBox<>();
        turnoCBox = new javax.swing.JComboBox<>();
        estadoLabel = new javax.swing.JLabel();
        nivelPerCBox = new javax.swing.JComboBox<>();
        cadastroButton = new javax.swing.JButton();
        head = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        image = new javax.swing.JLabel();

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        CadastroAdmPanel.setLayout(null);

        dataNascimentoLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        dataNascimentoLabel.setForeground(new java.awt.Color(254, 254, 254));
        dataNascimentoLabel.setText("Data de Nascimento :");
        dataNascimentoLabel.setToolTipText("");
        CadastroAdmPanel.add(dataNascimentoLabel);
        dataNascimentoLabel.setBounds(450, 110, 240, 50);

        permissaoLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        permissaoLabel.setForeground(new java.awt.Color(254, 254, 254));
        permissaoLabel.setText("Nivel de Permissão :");
        permissaoLabel.setToolTipText("");
        CadastroAdmPanel.add(permissaoLabel);
        permissaoLabel.setBounds(450, 430, 240, 50);

        salarioLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        salarioLabel.setForeground(new java.awt.Color(254, 254, 254));
        salarioLabel.setText("Salário :");
        CadastroAdmPanel.add(salarioLabel);
        salarioLabel.setBounds(450, 190, 120, 50);

        senhaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(254, 254, 254));
        senhaLabel.setText("Senha :");
        CadastroAdmPanel.add(senhaLabel);
        senhaLabel.setBounds(450, 270, 80, 50);

        nomeLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(254, 254, 254));
        nomeLabel.setText("Nome :");
        CadastroAdmPanel.add(nomeLabel);
        nomeLabel.setBounds(50, 110, 80, 50);

        confirmacaoLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        confirmacaoLabel.setForeground(new java.awt.Color(254, 254, 254));
        confirmacaoLabel.setText("Confirmar Senha :");
        CadastroAdmPanel.add(confirmacaoLabel);
        confirmacaoLabel.setBounds(450, 350, 200, 50);

        turnoLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        turnoLabel.setForeground(new java.awt.Color(254, 254, 254));
        turnoLabel.setText("Turno :");
        CadastroAdmPanel.add(turnoLabel);
        turnoLabel.setBounds(450, 510, 80, 50);

        ruaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        ruaLabel.setForeground(new java.awt.Color(254, 254, 254));
        ruaLabel.setText("Rua :");
        ruaLabel.setToolTipText("");
        CadastroAdmPanel.add(ruaLabel);
        ruaLabel.setBounds(50, 270, 80, 50);

        bairroLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        bairroLabel.setForeground(new java.awt.Color(254, 254, 254));
        bairroLabel.setText("Bairro :");
        CadastroAdmPanel.add(bairroLabel);
        bairroLabel.setBounds(50, 190, 80, 50);

        numeroLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        numeroLabel.setForeground(new java.awt.Color(254, 254, 254));
        numeroLabel.setText("Número :");
        CadastroAdmPanel.add(numeroLabel);
        numeroLabel.setBounds(50, 350, 120, 50);

        cidadeLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        cidadeLabel.setForeground(new java.awt.Color(254, 254, 254));
        cidadeLabel.setText("Cidade :");
        CadastroAdmPanel.add(cidadeLabel);
        cidadeLabel.setBounds(50, 430, 120, 50);
        CadastroAdmPanel.add(cidadeTField);
        cidadeTField.setBounds(180, 430, 210, 50);
        CadastroAdmPanel.add(numeroTField);
        numeroTField.setBounds(180, 350, 210, 50);
        CadastroAdmPanel.add(bairroTField);
        bairroTField.setBounds(140, 190, 250, 50);
        CadastroAdmPanel.add(ruaTField);
        ruaTField.setBounds(140, 270, 250, 50);
        CadastroAdmPanel.add(senhaTField);
        senhaTField.setBounds(580, 270, 350, 50);
        CadastroAdmPanel.add(confsenhaTField);
        confsenhaTField.setBounds(660, 350, 270, 50);
        CadastroAdmPanel.add(salarioTField);
        salarioTField.setBounds(580, 190, 350, 50);

        nomeTField.setVerifyInputWhenFocusTarget(false);
        nomeTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTFieldActionPerformed(evt);
            }
        });
        CadastroAdmPanel.add(nomeTField);
        nomeTField.setBounds(140, 110, 250, 50);

        estadoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC ", "AL", "AP ", "AM", "BA", "CE ", "DF ", "ES ", "GO  ", "MA  ", "MT", "MS ", "MG ", "PA", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        CadastroAdmPanel.add(estadoCBox);
        estadoCBox.setBounds(180, 510, 210, 50);

        turnoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CadastroAdmPanel.add(turnoCBox);
        turnoCBox.setBounds(540, 510, 150, 50);

        estadoLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        estadoLabel.setForeground(new java.awt.Color(254, 254, 254));
        estadoLabel.setText("Estado :");
        CadastroAdmPanel.add(estadoLabel);
        estadoLabel.setBounds(50, 510, 120, 50);

        nivelPerCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "gerente" }));
        CadastroAdmPanel.add(nivelPerCBox);
        nivelPerCBox.setBounds(700, 430, 230, 50);

        cadastroButton.setText("Cadastrar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });
        CadastroAdmPanel.add(cadastroButton);
        cadastroButton.setBounds(750, 510, 160, 50);

        head.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
        head.setForeground(new java.awt.Color(254, 254, 254));
        head.setText("Cadastro de Administradores");
        CadastroAdmPanel.add(head);
        head.setBounds(50, 20, 700, 60);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CadastroAdmPanel.add(jFormattedTextField2);
        jFormattedTextField2.setBounds(700, 110, 230, 50);

        image.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        image.setForeground(new java.awt.Color(254, 254, 254));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        image.setText("Estado :");
        CadastroAdmPanel.add(image);
        image.setBounds(-190, -140, 1210, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroAdmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroAdmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTFieldActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(CadastroAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAdministradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroAdmPanel;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JTextField bairroTField;
    private javax.swing.JButton cadastroButton;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cidadeTField;
    private javax.swing.JLabel confirmacaoLabel;
    private javax.swing.JPasswordField confsenhaTField;
    private javax.swing.JLabel dataNascimentoLabel;
    private javax.swing.JComboBox<String> estadoCBox;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel head;
    private javax.swing.JLabel image;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JComboBox<String> nivelPerCBox;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroTField;
    private javax.swing.JLabel permissaoLabel;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JTextField ruaTField;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JTextField salarioTField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaTField;
    private javax.swing.JComboBox<String> turnoCBox;
    private javax.swing.JLabel turnoLabel;
    // End of variables declaration//GEN-END:variables
}
