/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Claudia
 */
public class Inicio extends javax.swing.JPanel {

    /**
     * Creates new form inico
     */
    public Inicio() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 0));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("jLblClientes");
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Instructores");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("jLblInstructores");
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clases");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));
        jLabel3.getAccessibleContext().setAccessibleName("jLblClases");

        jTextField1.setName("jTxtClientes"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 170, -1));
        jTextField1.getAccessibleContext().setAccessibleName("jTxtClientes");

        jTextField2.setName("jTxtInstructores"); // NOI18N
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 170, -1));
        jTextField2.getAccessibleContext().setAccessibleName("jTxtInstructores");

        jTextField3.setName("jTxtClases"); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 170, -1));
        jTextField3.getAccessibleContext().setAccessibleName("jTxtClases");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/images/Imagen1.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(640, 480));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
