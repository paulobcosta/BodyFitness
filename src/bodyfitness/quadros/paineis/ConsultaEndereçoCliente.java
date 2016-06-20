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
public class ConsultaEndereçoCliente extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaEndereçoCliente
     */
    public ConsultaEndereçoCliente() {
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

        buscaEndereçoPanel = new javax.swing.JPanel();
        buscaPane = new javax.swing.JScrollPane();
        buscatTable = new javax.swing.JTable();
        headerLabel = new javax.swing.JLabel();
        buscaLabel = new javax.swing.JLabel();
        buscaTField = new javax.swing.JTextField();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buscaEndereçoPanel.setLayout(null);

        buscatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Rua", "Cidade", "Número", "Bairro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        buscaPane.setViewportView(buscatTable);

        buscaEndereçoPanel.add(buscaPane);
        buscaPane.setBounds(20, 230, 960, 400);

        headerLabel.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(254, 254, 254));
        headerLabel.setText("Consultar Endereço do Cliente");
        buscaEndereçoPanel.add(headerLabel);
        headerLabel.setBounds(260, 30, 510, 50);

        buscaLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        buscaLabel.setForeground(new java.awt.Color(254, 254, 254));
        buscaLabel.setText("Busca :");
        buscaEndereçoPanel.add(buscaLabel);
        buscaLabel.setBounds(90, 140, 80, 50);
        buscaEndereçoPanel.add(buscaTField);
        buscaTField.setBounds(180, 140, 750, 50);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/índice.jpg"))); // NOI18N
        image.setText("jLabel1");
        buscaEndereçoPanel.add(image);
        image.setBounds(-120, -60, 1310, 1090);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscaEndereçoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscaEndereçoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultaEndereçoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEndereçoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEndereçoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEndereçoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEndereçoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscaEndereçoPanel;
    private javax.swing.JLabel buscaLabel;
    private javax.swing.JScrollPane buscaPane;
    private javax.swing.JTextField buscaTField;
    private javax.swing.JTable buscatTable;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}
