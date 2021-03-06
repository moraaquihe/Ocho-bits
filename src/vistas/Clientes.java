/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import funciones.sentenciasClientes;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;


/**
 *
 * @author SailorSakura
 */
public class Clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        funciones.funcionesClientes.setListar("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new rojerusan.RSTableMetro();
        botonAgregarCliente = new rojerusan.RSButtonHover();
        botonModificarCliente = new rojerusan.RSButtonHover();
        botonEliminarCliente = new rojerusan.RSButtonHover();
        txtBuscarClientes = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("LISTADO DE CLIENTES");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre y Apellido / Empresa", "RUC o CI", "Ciudad", "Correo Electronico", "Telefono / Celular", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setColorBackgoundHead(new java.awt.Color(240, 4, 7));
        tablaClientes.setColorFilasForeground1(new java.awt.Color(240, 4, 7));
        tablaClientes.setColorFilasForeground2(new java.awt.Color(242, 134, 130));
        tablaClientes.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaClientes.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaClientes.setFuenteHead(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaClientes.setName("tablaClientes"); // NOI18N
        tablaClientes.setSelectionBackground(new java.awt.Color(240, 198, 196));
        jScrollPane1.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setMinWidth(0);
            tablaClientes.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        botonAgregarCliente.setBackground(new java.awt.Color(11, 11, 11));
        botonAgregarCliente.setText("Agregar Cliente");
        botonAgregarCliente.setColorHover(new java.awt.Color(240, 4, 7));
        botonAgregarCliente.setMaximumSize(new java.awt.Dimension(91, 25));
        botonAgregarCliente.setMinimumSize(new java.awt.Dimension(91, 25));
        botonAgregarCliente.setName("botonAgregarCliente"); // NOI18N
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });

        botonModificarCliente.setBackground(new java.awt.Color(11, 11, 11));
        botonModificarCliente.setText("Modificar Cliente");
        botonModificarCliente.setColorHover(new java.awt.Color(240, 4, 7));
        botonModificarCliente.setMaximumSize(new java.awt.Dimension(91, 25));
        botonModificarCliente.setMinimumSize(new java.awt.Dimension(91, 25));
        botonModificarCliente.setName("botonModificarCliente"); // NOI18N
        botonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarClienteActionPerformed(evt);
            }
        });

        botonEliminarCliente.setBackground(new java.awt.Color(11, 11, 11));
        botonEliminarCliente.setText("Eliminar Cliente");
        botonEliminarCliente.setColorHover(new java.awt.Color(240, 4, 7));
        botonEliminarCliente.setMaximumSize(new java.awt.Dimension(91, 25));
        botonEliminarCliente.setMinimumSize(new java.awt.Dimension(91, 25));
        botonEliminarCliente.setName("botonEliminarCliente"); // NOI18N
        botonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarClienteActionPerformed(evt);
            }
        });

        txtBuscarClientes.setForeground(new java.awt.Color(11, 11, 11));
        txtBuscarClientes.setBorderColor(new java.awt.Color(11, 11, 11));
        txtBuscarClientes.setBotonColor(new java.awt.Color(240, 4, 7));
        txtBuscarClientes.setName("txtBuscarClientes"); // NOI18N
        txtBuscarClientes.setPhColor(new java.awt.Color(0, 0, 0));
        txtBuscarClientes.setPlaceholder("");
        txtBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClientesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(166, 166, 166)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClientesActionPerformed

    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed
        AgregarCliente b = new AgregarCliente(new JFrame(), true);
        b.show();
    }//GEN-LAST:event_botonAgregarClienteActionPerformed

    private void botonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarClienteActionPerformed
            
        int selec2 = tablaClientes.getSelectedRow();
        if (selec2 >-1) {
        int fila = tablaClientes.getSelectedRow();
        Frame f = JOptionPane.getFrameForComponent(this);
        ModificarCliente dialog = new ModificarCliente(f, true);
        dialog.txtNombreCliente.setText(tablaClientes.getValueAt(fila, 1).toString());
        dialog.txtRUCCI.setText(tablaClientes.getValueAt(fila, 2).toString());
        dialog.comboCiudadUpdate.setSelectedItem(tablaClientes.getValueAt(fila, 3).toString());
        dialog.txtCorreo.setText(tablaClientes.getValueAt(fila, 4).toString());
        dialog.txtTelefono.setText(tablaClientes.getValueAt(fila, 5).toString());
        dialog.txtDireccion.setText(tablaClientes.getValueAt(fila, 6).toString());
        dialog.txtIdCliente.setText(tablaClientes.getValueAt(fila, 0).toString());
        dialog.show();
        } else {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Seleccione un cliente", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        }
    }//GEN-LAST:event_botonModificarClienteActionPerformed
String hora = "";
String fecha= "";
    private void botonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarClienteActionPerformed
            String tabla = "CLIENTE";
            String evento = "DELETE";
            hora = Principal.lblhora.getHora();
            fecha = Principal.lblfecha.getFecha();
        int selec3 = tablaClientes.getSelectedRow();
        if (selec3 >-1) {
        int fila = tablaClientes.getSelectedRow();
        sentenciasClientes s = new sentenciasClientes();
        s.setId_cliente(tablaClientes.getValueAt(fila, 0).toString());
        if (JOptionPane.showConfirmDialog(this, "Desea eliminar registro?", "",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            if (funciones.funcionesClientes.isDelete(s)){
                funciones.funcionesAuditoria.auditoria(fecha, hora, evento, tabla, login.funcionesLogin.idFuncionario);
                funciones.funcionesClientes.extraerIDMaxCLIE();
                funciones.funcionesClientes.setListar("");
            }
        }
        } else {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Seleccione una ciudad", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        }
    }//GEN-LAST:event_botonEliminarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover botonAgregarCliente;
    private rojerusan.RSButtonHover botonEliminarCliente;
    private rojerusan.RSButtonHover botonModificarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static rojerusan.RSTableMetro tablaClientes;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarClientes;
    // End of variables declaration//GEN-END:variables
}
