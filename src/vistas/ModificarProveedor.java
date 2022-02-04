/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import funciones.sentenciasProveedores;
import rojerusan.RSNotifyAnimated;

/**
 *
 * @author SailorSakura
 */
public class ModificarProveedor extends javax.swing.JDialog {

    /**
     * Creates new form ModificarProveedor
     */
    public ModificarProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        funciones.funcionesProveedores.cargarComboCiudadUpdate();
        rsutilities.RSUtilities.setCentrarVentana(this);
        txtIdProveedor.setVisible(false);
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
        botonActualizarProveedor = new rojerusan.RSButtonHover();
        txtRUCCI = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JLabel();
        comboCiudadUpdate = new rojerusan.RSComboMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new rojerusan.RSMetroTextFullPlaceHolder();
        txtTelefono = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreProveedor = new rojerusan.RSMetroTextFullPlaceHolder();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonActualizarProveedor.setBackground(new java.awt.Color(11, 11, 11));
        botonActualizarProveedor.setText("Actualizar");
        botonActualizarProveedor.setColorHover(new java.awt.Color(240, 4, 7));
        botonActualizarProveedor.setName("botonActualizarProveedor"); // NOI18N
        botonActualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarProveedorActionPerformed(evt);
            }
        });

        txtRUCCI.setForeground(new java.awt.Color(11, 11, 11));
        txtRUCCI.setBorderColor(new java.awt.Color(11, 11, 11));
        txtRUCCI.setBotonColor(new java.awt.Color(240, 4, 7));
        txtRUCCI.setName("txtRUCCI"); // NOI18N
        txtRUCCI.setPhColor(new java.awt.Color(0, 0, 0));
        txtRUCCI.setPlaceholder("");
        txtRUCCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRUCCIKeyTyped(evt);
            }
        });

        jLabel8.setText("Direccion:");

        jLabel3.setText("Nombre y Apellido /  Empresa:");

        jLabel4.setText("RUC o CI:");

        txtIdProveedor.setText("ID");
        txtIdProveedor.setName("txtIdProveedor"); // NOI18N

        comboCiudadUpdate.setColorArrow(new java.awt.Color(240, 4, 7));
        comboCiudadUpdate.setColorBorde(new java.awt.Color(11, 11, 11));
        comboCiudadUpdate.setColorFondo(new java.awt.Color(242, 134, 130));
        comboCiudadUpdate.setName("comboCiudadUpdate"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel5.setText("Seleccione una ciudad:");

        txtCorreo.setForeground(new java.awt.Color(11, 11, 11));
        txtCorreo.setBorderColor(new java.awt.Color(11, 11, 11));
        txtCorreo.setBotonColor(new java.awt.Color(240, 4, 7));
        txtCorreo.setName("txtCorreo"); // NOI18N
        txtCorreo.setPhColor(new java.awt.Color(0, 0, 0));
        txtCorreo.setPlaceholder("");
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        txtTelefono.setForeground(new java.awt.Color(11, 11, 11));
        txtTelefono.setBorderColor(new java.awt.Color(11, 11, 11));
        txtTelefono.setBotonColor(new java.awt.Color(240, 4, 7));
        txtTelefono.setName("txtTelefono"); // NOI18N
        txtTelefono.setPhColor(new java.awt.Color(0, 0, 0));
        txtTelefono.setPlaceholder("");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel6.setText("Correo Electronico:");

        txtDireccion.setForeground(new java.awt.Color(11, 11, 11));
        txtDireccion.setBorderColor(new java.awt.Color(11, 11, 11));
        txtDireccion.setBotonColor(new java.awt.Color(240, 4, 7));
        txtDireccion.setName("txtDireccion"); // NOI18N
        txtDireccion.setPhColor(new java.awt.Color(0, 0, 0));
        txtDireccion.setPlaceholder("");
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel7.setText("Telefono / Celular:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("MODIFICAR DATOS DEL PROVEEDOR");

        txtNombreProveedor.setForeground(new java.awt.Color(11, 11, 11));
        txtNombreProveedor.setBorderColor(new java.awt.Color(11, 11, 11));
        txtNombreProveedor.setBotonColor(new java.awt.Color(240, 4, 7));
        txtNombreProveedor.setName("txtNombreProveedor"); // NOI18N
        txtNombreProveedor.setPhColor(new java.awt.Color(0, 0, 0));
        txtNombreProveedor.setPlaceholder("");
        txtNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRUCCI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCiudadUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdProveedor)
                        .addGap(18, 18, 18)
                        .addComponent(botonActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRUCCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCiudadUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProveedor))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked
