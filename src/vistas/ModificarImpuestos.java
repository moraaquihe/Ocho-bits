/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import funciones.sentenciasImpuestos;
import rojerusan.RSNotifyFade;

/**
 *
 * @author SailorSakura
 */
public class ModificarImpuestos extends javax.swing.JDialog {

    /**
     * Creates new form ModificarImpuestos
     */
    public ModificarImpuestos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtid.setVisible(false);
        rsutilities.RSUtilities.setCentrarVentana(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonModificarImpuesto = new rojerusan.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        txtModificarImpuesto = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MODIFICAR IMPUESTO");

        txtid.setText("ID");
        txtid.setName("txtid"); // NOI18N

        jLabel3.setText("Impuesto:");

        botonModificarImpuesto.setBackground(new java.awt.Color(11, 11, 11));
        botonModificarImpuesto.setText("Actualizar");
        botonModificarImpuesto.setColorHover(new java.awt.Color(240, 4, 7));
        botonModificarImpuesto.setName("botonModificarImpuesto"); // NOI18N
        botonModificarImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarImpuestoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        txtModificarImpuesto.setForeground(new java.awt.Color(11, 11, 11));
        txtModificarImpuesto.setBorderColor(new java.awt.Color(11, 11, 11));
        txtModificarImpuesto.setBotonColor(new java.awt.Color(240, 4, 7));
        txtModificarImpuesto.setPhColor(new java.awt.Color(0, 0, 0));
        txtModificarImpuesto.setPlaceholder("");
        txtModificarImpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModificarImpuestoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModificarImpuestoKeyTyped(evt);
            }
        });

        jLabel4.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtModificarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtid)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModificarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String hora = "";
String fecha= "";
    private void botonModificarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarImpuestoActionPerformed
            String tabla = "IMPUESTO";
            String evento = "UPDATE";
            hora = Principal.lblhora.getHora();
            fecha = Principal.lblfecha.getFecha();
        if(this.txtModificarImpuesto.getText().length() == 0){
           new rojerusan.RSNotifyFade("ADVERTENCIA", "Ingrese el impuesto", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        } else {
            sentenciasImpuestos s = new sentenciasImpuestos();
            s.setId_iva(this.txtid.getText());
            s.setTipo(this.txtModificarImpuesto.getText());

            if (funciones.funcionesImpuestos.isUpdate(s)){
                new rojerusan.RSNotifyFade("EXITO", "Se ha actualizado", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                funciones.funcionesImpuestos.setListar("");
                funciones.funcionesImpuestos.extraerIDMaxIMP();
                funciones.funcionesAuditoria.auditoria(fecha, hora, evento, tabla, login.funcionesLogin.idFuncionario);
                this.dispose();
            }
        }
    }//GEN-LAST:event_botonModificarImpuestoActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtModificarImpuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarImpuestoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarImpuestoKeyReleased

    private void txtModificarImpuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarImpuestoKeyTyped
        if (txtModificarImpuesto.getText().length() >=15) {
            evt.consume();
        } if(librerias.Validaciones.Numeros(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModificarImpuestoKeyTyped

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
            java.util.logging.Logger.getLogger(ModificarImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarImpuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarImpuestos dialog = new ModificarImpuestos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover botonModificarImpuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtModificarImpuesto;
    public static javax.swing.JLabel txtid;
    // End of variables declaration//GEN-END:variables
}