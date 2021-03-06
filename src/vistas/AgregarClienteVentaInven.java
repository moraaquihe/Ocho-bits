/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import funciones.sentenciasClientes;
import rojerusan.RSNotifyAnimated;

/**
 *
 * @author SailorSakura
 */
public class AgregarClienteVentaInven extends javax.swing.JDialog {

    /**
     * Creates new form AgregarClienteVentaInven
     */
    public AgregarClienteVentaInven(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         rsutilities.RSUtilities.setCentrarVentana(this);
        funciones.funcionesClientes.cargarComboCiudadVentasInven();
        txtIdCliente.setText(funciones.funcionesClientes.extraerIDMaxCLIE());
        txtIdCliente.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JLabel();
        txtNombreCliente = new rojerusan.RSMetroTextFullPlaceHolder();
        txtRUCCI = new rojerusan.RSMetroTextFullPlaceHolder();
        comboCiudad = new rojerusan.RSComboMetro();
        txtCorreo = new rojerusan.RSMetroTextFullPlaceHolder();
        txtTelefono = new rojerusan.RSMetroTextFullPlaceHolder();
        txtDireccion = new rojerusan.RSMetroTextFullPlaceHolder();
        botonAgregarNuevoCliente = new rojerusan.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("NUEVO CLIENTE");

        jLabel3.setText("Nombre y Apellido /  Empresa:");

        jLabel4.setText("RUC o CI:");

        jLabel5.setText("Seleccione una ciudad:");

        jLabel6.setText("Correo Electronico:");

        jLabel7.setText("Telefono / Celular:");

        jLabel8.setText("Direccion:");

        txtIdCliente.setText("ID");
        txtIdCliente.setName("txtIdCliente"); // NOI18N

        txtNombreCliente.setForeground(new java.awt.Color(11, 11, 11));
        txtNombreCliente.setBorderColor(new java.awt.Color(11, 11, 11));
        txtNombreCliente.setBotonColor(new java.awt.Color(240, 4, 7));
        txtNombreCliente.setName("txtNombreCliente"); // NOI18N
        txtNombreCliente.setPhColor(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setPlaceholder("");
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
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

        comboCiudad.setColorArrow(new java.awt.Color(240, 4, 7));
        comboCiudad.setColorBorde(new java.awt.Color(11, 11, 11));
        comboCiudad.setColorFondo(new java.awt.Color(242, 134, 130));
        comboCiudad.setName("comboCiudad"); // NOI18N

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

        botonAgregarNuevoCliente.setBackground(new java.awt.Color(11, 11, 11));
        botonAgregarNuevoCliente.setText("Agregar");
        botonAgregarNuevoCliente.setColorHover(new java.awt.Color(240, 4, 7));
        botonAgregarNuevoCliente.setName("botonAgregarNuevoCliente"); // NOI18N
        botonAgregarNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel2)
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdCliente)
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregarNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtRUCCI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCliente))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtNombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtNombreCliente);
    }//GEN-LAST:event_txtNombreClienteKeyReleased

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        if (txtNombreCliente.getText().length() >=50) {
            evt.consume();
        } if(librerias.Validaciones.Letras(evt.getKeyChar()) && librerias.Validaciones.Espacio(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtRUCCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUCCIKeyTyped
        if (txtRUCCI.getText().length() >=20) {
            evt.consume();
        } if(librerias.Validaciones.ruc(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRUCCIKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        if (txtCorreo.getText().length() >=50) {
            evt.consume();
        } if(librerias.Validaciones.correo(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >=15) {
            evt.consume();
        } if(librerias.Validaciones.Numeros(evt.getKeyChar()) && librerias.Validaciones.Espacio(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtDireccion);
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >=50) {
            evt.consume();
        } if(librerias.Validaciones.ParaDireccion(evt.getKeyChar()) && librerias.Validaciones.Espacio(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void botonAgregarNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarNuevoClienteActionPerformed
        try {
            if(this.txtNombreCliente.getText().length() == 0 || txtCorreo.getText().length()==0 || txtDireccion.getText().length()==0 || txtRUCCI.getText().length()==0 || txtTelefono.getText().length()==0 || comboCiudad.getSelectedIndex()<=0){
                new rojerusan.RSNotifyAnimated("Error", "Complete todos los campos", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            } else {
                sentenciasClientes s = new sentenciasClientes();
                s.setN_cliente(this.txtNombreCliente.getText());
                s.setRuc_ci(this.txtRUCCI.getText());
                s.setTelefono(this.txtTelefono.getText());
                s.setCorreo(this.txtCorreo.getText());
                s.setDireccion(this.txtDireccion.getText());
                s.setFk_ciudad(this.comboCiudad.getSelectedIndex());
                s.setId_cliente(this.txtIdCliente.getText());

                if (funciones.funcionesClientes.isRegister(s)){
                    // setClean();
                    
                    funciones.funcionesClientes.ventasInvenClientes("");

                    new rojerusan.RSNotifyAnimated("Se ha guardado", "Los datos se han registrado", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

                    this.dispose();
                }
            }
        } catch (Exception ex) {
        }
        this.dispose();
    }//GEN-LAST:event_botonAgregarNuevoClienteActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarClienteVentaInven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarClienteVentaInven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarClienteVentaInven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarClienteVentaInven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarClienteVentaInven dialog = new AgregarClienteVentaInven(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonHover botonAgregarNuevoCliente;
    public static rojerusan.RSComboMetro comboCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSMetroTextFullPlaceHolder txtCorreo;
    private rojerusan.RSMetroTextFullPlaceHolder txtDireccion;
    private javax.swing.JLabel txtIdCliente;
    private rojerusan.RSMetroTextFullPlaceHolder txtNombreCliente;
    private rojerusan.RSMetroTextFullPlaceHolder txtRUCCI;
    private rojerusan.RSMetroTextFullPlaceHolder txtTelefono;
    // End of variables declaration//GEN-END:variables
}
