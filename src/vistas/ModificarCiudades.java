/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import funciones.funcionesCiudades;
import funciones.sentenciasCiudades;
import librerias.Validaciones;
import rojerusan.RSNotifyFade;

/**
 *
 * @author SailorSakura
 */
public class ModificarCiudades extends javax.swing.JDialog {

    /**
     * Creates new form ModificarCiudades
     */
    public ModificarCiudades(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        funciones.funcionesCiudades.cargarComboDepartamentoUpdate();
        rsutilities.RSUtilities.setCentrarVentana(this);
        txtid.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        txtModificarCiudad = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboDepartamentoUpdate = new rojerusan.RSComboMetro();
        txtid = new javax.swing.JLabel();
        botonModificarCiudad = new rojerusan.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MODIFICAR CIUDAD");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        txtModificarCiudad.setForeground(new java.awt.Color(11, 11, 11));
        txtModificarCiudad.setBorderColor(new java.awt.Color(11, 11, 11));
        txtModificarCiudad.setBotonColor(new java.awt.Color(240, 4, 7));
        txtModificarCiudad.setName("txtModificarCiudad"); // NOI18N
        txtModificarCiudad.setPhColor(new java.awt.Color(0, 0, 0));
        txtModificarCiudad.setPlaceholder("");
        txtModificarCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModificarCiudadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModificarCiudadKeyTyped(evt);
            }
        });

        jLabel3.setText("Ciudad:");

        jLabel4.setText("Departamento:");

        comboDepartamentoUpdate.setColorArrow(new java.awt.Color(240, 4, 7));
        comboDepartamentoUpdate.setColorBorde(new java.awt.Color(11, 11, 11));
        comboDepartamentoUpdate.setColorFondo(new java.awt.Color(242, 134, 130));
        comboDepartamentoUpdate.setName("comboDepartamentoUpdate"); // NOI18N

        txtid.setText("ID");
        txtid.setName("txtid"); // NOI18N

        botonModificarCiudad.setBackground(new java.awt.Color(11, 11, 11));
        botonModificarCiudad.setText("Actualizar");
        botonModificarCiudad.setColorHover(new java.awt.Color(240, 4, 7));
        botonModificarCiudad.setMaximumSize(new java.awt.Dimension(91, 25));
        botonModificarCiudad.setMinimumSize(new java.awt.Dimension(91, 25));
        botonModificarCiudad.setName("botonModificarCiudad"); // NOI18N
        botonModificarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarCiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtModificarCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboDepartamentoUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtid)
                        .addGap(26, 26, 26)
                        .addComponent(botonModificarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtModificarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboDepartamentoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
String hora = "";
String fecha= "";
    private void botonModificarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarCiudadActionPerformed
            String tabla = "CIUDAD";
            String evento = "UPDATE";
            hora = Principal.lblhora.getHora();
            fecha = Principal.lblfecha.getFecha();
        if(this.txtModificarCiudad.getText().length() == 0 || comboDepartamentoUpdate.getSelectedIndex() <=0){
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Ingrese los datos", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        } else {
            sentenciasCiudades s = new sentenciasCiudades();
            s.setN_ciudad(this.txtModificarCiudad.getText());
            s.setFk_departamento(this.comboDepartamentoUpdate.getSelectedIndex());
            s.setId_ciudad(this.txtid.getText());

            if (funcionesCiudades.isUpdate(s)){
                new rojerusan.RSNotifyFade("EXITO", "Se ha registrado la ciudad", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                funcionesCiudades.setListar("");
                funciones.funcionesAuditoria.auditoria(fecha, hora, evento, tabla, login.funcionesLogin.idFuncionario);
                this.dispose();
            }
        }
    }//GEN-LAST:event_botonModificarCiudadActionPerformed

    private void txtModificarCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarCiudadKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtModificarCiudad);
    }//GEN-LAST:event_txtModificarCiudadKeyReleased

    private void txtModificarCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarCiudadKeyTyped
        if (txtModificarCiudad.getText().length()>=50){
            evt.consume();
        } 
        if (Validaciones.Letras(evt.getKeyChar()) && (Validaciones.Espacio(evt.getKeyChar()))){
            evt.consume();
        }
    }//GEN-LAST:event_txtModificarCiudadKeyTyped

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
            java.util.logging.Logger.getLogger(ModificarCiudades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCiudades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCiudades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCiudades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarCiudades dialog = new ModificarCiudades(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonHover botonModificarCiudad;
    public static rojerusan.RSComboMetro comboDepartamentoUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtModificarCiudad;
    public static javax.swing.JLabel txtid;
    // End of variables declaration//GEN-END:variables
}