String hora = "";
String fecha= "";
    private void botonActualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarProveedorActionPerformed
            String tabla = "PROVEEDOR";
            String evento = "UPDATE";
            hora = Principal.lblhora.getHora();
            fecha = Principal.lblfecha.getFecha();
        try {
            if(this.txtNombreProveedor.getText().length() == 0 || txtCorreo.getText().length()==0 || txtDireccion.getText().length() ==0 || txtRUCCI.getText().length()==0 || txtTelefono.getText().length()==0 || comboCiudadUpdate.getSelectedIndex() <=0){
            new rojerusan.RSNotifyAnimated("Error", "Complete todos los campos", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        } else {
                sentenciasProveedores s = new sentenciasProveedores();
            s.setN_proveedor(this.txtNombreProveedor.getText());
            s.setRuc_ci(this.txtRUCCI.getText());
            s.setTelefono(this.txtTelefono.getText());
            s.setCorreo(this.txtCorreo.getText());
            s.setDireccion(this.txtDireccion.getText());
            s.setFk_ciudad(this.comboCiudadUpdate.getSelectedIndex());
            s.setId_proveedor(this.txtIdProveedor.getText());

            if (funciones.funcionesProveedores.isUpdate(s)){
               funciones.funcionesAuditoria.auditoria(fecha, hora, evento, tabla, login.funcionesLogin.idFuncionario);
               funciones.funcionesProveedores.setListar("");
              new rojerusan.RSNotifyAnimated("Se ha guardado", "Los datos se han registrado", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

                this.dispose();
            }
        }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_botonActualizarProveedorActionPerformed

    private void txtNombreProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtNombreProveedor);
    }//GEN-LAST:event_txtNombreProveedorKeyReleased

    private void txtNombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyTyped
        if (txtNombreProveedor.getText().length() >=50) {
            evt.consume();
        } if(librerias.Validaciones.Letras(evt.getKeyChar()) && librerias.Validaciones.Espacio(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreProveedorKeyTyped

    private void txtRUCCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUCCIKeyTyped
        if (txtRUCCI.getText().length() >=20) {
            evt.consume();
        } if(librerias.Validaciones.ruc(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRUCCIKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >=15) {
            evt.consume();
        } if(librerias.Validaciones.Numeros(evt.getKeyChar()) && librerias.Validaciones.Espacio(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        if (txtCorreo.getText().length() >=50) {
            evt.consume();
        } if(librerias.Validaciones.correo(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >=100) {
            evt.consume();
        } if(librerias.Validaciones.ParaDireccion(evt.getKeyChar()) && librerias.Validaciones.Espacio(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtDireccion);
    }//GEN-LAST:event_txtDireccionKeyReleased

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
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarProveedor dialog = new ModificarProveedor(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonHover botonActualizarProveedor;
    public static rojerusan.RSComboMetro comboCiudadUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCorreo;
    public static rojerusan.RSMetroTextFullPlaceHolder txtDireccion;
    public static javax.swing.JLabel txtIdProveedor;
    public static rojerusan.RSMetroTextFullPlaceHolder txtNombreProveedor;
    public static rojerusan.RSMetroTextFullPlaceHolder txtRUCCI;
    public static rojerusan.RSMetroTextFullPlaceHolder txtTelefono;
    // End of variables declaration//GEN-END:variables
}
