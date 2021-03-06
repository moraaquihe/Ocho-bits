/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import funciones.sentenciasInventario;
import rojerusan.RSNotifyAnimated;

/**
 *
 * @author SailorSakura
 */
public class ModificarInventario extends javax.swing.JDialog {

    /**
     * Creates new form ModificarInventario
     */
    public ModificarInventario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        funciones.funcionesInventario.cargarComboImpuestoUpdate();
        funciones.funcionesInventario.cargarComboProveedorUpdate();
        rsutilities.RSUtilities.setCentrarVentana(this);
        
        idProducto.setVisible(false);
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
        txtNombreProducto = new rojerusan.RSMetroTextFullPlaceHolder();
        txtCantidad = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPrecio = new rojerusan.RSMetroTextFullPlaceHolder();
        txtDescripcion = new rojerusan.RSMetroTextFullPlaceHolder();
        comboImpuestoUpdate = new rojerusan.RSComboMetro();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonModificarInven = new rojerusan.RSButtonHover();
        idProducto = new javax.swing.JLabel();
        comboProveedorUpdate = new rojerusan.RSComboMetro();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("MODIFICAR PRODUCTO");

        txtNombreProducto.setForeground(new java.awt.Color(11, 11, 11));
        txtNombreProducto.setBorderColor(new java.awt.Color(11, 11, 11));
        txtNombreProducto.setBotonColor(new java.awt.Color(240, 4, 7));
        txtNombreProducto.setName("txtNombreProducto"); // NOI18N
        txtNombreProducto.setPhColor(new java.awt.Color(0, 0, 0));
        txtNombreProducto.setPlaceholder("");
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });

        txtCantidad.setForeground(new java.awt.Color(11, 11, 11));
        txtCantidad.setBorderColor(new java.awt.Color(11, 11, 11));
        txtCantidad.setBotonColor(new java.awt.Color(240, 4, 7));
        txtCantidad.setName("txtCantidad"); // NOI18N
        txtCantidad.setPhColor(new java.awt.Color(0, 0, 0));
        txtCantidad.setPlaceholder("");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        txtPrecio.setForeground(new java.awt.Color(11, 11, 11));
        txtPrecio.setBorderColor(new java.awt.Color(11, 11, 11));
        txtPrecio.setBotonColor(new java.awt.Color(240, 4, 7));
        txtPrecio.setName("txtPrecio"); // NOI18N
        txtPrecio.setPhColor(new java.awt.Color(0, 0, 0));
        txtPrecio.setPlaceholder("");
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtDescripcion.setForeground(new java.awt.Color(11, 11, 11));
        txtDescripcion.setBorderColor(new java.awt.Color(11, 11, 11));
        txtDescripcion.setBotonColor(new java.awt.Color(240, 4, 7));
        txtDescripcion.setName("txtDescripcion"); // NOI18N
        txtDescripcion.setPhColor(new java.awt.Color(0, 0, 0));
        txtDescripcion.setPlaceholder("");
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        comboImpuestoUpdate.setColorArrow(new java.awt.Color(240, 4, 7));
        comboImpuestoUpdate.setColorBorde(new java.awt.Color(11, 11, 11));
        comboImpuestoUpdate.setColorFondo(new java.awt.Color(242, 134, 130));
        comboImpuestoUpdate.setName("comboImpuestoUpdate"); // NOI18N

        jLabel3.setText("Nombre del producto:");

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Descripcion:");

        jLabel6.setText("Tipo de impuesto:");

        jLabel7.setText("Precio:");

        botonModificarInven.setBackground(new java.awt.Color(11, 11, 11));
        botonModificarInven.setText("Actualizar");
        botonModificarInven.setColorHover(new java.awt.Color(240, 4, 7));
        botonModificarInven.setName("botonModificarInven"); // NOI18N
        botonModificarInven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarInvenActionPerformed(evt);
            }
        });

        idProducto.setText("ID");
        idProducto.setName("idProducto"); // NOI18N

        comboProveedorUpdate.setColorArrow(new java.awt.Color(240, 4, 7));
        comboProveedorUpdate.setColorBorde(new java.awt.Color(11, 11, 11));
        comboProveedorUpdate.setColorFondo(new java.awt.Color(242, 134, 130));
        comboProveedorUpdate.setName("comboImpuesto"); // NOI18N

        jLabel8.setText("Proveedor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(comboImpuestoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(idProducto)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarInven, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(comboImpuestoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(90, 90, 90)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(comboProveedorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarInven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProducto))
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed
String hora = "";
String fecha= "";
    private void botonModificarInvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarInvenActionPerformed
            String tabla = "INVENTARIO";
            String evento = "UPDATE";
            hora = Principal.lblhora.getHora();
            fecha = Principal.lblfecha.getFecha();
        try {
            if(this.txtNombreProducto.getText().length() == 0 || txtPrecio.getText().length()==0 || txtCantidad.getText().length()==0 || txtDescripcion.getText().length()==0 || comboImpuestoUpdate.getSelectedIndex() <= 0 || comboProveedorUpdate.getSelectedIndex() <= 0){
            new rojerusan.RSNotifyAnimated("Error", "Complete todos los campos", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        } else {   
            sentenciasInventario s = new sentenciasInventario();
            s.setN_insumo(this.txtNombreProducto.getText());
            s.setCantidad(Integer.parseInt(txtCantidad.getText()));
            s.setDescripcion(this.txtDescripcion.getText());
            s.setFk_iva(this.comboImpuestoUpdate.getSelectedIndex());
            s.setPrecio(Integer.parseInt(txtPrecio.getText()));
            s.setId_inventario(this.idProducto.getText());
            if (funciones.funcionesInventario.isUpdate(s)){
                funciones.funcionesAuditoria.auditoria(fecha, hora, evento, tabla, login.funcionesLogin.idFuncionario);
              funciones.funcionesInventario.setListar("");
              new rojerusan.RSNotifyAnimated("Se ha guardado", "Los datos se han registrado", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

                this.dispose();
            }
        }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_botonModificarInvenActionPerformed

    private void txtNombreProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtNombreProducto);
    }//GEN-LAST:event_txtNombreProductoKeyReleased

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        if (txtNombreProducto.getText().length() >=100) {
            evt.consume();
        } if(librerias.Validaciones.Letras(evt.getKeyChar()) && librerias.Validaciones.Espacio(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtDescripcion);
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        if (txtPrecio.getText().length() >=20) {
            evt.consume();
        } if(librerias.Validaciones.CedulaNumero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (txtDescripcion.getText().length() >=100) {
            evt.consume();
        } if(librerias.Validaciones.Letras(evt.getKeyChar()) && librerias.Validaciones.Espacio(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
       if (txtCantidad.getText().length() >=20) {
            evt.consume();
        } if(librerias.Validaciones.CedulaNumero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

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
            java.util.logging.Logger.getLogger(ModificarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarInventario dialog = new ModificarInventario(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonHover botonModificarInven;
    public static rojerusan.RSComboMetro comboImpuestoUpdate;
    public static rojerusan.RSComboMetro comboProveedorUpdate;
    public static javax.swing.JLabel idProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static rojerusan.RSMetroTextFullPlaceHolder txtCantidad;
    public static rojerusan.RSMetroTextFullPlaceHolder txtDescripcion;
    public static rojerusan.RSMetroTextFullPlaceHolder txtNombreProducto;
    public static rojerusan.RSMetroTextFullPlaceHolder txtPrecio;
    // End of variables declaration//GEN-END:variables
}
