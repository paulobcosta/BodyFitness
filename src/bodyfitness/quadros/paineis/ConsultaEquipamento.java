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
public class ConsultaEquipamento extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaEquipamento
     */
    public ConsultaEquipamento() {
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

        consultaPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        buscaLabel = new javax.swing.JLabel();
        critérioLabel = new javax.swing.JLabel();
        buscaTField = new javax.swing.JTextField();
        critérioCBox = new javax.swing.JComboBox<>();
        buscarButton = new javax.swing.JButton();
        buscaPane = new javax.swing.JScrollPane();
        buscaTable = new javax.swing.JTable();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        consultaPanel.setLayout(null);

        headerLabel.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(254, 254, 254));
        headerLabel.setText("Consulta de Equipamentos");
        consultaPanel.add(headerLabel);
        headerLabel.setBounds(290, 20, 460, 50);

        buscaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        buscaLabel.setForeground(new java.awt.Color(254, 254, 254));
        buscaLabel.setText("Busca :");
        consultaPanel.add(buscaLabel);
        buscaLabel.setBounds(70, 170, 80, 50);

        critérioLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        critérioLabel.setForeground(new java.awt.Color(254, 254, 254));
        critérioLabel.setText("Critério :");
        consultaPanel.add(critérioLabel);
        critérioLabel.setBounds(50, 90, 100, 50);

        buscaTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaTFieldActionPerformed(evt);
            }
        });
        consultaPanel.add(buscaTField);
        buscaTField.setBounds(160, 170, 780, 50);

        critérioCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nome", "id", "habilitados", "desabilitados" }));
        consultaPanel.add(critérioCBox);
        critérioCBox.setBounds(160, 90, 600, 50);

        buscarButton.setText("Buscar");
        consultaPanel.add(buscarButton);
        buscarButton.setBounds(800, 90, 140, 50);

        buscaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Peso Mínimo", "Peso Máximo", "U. Manutenção", "P. Manutenção", "Condição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        buscaPane.setViewportView(buscaTable);

        consultaPanel.add(buscaPane);
        buscaPane.setBounds(20, 250, 960, 380);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        image.setText("jLabel1");
        consultaPanel.add(image);
        image.setBounds(-50, -70, 1969, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(ConsultaEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscaLabel;
    private javax.swing.JScrollPane buscaPane;
    private javax.swing.JTextField buscaTField;
    private javax.swing.JTable buscaTable;
    private javax.swing.JButton buscarButton;
    private javax.swing.JPanel consultaPanel;
    private javax.swing.JComboBox<String> critérioCBox;
    private javax.swing.JLabel critérioLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}
