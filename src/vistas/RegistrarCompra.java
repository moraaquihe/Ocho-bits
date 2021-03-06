/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import rojerusan.RSNotifyAnimated;
import rojerusan.RSNotifyFade;



/**
 *
 * @author SailorSakura
 */
public class RegistrarCompra extends javax.swing.JInternalFrame {
DecimalFormat formateador = new DecimalFormat("#,##0.###");
    /**
     * Creates new form RegistrarCompra
     */
    public RegistrarCompra() {
        initComponents();
        idCompra.setText(funciones.funcionesCompras.extraerIDMaxCompra());
        idDetalleCompra.setText(funciones.funcionesCompras.extraerIDMaxDetCompra());
        dateSeleccion.setText(FechaActual());
        idCompra.setVisible(false);
        idDetalleCompra.setVisible(false);
        idOrden.setVisible(false);
    }
public static String FechaActual(){
    Date fecha = new Date();
    SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/yyyy");
    return formatofecha.format(fecha);
}
public void calcularTotal(){
      Integer cant = 0, precio = 0, suma = 0, producto = 0;
      for (int i = 0; i < RegistrarCompra.tablaCompra.getRowCount(); i++) {
          cant = Integer.parseInt(RegistrarCompra.tablaCompra.getValueAt(i, 2).toString());
          precio = Integer.parseInt(RegistrarCompra.tablaCompra.getValueAt(i, 3).toString());
          producto = cant * precio;
          suma += producto;
      }
      String punto = String.valueOf(suma);
      if(punto.length() > 3){
            String cadena = punto.replace(".","");
            txtTotal.setText(formateador.format(Integer.parseInt(cadena)));
        }
      
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompra = new rojerusan.RSTableMetro();
        botonCalcular = new rojerusan.RSButtonHover();
        idCompra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonRegistrarCompra = new rojerusan.RSButtonHover();
        idOrden = new javax.swing.JLabel();
        idDetalleCompra = new javax.swing.JLabel();
        txtTimbrado = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        dateSeleccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
        jLabel2.setText("REGISTRAR COMPRA");

        jLabel3.setText("Proveedor:");

        tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCompra.setColorBackgoundHead(new java.awt.Color(240, 4, 7));
        tablaCompra.setColorFilasForeground1(new java.awt.Color(240, 4, 7));
        tablaCompra.setColorFilasForeground2(new java.awt.Color(242, 134, 130));
        tablaCompra.setSelectionBackground(new java.awt.Color(240, 198, 196));
        jScrollPane1.setViewportView(tablaCompra);
        if (tablaCompra.getColumnModel().getColumnCount() > 0) {
            tablaCompra.getColumnModel().getColumn(0).setMinWidth(0);
            tablaCompra.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        botonCalcular.setBackground(new java.awt.Color(11, 11, 11));
        botonCalcular.setText("Calcular");
        botonCalcular.setColorHover(new java.awt.Color(240, 4, 7));
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        idCompra.setText("ID");

        jLabel4.setText("Fecha:");

        botonRegistrarCompra.setBackground(new java.awt.Color(11, 11, 11));
        botonRegistrarCompra.setText("Registrar");
        botonRegistrarCompra.setColorHover(new java.awt.Color(240, 4, 7));
        botonRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarCompraActionPerformed(evt);
            }
        });

        idOrden.setText("IDOC");

        idDetalleCompra.setText("IDDC");

        txtTimbrado.setForeground(new java.awt.Color(11, 11, 11));
        txtTimbrado.setBorderColor(new java.awt.Color(11, 11, 11));
        txtTimbrado.setBotonColor(new java.awt.Color(240, 4, 7));
        txtTimbrado.setPhColor(new java.awt.Color(0, 0, 0));
        txtTimbrado.setPlaceholder("");
        txtTimbrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimbradoActionPerformed(evt);
            }
        });
        txtTimbrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTimbradoKeyTyped(evt);
            }
        });

        jLabel5.setText("Timbrado:");

        lblTotal.setText("Total");

        txtProveedor.setEditable(false);
        txtProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtProveedor.setForeground(new java.awt.Color(11, 11, 11));
        txtProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtProveedor.setSelectionColor(new java.awt.Color(240, 4, 7));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setForeground(new java.awt.Color(11, 11, 11));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotal.setSelectionColor(new java.awt.Color(240, 4, 7));

        dateSeleccion.setEditable(false);
        dateSeleccion.setBackground(new java.awt.Color(255, 255, 255));
        dateSeleccion.setForeground(new java.awt.Color(11, 11, 11));
        dateSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dateSeleccion.setSelectionColor(new java.awt.Color(240, 4, 7));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 4, 7));
        jLabel6.setText("Antes de calcular, por favor verifique ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 4, 7));
        jLabel7.setText("si el precio corresponde, en ese caso,");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 4, 7));
        jLabel8.setText("seleccione el producto y modifique el precio.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idDetalleCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idOrden)
                        .addGap(411, 411, 411)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonRegistrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimbrado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(252, 252, 252)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(dateSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel6)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lblTotal)
                                                        .addGap(36, 36, 36)
                                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel7))
                                                .addGap(4, 4, 4))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addGap(299, 299, 299)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idDetalleCompra)
                            .addComponent(idOrden)
                            .addComponent(idCompra)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimbrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(dateSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal))
                        .addGap(29, 29, 29)
                        .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(botonRegistrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        calcularTotal();
        
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void botonRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarCompraActionPerformed
            
        if (txtTimbrado.getText().length() == 0 || txtTotal.getText().length() == 0) {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Verifique los datos", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        } else {
            funciones.funcionesCompras.guardarCompra();
            funciones.funcionesOrdenCompra.FinalizarOrden(idOrden.toString());
            
            new rojerusan.RSNotifyAnimated("Compra Finalizada", "Transacci??n realizada con ??xito.", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
            funciones.funcionesOrdenCompra.setListarOrdenCompra();
            this.dispose();
        }
        
       
    }//GEN-LAST:event_botonRegistrarCompraActionPerformed

    private void txtTimbradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimbradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimbradoActionPerformed

    private void txtTimbradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimbradoKeyTyped
       if (txtTimbrado.getText().length() >=20) {
            evt.consume();
        } if(librerias.Validaciones.Numeros(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTimbradoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover botonCalcular;
    private rojerusan.RSButtonHover botonRegistrarCompra;
    public static javax.swing.JTextField dateSeleccion;
    public static javax.swing.JLabel idCompra;
    public static javax.swing.JLabel idDetalleCompra;
    public static javax.swing.JLabel idOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    public static rojerusan.RSTableMetro tablaCompra;
    public static javax.swing.JTextField txtProveedor;
    public static rojerusan.RSMetroTextFullPlaceHolder txtTimbrado;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
