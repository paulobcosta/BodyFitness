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
public class ClienteEditarDCutaneas extends javax.swing.JFrame {

    /**
     * Creates new form ClienteEditarDCutaneas
     */
    public ClienteEditarDCutaneas() {
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

        avaliaçãoPanel = new javax.swing.JPanel();
        subescapularLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        bicipitalLabel = new javax.swing.JLabel();
        supraIliacaLabel = new javax.swing.JLabel();
        tricipitalLavel = new javax.swing.JLabel();
        axilarMediaLabel = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        editarButton = new javax.swing.JButton();
        subescapularTField = new javax.swing.JTextField();
        idTField = new javax.swing.JTextField();
        bicipitalTField = new javax.swing.JTextField();
        supraIliacaTField = new javax.swing.JTextField();
        axilarMediaTField = new javax.swing.JTextField();
        tricipitalTField = new javax.swing.JTextField();
        peitoralLabel = new javax.swing.JLabel();
        abdominalLabel = new javax.swing.JLabel();
        coxaLabel = new javax.swing.JLabel();
        panturrilhaLabel = new javax.swing.JLabel();
        peitoralTField = new javax.swing.JTextField();
        AbdominalTField = new javax.swing.JTextField();
        coxaTField = new javax.swing.JTextField();
        panturrilhaTField = new javax.swing.JTextField();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        avaliaçãoPanel.setPreferredSize(new java.awt.Dimension(1000, 650));
        avaliaçãoPanel.setLayout(null);

        subescapularLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        subescapularLabel.setForeground(new java.awt.Color(254, 254, 254));
        subescapularLabel.setText("Subescapular :");
        avaliaçãoPanel.add(subescapularLabel);
        subescapularLabel.setBounds(60, 100, 160, 50);

        idLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(254, 254, 254));
        idLabel.setText("ID :");
        avaliaçãoPanel.add(idLabel);
        idLabel.setBounds(70, 200, 50, 50);

        bicipitalLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        bicipitalLabel.setForeground(new java.awt.Color(254, 254, 254));
        bicipitalLabel.setText("Bicipital :");
        avaliaçãoPanel.add(bicipitalLabel);
        bicipitalLabel.setBounds(60, 300, 110, 50);

        supraIliacaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        supraIliacaLabel.setForeground(new java.awt.Color(254, 254, 254));
        supraIliacaLabel.setText("SupraIliaca :");
        avaliaçãoPanel.add(supraIliacaLabel);
        supraIliacaLabel.setBounds(510, 300, 140, 50);

        tricipitalLavel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        tricipitalLavel.setForeground(new java.awt.Color(254, 254, 254));
        tricipitalLavel.setText("Tricipital :");
        avaliaçãoPanel.add(tricipitalLavel);
        tricipitalLavel.setBounds(500, 100, 110, 50);

        axilarMediaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        axilarMediaLabel.setForeground(new java.awt.Color(254, 254, 254));
        axilarMediaLabel.setText("Axilar Media :");
        avaliaçãoPanel.add(axilarMediaLabel);
        axilarMediaLabel.setBounds(510, 200, 160, 50);

        header.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        header.setForeground(new java.awt.Color(254, 254, 254));
        header.setText("Editar Dobras Cutaneas");
        header.setToolTipText("");
        avaliaçãoPanel.add(header);
        header.setBounds(340, 20, 390, 50);

        editarButton.setText("Editar");
        avaliaçãoPanel.add(editarButton);
        editarButton.setBounds(480, 580, 80, 50);

        subescapularTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subescapularTFieldActionPerformed(evt);
            }
        });
        avaliaçãoPanel.add(subescapularTField);
        subescapularTField.setBounds(230, 100, 210, 50);
        avaliaçãoPanel.add(idTField);
        idTField.setBounds(130, 200, 310, 50);
        avaliaçãoPanel.add(bicipitalTField);
        bicipitalTField.setBounds(170, 300, 270, 50);
        avaliaçãoPanel.add(supraIliacaTField);
        supraIliacaTField.setBounds(660, 300, 280, 50);
        avaliaçãoPanel.add(axilarMediaTField);
        axilarMediaTField.setBounds(670, 200, 270, 50);
        avaliaçãoPanel.add(tricipitalTField);
        tricipitalTField.setBounds(620, 100, 320, 50);

        peitoralLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        peitoralLabel.setForeground(new java.awt.Color(254, 254, 254));
        peitoralLabel.setText("Peitoral :");
        avaliaçãoPanel.add(peitoralLabel);
        peitoralLabel.setBounds(60, 400, 100, 50);

        abdominalLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        abdominalLabel.setForeground(new java.awt.Color(254, 254, 254));
        abdominalLabel.setText("Abdominal :");
        avaliaçãoPanel.add(abdominalLabel);
        abdominalLabel.setBounds(60, 500, 140, 50);

        coxaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        coxaLabel.setForeground(new java.awt.Color(254, 254, 254));
        coxaLabel.setText("Coxa :");
        avaliaçãoPanel.add(coxaLabel);
        coxaLabel.setBounds(510, 400, 80, 50);

        panturrilhaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        panturrilhaLabel.setForeground(new java.awt.Color(254, 254, 254));
        panturrilhaLabel.setText("Panturrilha :");
        avaliaçãoPanel.add(panturrilhaLabel);
        panturrilhaLabel.setBounds(510, 500, 140, 50);
        avaliaçãoPanel.add(peitoralTField);
        peitoralTField.setBounds(170, 400, 270, 50);
        avaliaçãoPanel.add(AbdominalTField);
        AbdominalTField.setBounds(200, 500, 240, 50);
        avaliaçãoPanel.add(coxaTField);
        coxaTField.setBounds(590, 400, 350, 50);
        avaliaçãoPanel.add(panturrilhaTField);
        panturrilhaTField.setBounds(650, 500, 290, 50);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        image.setText("image");
        avaliaçãoPanel.add(image);
        image.setBounds(-110, -50, 1962, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(avaliaçãoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(avaliaçãoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subescapularTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subescapularTFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subescapularTFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteEditarDCutaneas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteEditarDCutaneas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteEditarDCutaneas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteEditarDCutaneas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteEditarDCutaneas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AbdominalTField;
    private javax.swing.JLabel abdominalLabel;
    private javax.swing.JPanel avaliaçãoPanel;
    private javax.swing.JLabel axilarMediaLabel;
    private javax.swing.JTextField axilarMediaTField;
    private javax.swing.JLabel bicipitalLabel;
    private javax.swing.JTextField bicipitalTField;
    private javax.swing.JLabel coxaLabel;
    private javax.swing.JTextField coxaTField;
    private javax.swing.JButton editarButton;
    private javax.swing.JLabel header;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTField;
    private javax.swing.JLabel image;
    private javax.swing.JLabel panturrilhaLabel;
    private javax.swing.JTextField panturrilhaTField;
    private javax.swing.JLabel peitoralLabel;
    private javax.swing.JTextField peitoralTField;
    private javax.swing.JLabel subescapularLabel;
    private javax.swing.JTextField subescapularTField;
    private javax.swing.JLabel supraIliacaLabel;
    private javax.swing.JTextField supraIliacaTField;
    private javax.swing.JLabel tricipitalLavel;
    private javax.swing.JTextField tricipitalTField;
    // End of variables declaration//GEN-END:variables
}
