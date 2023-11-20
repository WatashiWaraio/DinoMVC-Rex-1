package Vista;

public class UIUSER extends javax.swing.JFrame {

    /**
     * Creates new form UIUSER
     */
    public UIUSER() {
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

        panelAzul = new javax.swing.JPanel();
        Configuracionbtn = new javax.swing.JButton();
        Iniciobtn = new javax.swing.JButton();
        tutorialesbtn = new javax.swing.JButton();
        capacitacionesbtn = new javax.swing.JButton();
        configuracionesbtn = new javax.swing.JButton();
        mancha2 = new javax.swing.JLabel();
        mancha1 = new javax.swing.JLabel();
        Fondoblanco = new javax.swing.JPanel();
        Funciones = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        OrdenPedidobtn = new javax.swing.JButton();
        GastosBtn1 = new javax.swing.JButton();
        PQR = new javax.swing.JButton();
        TINTURADOS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul.setBackground(new java.awt.Color(31, 65, 169));
        panelAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Configuracionbtn.setBackground(new java.awt.Color(31, 65, 169));
        Configuracionbtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Configuracionbtn.setForeground(new java.awt.Color(255, 255, 255));
        Configuracionbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/Setting.png"))); // NOI18N
        Configuracionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionbtnActionPerformed(evt);
            }
        });
        panelAzul.add(Configuracionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 140, 30));

        Iniciobtn.setBackground(new java.awt.Color(31, 65, 169));
        Iniciobtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Iniciobtn.setForeground(new java.awt.Color(255, 255, 255));
        Iniciobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/Home.png"))); // NOI18N
        Iniciobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciobtnActionPerformed(evt);
            }
        });
        panelAzul.add(Iniciobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, 30));

        tutorialesbtn.setBackground(new java.awt.Color(31, 65, 169));
        tutorialesbtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tutorialesbtn.setForeground(new java.awt.Color(255, 255, 255));
        tutorialesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/Category.png"))); // NOI18N
        tutorialesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialesbtnActionPerformed(evt);
            }
        });
        panelAzul.add(tutorialesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, 30));

        capacitacionesbtn.setBackground(new java.awt.Color(31, 65, 169));
        capacitacionesbtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        capacitacionesbtn.setForeground(new java.awt.Color(255, 255, 255));
        capacitacionesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/Chat.png"))); // NOI18N
        capacitacionesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacitacionesbtnActionPerformed(evt);
            }
        });
        panelAzul.add(capacitacionesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, 30));

        configuracionesbtn.setBackground(new java.awt.Color(31, 65, 169));
        configuracionesbtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        configuracionesbtn.setForeground(new java.awt.Color(255, 255, 255));
        configuracionesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/Folder.png"))); // NOI18N
        configuracionesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionesbtnActionPerformed(evt);
            }
        });
        panelAzul.add(configuracionesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 30));

        mancha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/Vector 1.png"))); // NOI18N
        mancha2.setText("jLabel1");
        panelAzul.add(mancha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 260));

        mancha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/Ellipse.png"))); // NOI18N
        mancha1.setText("jLabel1");
        panelAzul.add(mancha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        getContentPane().add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 720));

        Fondoblanco.setBackground(new java.awt.Color(255, 255, 255));
        Fondoblanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Funciones.setBackground(new java.awt.Color(255, 255, 255));
        Funciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenido.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Bienvenido.setForeground(new java.awt.Color(54, 159, 255));
        Bienvenido.setText("Bienvenido, Usuario!");
        Funciones.add(Bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        inicio.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        inicio.setText("INICIO");
        Funciones.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 30));

        OrdenPedidobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/Group 25.png"))); // NOI18N
        OrdenPedidobtn.setBorder(null);
        OrdenPedidobtn.setBorderPainted(false);
        OrdenPedidobtn.setContentAreaFilled(false);
        OrdenPedidobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenPedidobtnActionPerformed(evt);
            }
        });
        Funciones.add(OrdenPedidobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 180, 130));

        GastosBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/Group 28.png"))); // NOI18N
        GastosBtn1.setBorder(null);
        GastosBtn1.setContentAreaFilled(false);
        GastosBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GastosBtn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Funciones.add(GastosBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 180, 130));

        PQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/PQR.png"))); // NOI18N
        PQR.setBorder(null);
        PQR.setContentAreaFilled(false);
        PQR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PQR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PQRActionPerformed(evt);
            }
        });
        Funciones.add(PQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 190, 130));

        TINTURADOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DashBoard Usuario/TINTURADOS.png"))); // NOI18N
        TINTURADOS.setBorder(null);
        TINTURADOS.setContentAreaFilled(false);
        TINTURADOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TINTURADOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TINTURADOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TINTURADOSActionPerformed(evt);
            }
        });
        Funciones.add(TINTURADOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 180, 130));

        Fondoblanco.add(Funciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 720));

        getContentPane().add(Fondoblanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1060, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfiguracionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfiguracionbtnActionPerformed

    private void tutorialesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialesbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorialesbtnActionPerformed

    private void capacitacionesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacitacionesbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacitacionesbtnActionPerformed

    private void configuracionesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionesbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_configuracionesbtnActionPerformed

    private void IniciobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IniciobtnActionPerformed

    private void TINTURADOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TINTURADOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TINTURADOSActionPerformed

    private void PQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PQRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PQRActionPerformed

    private void OrdenPedidobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenPedidobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrdenPedidobtnActionPerformed

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
            java.util.logging.Logger.getLogger(UIUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIUSER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JButton Configuracionbtn;
    private javax.swing.JPanel Fondoblanco;
    private javax.swing.JPanel Funciones;
    private javax.swing.JButton GastosBtn1;
    private javax.swing.JButton Iniciobtn;
    private javax.swing.JButton OrdenPedidobtn;
    private javax.swing.JButton PQR;
    private javax.swing.JButton TINTURADOS;
    private javax.swing.JButton capacitacionesbtn;
    private javax.swing.JButton configuracionesbtn;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel mancha1;
    private javax.swing.JLabel mancha2;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JButton tutorialesbtn;
    // End of variables declaration//GEN-END:variables
}
