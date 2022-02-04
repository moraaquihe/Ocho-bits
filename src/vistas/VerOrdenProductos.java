/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;

/**
 *
 * @author SailorSakura
 */
public class VerOrdenProductos extends javax.swing.JDialog {

    /**
     * Creates new form VerOrdenProductos
     */
    public VerOrdenProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        funciones.funcionesOrdenServicios.setListarProductos();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListado = new rojerusan.RSTableMetro();
        botonEnviarDatos = new rojerusan.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadOrden = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel3 = new javax.swing.JLabel();

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

        tablaListado.setForeground(new java.awt.Color(11, 11, 11));
        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaListado.setColorBackgoundHead(new java.awt.Color(240, 4, 7));
        tablaListado.setColorFilasForeground1(new java.awt.Color(240, 4, 7));
        tablaListado.setColorFilasForeground2(new java.awt.Color(242, 134, 130));
        tablaListado.setSelectionBackground(new java.awt.Color(240, 198, 196));
        jScrollPane1.setViewportView(tablaListado);
        if (tablaListado.getColumnModel().getColumnCount() > 0) {
            tablaListado.getColumnModel().getColumn(0).setMinWidth(40);
            tablaListado.getColumnModel().getColumn(0).setMaxWidth(40);
            tablaListado.getColumnModel().getColumn(2).setMinWidth(130);
            tablaListado.getColumnModel().getColumn(2).setMaxWidth(130);
            tablaListado.getColumnModel().getColumn(3).setMinWidth(130);
            tablaListado.getColumnModel().getColumn(3).setMaxWidth(130);
        }

        botonEnviarDatos.setBackground(new java.awt.Color(11, 11, 11));
        botonEnviarDatos.setText("Enviar datos");
        botonEnviarDatos.setColorHover(new java.awt.Color(240, 4, 7));
        botonEnviarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarDatosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SELECCIONE EL PRODUCTO");

        txtCantidadOrden.setForeground(new java.awt.Color(11, 11, 11));
        txtCantidadOrden.setBorderColor(new java.awt.Color(11, 11, 11));
        txtCantidadOrden.setBotonColor(new java.awt.Color(240, 4, 7));
        txtCantidadOrden.setPhColor(new java.awt.Color(0, 0, 0));
        txtCantidadOrden.setPlaceholder("");
        txtCantidadOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadOrdenActionPerformed(evt);
            }
        });
        txtCantidadOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadOrdenKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadOrdenKeyTyped(evt);
            }
        });

        jLabel3.setText("Ingrese cantidad deseada:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(botonEnviarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEnviarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void botonEnviarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarDatosActionPerformed
        if (tablaListado.getSelectedRow() < 0) {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Seleccione un Producto", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        } else {
            int cantidad = tablaListado.getSelectedRow();
            int numero = Integer.parseInt(tablaListado.getValueAt(cantidad, 2).toString());
            if (txtCantidadOrden.getText().length() == 0 || Integer.parseInt(txtCantidadOrden.getText()) > numero) {
                 new rojerusan.RSNotifyFade("ADVERTENCIA", "Escriba una cantidad válida", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
            } else {
                int fila = tablaListado.getSelectedRow();
                DefaultTableModel modelo = (DefaultTableModel)vistas.RegistrarOrdenServicios.tablaOrdenProductos.getModel();
                String datos[] = new String[4];
                datos[0] = tablaListado.getValueAt(fila, 0).toString();
                datos[1] = tablaListado.getValueAt(fila, 1).toString();
                datos[2] = tablaListado.getValueAt(fila, 3).toString();
                datos[3] = txtCantidadOrden.getText();
        
                modelo.addRow(datos);
                vistas.RegistrarOrdenServicios.tablaOrdenProductos.setModel(modelo);
                txtCantidadOrden.setText("");
                dispose();
        }
        }
        
       
    }//GEN-LAST:event_botonEnviarDatosActionPerformed

    private void txtCantidadOrdenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadOrdenKeyTyped
       if (txtCantidadOrden.getText().length() >=11) {
            evt.consume();
        } if(librerias.Validaciones.Numeros(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadOrdenKeyTyped

    private void txtCantidadOrdenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadOrdenKeyReleased
        int fila = tablaListado.getSelectedRow();
        int num = 0, cant = 0;
        num = Integer.parseInt(tablaListado.getValueAt(fila, 2).toString());
        cant = Integer.parseInt(txtCantidadOrden.getText());
        if (cant > num) {
            new rojerusan.RSNotifyFade("ERROR", "La cantidad debe ser menor", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
        } else {
            System.out.println("se realizo el pedido");
        }
    }//GEN-LAST:event_txtCantidadOrdenKeyReleased

    private void txtCantidadOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadOrdenActionPerformed

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
            java.util.logging.Logger.getLogger(VerOrdenProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerOrdenProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerOrdenProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerOrdenProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerOrdenProductos dialog = new VerOrdenProductos(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonHover botonEnviarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static rojerusan.RSTableMetro tablaListado;
    private rojerusan.RSMetroTextFullPlaceHolder txtCantidadOrden;
    // End of variables declaration//GEN-END:variables
}