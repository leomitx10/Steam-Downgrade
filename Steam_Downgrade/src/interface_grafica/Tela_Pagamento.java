/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interface_grafica;

/**
 *
 * @author gustavofbs
 */
public class Tela_Pagamento extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Pagamento
     */
    public Tela_Pagamento() {
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Forma de pagamento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(46, 73, 234, 26);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleto", "Cartão (crédito)", "Cartão (débito)", "PIX" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(46, 171, 235, 23);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(46, 458, 72, 23);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Selecione uma forma de pagamento");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(46, 136, 250, 17);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Formas de pagamento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(346, 78, 176, 17);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Nós aceitamos as seguintes formas seguras de pagamento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(346, 136, 416, 17);

        jTextArea1.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Os dados de pagamento enviados são protegidos pela\ntecnologia de Secure Socket Layer (SSL), certificada por\num certificado digital.");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(346, 399, 408, 82);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mastercard (1).png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(856, 270, 0, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/visa.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(976, 270, 0, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/224427_boleto_icon.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 0, 0);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/piximg (2).png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(768, 270, 0, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/224427_boleto_icon.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(346, 159, 60, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/piximg (2).png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 164, 48, 48);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mastercard (1).png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(480, 164, 64, 48);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/visa.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(550, 174, 96, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Pagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
