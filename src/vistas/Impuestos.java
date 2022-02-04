/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import conexion.Conexion;
import funciones.sentenciasImpuestos;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

/**
 *
 * @author SailorSakura
 */
public class Impuestos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Impuestos
     */
    public Impuestos() {
        initComponents();
        funciones.funcionesImpuestos.setListar("");
        this.idImpuesto.setText(funciones.funcionesImpuestos.extraerIDMaxIMP());
        idImpuesto.setVisible(false);
    }
        Conexion conexion = new Conexion();
    Connection conexionActual = conexion.conectar();
    PreparedStatement ps;
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaImpuestos = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarImpuesto = new rojerusan.RSMetroTextFullPlaceHolder();
        txtAgregarImpuesto = new rojerusan.RSMetroTextFullPlaceHolder();
        botonAgregarImpuesto = new rojerusan.RSButtonHover();
        botonModificarImpuesto = new rojerusan.RSButtonHover();
        botonEliminarImpuesto = new rojerusan.RSButtonHover();
        idImpuesto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(748, 561));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("IMPUESTOS");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        tablaImpuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo de Impuesto (%)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaImpuestos.setColorBackgoundHead(new java.awt.Color(240, 4, 7));
        tablaImpuestos.setColorFilasForeground1(new java.awt.Color(240, 4, 7));
        tablaImpuestos.setColorFilasForeground2(new java.awt.Color(242, 134, 130));
        tablaImpuestos.setName("tablaImpuestos"); // NOI18N
        tablaImpuestos.setSelectionBackground(new java.awt.Color(240, 198, 196));
        jScrollPane1.setViewportView(tablaImpuestos);
        if (tablaImpuestos.getColumnModel().getColumnCount() > 0) {
            tablaImpuestos.getColumnModel().getColumn(0).setMinWidth(0);
            tablaImpuestos.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaImpuestos.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Buscar:");

        txtBuscarImpuesto.setForeground(new java.awt.Color(11, 11, 11));
        txtBuscarImpuesto.setBorderColor(new java.awt.Color(11, 11, 11));
        txtBuscarImpuesto.setBotonColor(new java.awt.Color(240, 4, 7));
        txtBuscarImpuesto.setName("txtBuscarImpuesto"); // NOI18N
        txtBuscarImpuesto.setPhColor(new java.awt.Color(0, 0, 0));
        txtBuscarImpuesto.setPlaceholder("");
        txtBuscarImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarImpuestoActionPerformed(evt);
            }
        });
        txtBuscarImpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarImpuestoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarImpuestoKeyTyped(evt);
            }
        });

        txtAgregarImpuesto.setForeground(new java.awt.Color(11, 11, 11));
        txtAgregarImpuesto.setBorderColor(new java.awt.Color(11, 11, 11));
        txtAgregarImpuesto.setBotonColor(new java.awt.Color(240, 4, 7));
        txtAgregarImpuesto.setName("txtAgregarImpuesto"); // NOI18N
        txtAgregarImpuesto.setPhColor(new java.awt.Color(0, 0, 0));
        txtAgregarImpuesto.setPlaceholder("");
        txtAgregarImpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgregarImpuestoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgregarImpuestoKeyTyped(evt);
            }
        });

        botonAgregarImpuesto.setBackground(new java.awt.Color(11, 11, 11));
        botonAgregarImpuesto.setText("Agregar Impuesto");
        botonAgregarImpuesto.setColorHover(new java.awt.Color(240, 4, 7));
        botonAgregarImpuesto.setMaximumSize(new java.awt.Dimension(91, 25));
        botonAgregarImpuesto.setMinimumSize(new java.awt.Dimension(91, 25));
        botonAgregarImpuesto.setName("botonAgregarImpuesto"); // NOI18N
        botonAgregarImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarImpuestoActionPerformed(evt);
            }
        });

        botonModificarImpuesto.setBackground(new java.awt.Color(11, 11, 11));
        botonModificarImpuesto.setText("Modificar Impuesto");
        botonModificarImpuesto.setColorHover(new java.awt.Color(240, 4, 7));
        botonModificarImpuesto.setMaximumSize(new java.awt.Dimension(91, 25));
        botonModificarImpuesto.setMinimumSize(new java.awt.Dimension(91, 25));
        botonModificarImpuesto.setName("botonModificarImpuesto"); // NOI18N
        botonModificarImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarImpuestoActionPerformed(evt);
            }
        });

        botonEliminarImpuesto.setBackground(new java.awt.Color(11, 11, 11));
        botonEliminarImpuesto.setText("Eliminar Impuesto");
        botonEliminarImpuesto.setColorHover(new java.awt.Color(240, 4, 7));
        botonEliminarImpuesto.setMaximumSize(new java.awt.Dimension(91, 25));
        botonEliminarImpuesto.setMinimumSize(new java.awt.Dimension(91, 25));
        botonEliminarImpuesto.setName("botonEliminarImpuesto"); // NOI18N
        botonEliminarImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarImpuestoActionPerformed(evt);
            }
        });

        idImpuesto.setText("ID");
        idImpuesto.setName("idImpuesto"); // NOI18N

        jLabel4.setText("Ingrese un nuevo Impuesto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 4, 7));
        jLabel6.setText("Para agregar un nuevo impuesto, ingrese los siguientes datos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(idImpuesto)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtAgregarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(botonEliminarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonModificarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botonAgregarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(279, 279, 279))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAgregarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(botonModificarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscarImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idImpuesto))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txtBuscarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarImpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarImpuestoActionPerformed

    private void txtBuscarImpuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarImpuestoKeyReleased
        librerias.Mayusculas.convertiraMayusculasEnJtextfield(txtBuscarImpuesto);
        funciones.funcionesImpuestos.setListar(this.txtBuscarImpuesto.getText());
    }//GEN-LAST:event_txtBuscarImpuestoKeyReleased

    private void botonAgregarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarImpuestoActionPerformed
        txtAgregarImpuesto.requestFocus();
        if (txtAgregarImpuesto.getText().length()==0) {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Ingrese los datos solicitados", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        } else {
        try{

            String sql= "INSERT INTO impuestos(id_iva,tipo)"
            +"VALUES('"+idImpuesto.getText()+"','"+txtAgregarImpuesto.getText()+"')";

            ps = conexionActual.prepareStatement(sql);

            int resultado = ps.executeUpdate();
            if (resultado > 0){
                funciones.funcionesImpuestos.setListar("");
                // setClean();
                this.idImpuesto.setText(funciones.funcionesImpuestos.extraerIDMaxIMP());
                new rojerusan.RSNotifyFade("EXITO", "Se ha registrado el impuesto", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                funciones.funcionesImpuestos.extraerIDMaxIMP();
                txtAgregarImpuesto.setText("");

            }else{
                new rojerusan.RSNotifyFade("ERROR", "Ha ocurrido un error", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        } catch (Exception e) {
            System.out.print("error"+e.getMessage());
        }
        }
    }//GEN-LAST:event_botonAgregarImpuestoActionPerformed

    private void botonModificarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarImpuestoActionPerformed
        
        int selec = tablaImpuestos.getSelectedRow();
        if (selec >-1) {
            int fila = tablaImpuestos.getSelectedRow();
            Frame f = JOptionPane.getFrameForComponent(this);
            ModificarImpuestos dialog = new ModificarImpuestos(f, true);
            dialog.txtModificarImpuesto.setText(tablaImpuestos.getValueAt(fila, 1).toString());
            dialog.txtid.setText(tablaImpuestos.getValueAt(fila, 0).toString());
            dialog.show();
        } else {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Seleccione un impuesto", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        }
    }//GEN-LAST:event_botonModificarImpuestoActionPerformed
String hora = "";
String fecha= "";
    private void botonEliminarImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarImpuestoActionPerformed
        String tabla = "IMPUESTO";
            String evento = "DELETE";
            hora = Principal.lblhora.getHora();
            fecha = Principal.lblfecha.getFecha();
        int selec2 = tablaImpuestos.getSelectedRow();
        if (selec2 >-1) {
        int fila = tablaImpuestos.getSelectedRow();
        sentenciasImpuestos s = new sentenciasImpuestos();
        s.setId_iva(tablaImpuestos.getValueAt(fila, 0).toString());
        if (JOptionPane.showConfirmDialog(this, "Desea eliminar registro?", "",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            if (funciones.funcionesImpuestos.isDelete(s)){
                new rojerusan.RSNotifyFade("EXITO", "Se ha eliminado el impuesto", selec2, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                funciones.funcionesImpuestos.setListar("");
                funciones.funcionesImpuestos.extraerIDMaxIMP();
                funciones.funcionesAuditoria.auditoria(fecha, hora, evento, tabla, login.funcionesLogin.idFuncionario);
            }
        }
        } else {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Seleccione un impuesto", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        }
    }//GEN-LAST:event_botonEliminarImpuestoActionPerformed

    private void txtBuscarImpuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarImpuestoKeyTyped
        if (txtBuscarImpuesto.getText().length() >=15) {
            evt.consume();
        } if(librerias.Validaciones.Numeros(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarImpuestoKeyTyped

    private void txtAgregarImpuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgregarImpuestoKeyTyped
        if (txtAgregarImpuesto.getText().length() >=15) {
            evt.consume();
        } if(librerias.Validaciones.Numeros(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAgregarImpuestoKeyTyped

    private void txtAgregarImpuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgregarImpuestoKeyReleased
       
    }//GEN-LAST:event_txtAgregarImpuestoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover botonAgregarImpuesto;
    private rojerusan.RSButtonHover botonEliminarImpuesto;
    private rojerusan.RSButtonHover botonModificarImpuesto;
    public static javax.swing.JLabel idImpuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static rojerusan.RSTableMetro tablaImpuestos;
    private rojerusan.RSMetroTextFullPlaceHolder txtAgregarImpuesto;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarImpuesto;
    // End of variables declaration//GEN-END:variables
}
