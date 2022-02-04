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
public class ListaInventario extends javax.swing.JDialog {

    /**
     * Creates new form ListaInventario
     */
    public ListaInventario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        funciones.funcionesOrdenCompra.setListarListado();
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

        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            tablaListado.getColumnModel().getColumn(0).setMinWidth(0);
            tablaListado.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaListado.getColumnModel().getColumn(2).setMinWidth(130);
            tablaListado.getColumnModel().getColumn(2).setMaxWidth(130);
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
        jLabel2.setText("LISTADO");

        txtCantidadOrden.setForeground(new java.awt.Color(11, 11, 11));
        txtCantidadOrden.setBorderColor(new java.awt.Color(11, 11, 11));
        txtCantidadOrden.setBotonColor(new java.awt.Color(240, 4, 7));
        txtCantidadOrden.setPhColor(new java.awt.Color(0, 0, 0));
        txtCantidadOrden.setPlaceholder("");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel2)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(botonEnviarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantidadOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonEnviarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void botonEnviarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarDatosActionPerformed
        if (txtCantidadOrden.getText().length() <= 0) {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Ingrese una cantidad", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        } else {
            if (tablaListado.getSelectedRow() < 0) {
            new rojerusan.RSNotifyFade("ADVERTENCIA", "Seleccione un Producto", 5, RSNotifyFade.PositionNotify.TopLef, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
        } else {
           
                    int fila = tablaListado.getSelectedRow();
                    DefaultTableModel modelo = (DefaultTableModel)vistas.RegistrarOrdenCompra.tablaOrden.getModel();
                    String datos[] = new String[3];
                    datos[0] = tablaListado.getValueAt(fila, 0).toString();
                    datos[1] = tablaListado.getValueAt(fila, 1).toString();
                    datos[2] = txtCantidadOrden.getText();
                    modelo.addRow(datos);
                    vistas.RegistrarOrdenCompra.tablaOrden.setModel(modelo);
                    txtCantidadOrden.setText("");
                    this.dispose();
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
        
    }//GEN-LAST:event_txtCantidadOrdenKeyReleased

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
            java.util.logging.Logger.getLogger(ListaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaInventario dialog = new ListaInventario(new javax.swing.JFrame(), true);
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