/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import funciones.sentenciasCuentas;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

/**
 *
 * @author SailorSakura
 */
public class Cuentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cuentas
     */
    public Cuentas() {
        initComponents();
        funciones.funcionesCuentas.setListar("");
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
        tablaCuentas = new rojerusan.RSTableMetro();
        botonAgregarCuenta = new rojerusan.RSButtonHover();
        botonModificarCuenta = new rojerusan.RSButtonHover();
        botonEliminarCuenta = new rojerusan.RSButtonHover();
        txtBuscarCuentas = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(748, 561));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("LISTADO DE CUENTAS");

        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Banco", "Denominacion", "Numero", "Tipo de cuenta", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuentas.setColorBackgoundHead(new java.awt.Color(240, 4, 7));
        tablaCuentas.setColorFilasForeground1(new java.awt.Color(240, 4, 7));
        tablaCuentas.setColorFilasForeground2(new java.awt.Color(242, 134, 130));
        tablaCuentas.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaCuentas.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaCuentas.setFuenteHead(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaCuentas.setName("tablaCuentas"); // NOI18N
        tablaCuentas.setSelectionBackground(new java.awt.Color(240, 198, 196));
        jScrollPane1.setViewportView(tablaCuentas);
        if (tablaCuentas.getColumnModel().getColumnCount() > 0) {
            tablaCuentas.getColumnModel().getColumn(0).setMinWidth(0);
            tablaCuentas.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        botonAgregarCuenta.setBackground(new java.awt.Color(11, 11, 11));
        botonAgregarCuenta.setText("Agregar Cuenta");
        botonAgregarCuenta.setColorHover(new java.awt.Color(240, 4, 7));
        botonAgregarCuenta.setMaximumSize(new java.awt.Dimension(91, 25));
        botonAgregarCuenta.setMinimumSize(new java.awt.Dimension(91, 25));
        botonAgregarCuenta.setName("botonAgregarCuenta"); // NOI18N
        botonAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCuentaActionPerformed(evt);
            }
        });

        botonModificarCuenta.setBackground(new java.awt.Color(11, 11, 11));
        botonModificarCuenta.setText("Modificar Cuenta");
        botonModificarCuenta.setColorHover(new java.awt.Color(240, 4, 7));
        botonModificarCuenta.setMaximumSize(new java.awt.Dimension(91, 25));
        botonModificarCuenta.setMinimumSize(new java.awt.Dimension(91, 25));
        botonModificarCuenta.setName("botonModificarCuenta"); // NOI18N
        botonModificarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarCuentaActionPerformed(evt);
            }
        });

        botonEliminarCuenta.setBackground(new java.awt.Color(11, 11, 11));
        botonEliminarCuenta.setText("Eliminar Cuenta");
        botonEliminarCuenta.setColorHover(new java.awt.Color(240, 4, 7));
        botonEliminarCuenta.setMaximumSize(new java.awt.Dimension(91, 25));
        botonEliminarCuenta.setMinimumSize(new java.awt.Dimension(91, 25));
        botonEliminarCuenta.setName("botonEliminarCuenta"); // NOI18N
        botonEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCuentaActionPerformed(evt);
            }
        });

        txtBuscarCuentas.setForeground(new java.awt.Color(11, 11, 11));
        txtBuscarCuentas.setBorderColor(new java.awt.Color(11, 11, 11));
        txtBuscarCuentas.setBotonColor(new java.awt.Color(240, 4, 7));
        txtBuscarCuentas.setName("txtBuscarCuentas"); // NOI18N
        txtBuscarCuentas.setPhColor(new java.awt.Color(0, 0, 0));
        txtBuscarCuentas.setPlaceholder("");
        txtBuscarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCuentasActionPerformed(evt);
            }
        });
        txtBuscarCuentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCuentasKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAgregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void botonAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCuentaActionPerformed
            AgregarCuenta b = new AgregarCuenta(new JFrame(), true);
            b.show();
    }//GEN-LAST:event_botonAgregarCuentaActionPerformed

    private void botonModificarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarCuentaActionPerformed
        int tabla = tablaCuentas.getSelectedRow();
        if (tabla >-1) {
            int fila = tablaCuentas.getSelectedRow();
            Frame f = JOptionPane.getFrameForComponent(this);
            ModificarCuenta dialog = new ModificarCuenta(f, true);
            dialog.comboBancoUpdate.setSelectedItem(tablaCuentas.getValueAt(fila, 1).toString());
            dialog.txtNombre.setText(tablaCuentas.getValueAt(fila, 2).toString());
            dialog.txtNumero.setText(tablaCuentas.getValueAt(fila, 3).toString());
            dialog.txtTipo.setText(tablaCuentas.getValueAt(fila, 4).toString());
            dialog.txtSaldo.setText(tablaCuentas.getValueAt(fila, 5).toString());
            dialog.txtIdCuenta.setText(tablaCuentas.getValueAt(fila, 0).toString());
            dialog.show();
        } else {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Seleccione una cuenta", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        }
        
    }//GEN-LAST:event_botonModificarCuentaActionPerformed
String hora = "";
String fecha= "";
    private void botonEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCuentaActionPerformed
            String tabla = "CUENTA";
            String evento = "DELETE";
            hora = Principal.lblhora.getHora();
            fecha = Principal.lblfecha.getFecha();
        int tabla2 = tablaCuentas.getSelectedRow();
        if (tabla2 >-1) {
        int fila = tablaCuentas.getSelectedRow();
        sentenciasCuentas s = new sentenciasCuentas();
        s.setId_cuenta(tablaCuentas.getValueAt(fila, 0).toString());
        if (JOptionPane.showConfirmDialog(this, "Desea eliminar registro?", "",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            if (funciones.funcionesCuentas.isDelete(s)){
                funciones.funcionesAuditoria.auditoria(fecha, hora, evento, tabla, login.funcionesLogin.idFuncionario);
                new rojerusan.RSNotifyFade("EXITO", "Se ha eliminado correctamente", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                funciones.funcionesCuentas.setListar("");
            }
        }
        } else {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Seleccione una cuenta", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        }
    }//GEN-LAST:event_botonEliminarCuentaActionPerformed

    private void txtBuscarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCuentasActionPerformed

    private void txtBuscarCuentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCuentasKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtBuscarCuentas);
        funciones.funcionesCuentas.setListar(txtBuscarCuentas.getText());
    }//GEN-LAST:event_txtBuscarCuentasKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover botonAgregarCuenta;
    private rojerusan.RSButtonHover botonEliminarCuenta;
    private rojerusan.RSButtonHover botonModificarCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static rojerusan.RSTableMetro tablaCuentas;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarCuentas;
    // End of variables declaration//GEN-END:variables
}
