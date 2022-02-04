/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.text.DecimalFormat;
import rojerusan.RSNotifyAnimated;
import static vistas.Caja.botonCierre;
import static vistas.Caja.botonNuevoEgreso;
import static vistas.Caja.botonNuevoIngreso;



/**
 *
 * @author SailorSakura
 */
public class Apertura extends javax.swing.JDialog {
DecimalFormat formateador = new DecimalFormat("#,##0.###");
    /**
     * Creates new form Apertura
     */
    public Apertura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        funciones.funcionesCaja.setListarCuentas("");
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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuentas = new rojerusan.RSTableMetro();
        botonInicio = new rojerusan.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("APERTURA");

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

        botonInicio.setBackground(new java.awt.Color(11, 11, 11));
        botonInicio.setText("Iniciar caja");
        botonInicio.setColorHover(new java.awt.Color(240, 4, 7));
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1)))
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(botonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        int fila = tablaCuentas.getSelectedRow();
        String punto = tablaCuentas.getValueAt(fila, 5).toString();
        if (fila > -1){
            vistas.Caja.idC.setText(tablaCuentas.getValueAt(fila, 0).toString());
            vistas.Caja.lblCuenta.setText(tablaCuentas.getValueAt(fila, 2).toString());
            if(punto.length() > 3){
                String cadena = punto.replace(".","");
                vistas.Caja.txtSaldo.setText(formateador.format(Integer.parseInt(cadena)));
            }
           // vistas.Caja.txtSaldo.setText(tablaCuentas.getValueAt(fila, 5).toString());
            vistas.Principal.idCuentaPrincipal.setText(tablaCuentas.getValueAt(fila, 0).toString());
            vistas.Principal.lblCuentaPrincipal.setText(tablaCuentas.getValueAt(fila, 2).toString());
            vistas.Principal.txtSaldoPrincipal.setText(tablaCuentas.getValueAt(fila, 5).toString());
            funciones.funcionesCaja.updateApertura(tablaCuentas.getValueAt(fila, 0).toString());
            //funciones.funcionesCaja.habilitarApertura();
            new rojerusan.RSNotifyAnimated("Apertura", "Se ha iniciado la caja.", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
            this.dispose();
        } else {
            new rojerusan.RSNotifyAnimated("ERROR", "Seleccione uno", 5, RSNotifyAnimated.PositionNotify.TopLef, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);

        }
         
        
        
        vistas.Caja.botonApertura.setVisible(false);
        botonCierre.setEnabled(true);
        botonNuevoEgreso.setEnabled(true);
        botonNuevoIngreso.setEnabled(true);
    }//GEN-LAST:event_botonInicioActionPerformed

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
            java.util.logging.Logger.getLogger(Apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Apertura dialog = new Apertura(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonHover botonInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static rojerusan.RSTableMetro tablaCuentas;
    // End of variables declaration//GEN-END:variables
}
