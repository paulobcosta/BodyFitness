/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.quadros.paineis;

/**
 *
 * @author a1509950
 */
public class ConsultaFuncionários extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaFuncionários
     */
    public ConsultaFuncionários() {
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

        consultaFunc = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        listaConsultaPane = new javax.swing.JScrollPane();
        listaConsultaTable = new javax.swing.JTable();
        tipoBuscaCBox = new javax.swing.JComboBox<>();
        tipoBuscaLabel = new javax.swing.JLabel();
        critérioLabel = new javax.swing.JLabel();
        critérioCBox = new javax.swing.JComboBox<>();
        buscaButton = new javax.swing.JButton();
        buscaLabel = new javax.swing.JLabel();
        buscaTField = new javax.swing.JTextField();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        consultaFunc.setLayout(null);

        header.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        header.setForeground(new java.awt.Color(254, 254, 254));
        header.setText("Consulta de Funcionários");
        consultaFunc.add(header);
        header.setBounds(300, 20, 410, 50);

        listaConsultaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Salário", "Turno", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaConsultaTable.setOpaque(false);
        listaConsultaPane.setViewportView(listaConsultaTable);

        consultaFunc.add(listaConsultaPane);
        listaConsultaPane.setBounds(20, 220, 960, 410);

        tipoBuscaCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "funcionário", "gerente" }));
        consultaFunc.add(tipoBuscaCBox);
        tipoBuscaCBox.setBounds(140, 90, 200, 50);

        tipoBuscaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        tipoBuscaLabel.setForeground(new java.awt.Color(254, 254, 254));
        tipoBuscaLabel.setText("Cargo :");
        consultaFunc.add(tipoBuscaLabel);
        tipoBuscaLabel.setBounds(50, 90, 80, 50);

        critérioLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        critérioLabel.setForeground(new java.awt.Color(254, 254, 254));
        critérioLabel.setText("Critério : ");
        consultaFunc.add(critérioLabel);
        critérioLabel.setBounds(390, 90, 100, 50);

        critérioCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "nome", "turno", "salários", "endereço" }));
        consultaFunc.add(critérioCBox);
        critérioCBox.setBounds(500, 90, 210, 50);

        buscaButton.setText("Buscar");
        consultaFunc.add(buscaButton);
        buscaButton.setBounds(750, 90, 200, 50);

        buscaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        buscaLabel.setForeground(new java.awt.Color(254, 254, 254));
        buscaLabel.setText("Busca :");
        consultaFunc.add(buscaLabel);
        buscaLabel.setBounds(50, 160, 80, 50);

        buscaTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaTFieldActionPerformed(evt);
            }
        });
        consultaFunc.add(buscaTField);
        buscaTField.setBounds(140, 160, 810, 50);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        imagem.setText("jLabel1");
        consultaFunc.add(imagem);
        imagem.setBounds(0, 0, 1190, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaTFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaTFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaFuncionários.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionários.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionários.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionários.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFuncionários().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaButton;
    private javax.swing.JLabel buscaLabel;
    private javax.swing.JTextField buscaTField;
    private javax.swing.JPanel consultaFunc;
    private javax.swing.JComboBox<String> critérioCBox;
    private javax.swing.JLabel critérioLabel;
    private javax.swing.JLabel header;
    private javax.swing.JLabel imagem;
    private javax.swing.JScrollPane listaConsultaPane;
    private javax.swing.JTable listaConsultaTable;
    private javax.swing.JComboBox<String> tipoBuscaCBox;
    private javax.swing.JLabel tipoBuscaLabel;
    // End of variables declaration//GEN-END:variables
}
