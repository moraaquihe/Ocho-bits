/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import funciones.sentenciasProveedores;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;
import rojerusan.RSNotifyFade;

/**
 *
 * @author SailorSakura
 */
public class Proveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
        funciones.funcionesProveedores.setListar("");
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
        botonEliminarProveedor = new rojerusan.RSButtonHover();
        txtBuscarProveedores = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new rojerusan.RSTableMetro();
        botonAgregarProveedor = new rojerusan.RSButtonHover();
        botonModificarProveedor = new rojerusan.RSButtonHover();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(748, 561));

        botonEliminarProveedor.setBackground(new java.awt.Color(11, 11, 11));
        botonEliminarProveedor.setText("Eliminar Proveedor");
        botonEliminarProveedor.setColorHover(new java.awt.Color(240, 4, 7));
        botonEliminarProveedor.setMaximumSize(new java.awt.Dimension(91, 25));
        botonEliminarProveedor.setMinimumSize(new java.awt.Dimension(91, 25));
        botonEliminarProveedor.setName("botonEliminarProveedor"); // NOI18N
        botonEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProveedorActionPerformed(evt);
            }
        });

        txtBuscarProveedores.setForeground(new java.awt.Color(11, 11, 11));
        txtBuscarProveedores.setBorderColor(new java.awt.Color(11, 11, 11));
        txtBuscarProveedores.setBotonColor(new java.awt.Color(240, 4, 7));
        txtBuscarProveedores.setName("txtBuscarProveedores"); // NOI18N
        txtBuscarProveedores.setPhColor(new java.awt.Color(0, 0, 0));
        txtBuscarProveedores.setPlaceholder("");
        txtBuscarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProveedoresActionPerformed(evt);
            }
        });
        txtBuscarProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProveedoresKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("LISTADO DE PROVEEDORES");

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proveedor", "RUC o CI", "Ciudad", "Correo Electronico", "Telefono / Celular", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProveedores.setColorBackgoundHead(new java.awt.Color(240, 4, 7));
        tablaProveedores.setColorFilasForeground1(new java.awt.Color(240, 4, 7));
        tablaProveedores.setColorFilasForeground2(new java.awt.Color(242, 134, 130));
        tablaProveedores.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaProveedores.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaProveedores.setFuenteHead(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaProveedores.setName("tablaProveedores"); // NOI18N
        tablaProveedores.setSelectionBackground(new java.awt.Color(240, 198, 196));
        jScrollPane1.setViewportView(tablaProveedores);
        if (tablaProveedores.getColumnModel().getColumnCount() > 0) {
            tablaProveedores.getColumnModel().getColumn(0).setMinWidth(0);
            tablaProveedores.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaProveedores.getColumnModel().getColumn(1).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(2).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(3).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(4).setResizable(false);
            tablaProveedores.getColumnModel().getColumn(6).setResizable(false);
        }

        botonAgregarProveedor.setBackground(new java.awt.Color(11, 11, 11));
        botonAgregarProveedor.setText("Agregar Proveedor");
        botonAgregarProveedor.setColorHover(new java.awt.Color(240, 4, 7));
        botonAgregarProveedor.setMaximumSize(new java.awt.Dimension(91, 25));
        botonAgregarProveedor.setMinimumSize(new java.awt.Dimension(91, 25));
        botonAgregarProveedor.setName("botonAgregarProveedor"); // NOI18N
        botonAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProveedorActionPerformed(evt);
            }
        });

        botonModificarProveedor.setBackground(new java.awt.Color(11, 11, 11));
        botonModificarProveedor.setText("Modificar Proveedor");
        botonModificarProveedor.setColorHover(new java.awt.Color(240, 4, 7));
        botonModificarProveedor.setMaximumSize(new java.awt.Dimension(91, 25));
        botonModificarProveedor.setMinimumSize(new java.awt.Dimension(91, 25));
        botonModificarProveedor.setName("botonModificarProveedor"); // NOI18N
        botonModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAgregarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProveedoresActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void botonAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProveedorActionPerformed
        AgregarProveedor b = new AgregarProveedor(new JFrame(), true);
        b.show();
    }//GEN-LAST:event_botonAgregarProveedorActionPerformed

    private void botonModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarProveedorActionPerformed
       int fila2 = tablaProveedores.getSelectedRow();
        if (fila2 > -1){
        int fila = tablaProveedores.getSelectedRow();
        Frame f = JOptionPane.getFrameForComponent(this);
        ModificarProveedor dialog = new ModificarProveedor(f, true);
        dialog.txtNombreProveedor.setText(tablaProveedores.getValueAt(fila, 1).toString());
        dialog.txtRUCCI.setText(tablaProveedores.getValueAt(fila, 2).toString());
        dialog.comboCiudadUpdate.setSelectedItem(tablaProveedores.getValueAt(fila, 3).toString());
        dialog.txtCorreo.setText(tablaProveedores.getValueAt(fila, 4).toString());
        dialog.txtTelefono.setText(tablaProveedores.getValueAt(fila, 5).toString());
        dialog.txtDireccion.setText(tablaProveedores.getValueAt(fila, 6).toString());
        dialog.txtIdProveedor.setText(tablaProveedores.getValueAt(fila, 0).toString());
        dialog.show();
        } else {
            new rojerusan.RSNotifyAnimated("ERROR", "Seleccione un proveedor", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);

        }
    }//GEN-LAST:event_botonModificarProveedorActionPerformed
String hora = "";
String fecha= "";
    private void botonEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProveedorActionPerformed
            String tabla = "PROVEEDOR";
            String evento = "DELETE";
            hora = Principal.lblhora.getHora();
            fecha = Principal.lblfecha.getFecha();
        int fila3 = tablaProveedores.getSelectedRow();
        if (fila3 > -1){
        int fila = tablaProveedores.getSelectedRow();
        sentenciasProveedores s = new sentenciasProveedores();
        s.setId_proveedor(tablaProveedores.getValueAt(fila, 0).toString());
        if (JOptionPane.showConfirmDialog(this, "Desea eliminar registro?", "",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            if (funciones.funcionesProveedores.isDelete(s)){
                funciones.funcionesAuditoria.auditoria(fecha, hora, evento, tabla, login.funcionesLogin.idFuncionario);
                funciones.funcionesProveedores.setListar("");
                funciones.funcionesProveedores.extraerIDMaxPROVEE();
                new rojerusan.RSNotifyFade("EXITO", "Se la eliminado el proveedor", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
            }
        }
        } else {
            new rojerusan.RSNotifyAnimated("ERROR", "Seleccione un proveedor", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);

        }
    }//GEN-LAST:event_botonEliminarProveedorActionPerformed

    private void txtBuscarProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProveedoresKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtBuscarProveedores);
        funciones.funcionesProveedores.setListar(txtBuscarProveedores.getText());
    }//GEN-LAST:event_txtBuscarProveedoresKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover botonAgregarProveedor;
    private rojerusan.RSButtonHover botonEliminarProveedor;
    private rojerusan.RSButtonHover botonModificarProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static rojerusan.RSTableMetro tablaProveedores;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarProveedores;
    // End of variables declaration//GEN-END:variables
}
