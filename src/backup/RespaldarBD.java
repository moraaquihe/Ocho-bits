/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RespaldarBD.java
 *
 * Created on 01-ene-2013, 22:16:23
 */
package backup;

import Controlador.Seleccion;
import backup.Backups;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyShadowAnimated;


/**
 *
 * @author Tottus
 */
public class RespaldarBD extends javax.swing.JDialog {

    /** Creates new form RespaldarBD */
    String user="root";
    String password="1234";
    String bd="ochodatabase";
    String path="";
    String backup="C:\\wamp\\bin\\mysql\\mysql5.7.21\\bin\\mysqldump --user="+user+" --password="+password+" -v "+bd+" > "+path;
    private String extension=".sql";
    Runtime rt = Runtime.getRuntime();
    Backups p;
    public RespaldarBD(Backups parent, boolean modal) {
        super(parent, modal);
        p=parent;
        initComponents();
        this.setLocationRelativeTo(p);
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        radbtntxt = new javax.swing.JRadioButton();
        radbtnsql = new javax.swing.JRadioButton();
        txtruta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonExaminar = new rojerusan.RSButtonHover();
        botonRespaldar = new rojerusan.RSButtonHover();

        buttonGroup1.add(radbtnsql);
        buttonGroup1.add(radbtntxt);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Respaldar Base de Datos");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 11, 11), 2, true));
        jPanel1.setForeground(new java.awt.Color(240, 4, 7));

        radbtntxt.setBackground(new java.awt.Color(255, 255, 255));
        radbtntxt.setSelected(true);
        radbtntxt.setText(".txt");
        radbtntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbtntxtActionPerformed(evt);
            }
        });

        radbtnsql.setBackground(new java.awt.Color(255, 255, 255));
        radbtnsql.setText(".sql");
        radbtnsql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbtnsqlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radbtntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(radbtnsql)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radbtntxt)
                    .addComponent(radbtnsql))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtruta.setEditable(false);
        txtruta.setSelectionColor(new java.awt.Color(240, 4, 7));

        jLabel2.setText("Ubicaci??n:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GUARDAR DATOS");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-cerrar2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        botonExaminar.setBackground(new java.awt.Color(11, 11, 11));
        botonExaminar.setText("Examinar");
        botonExaminar.setColorHover(new java.awt.Color(240, 4, 7));
        botonExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExaminarActionPerformed(evt);
            }
        });

        botonRespaldar.setBackground(new java.awt.Color(11, 11, 11));
        botonRespaldar.setText("Respaldar");
        botonRespaldar.setColorHover(new java.awt.Color(240, 4, 7));
        botonRespaldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRespaldarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(botonExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(botonRespaldar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(210, 210, 210))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRespaldar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radbtntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbtntxtActionPerformed
        extension=".txt";
    }//GEN-LAST:event_radbtntxtActionPerformed

    private void radbtnsqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbtnsqlActionPerformed
        extension=".sql";
    }//GEN-LAST:event_radbtnsqlActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void botonExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExaminarActionPerformed
        Seleccion o=new Seleccion();
        o.ResetFiltros();
        File file= o.guardar(this);
        if(file!=null){
           String cad= file.getAbsolutePath();
           txtruta.setText(cad);
        }
    }//GEN-LAST:event_botonExaminarActionPerformed

    private void botonRespaldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRespaldarActionPerformed
        if(txtruta.getText().length()>0){
            try {
                File file;
                file=new File(txtruta.getText());
                path=file.getAbsolutePath()+extension;
                System.out.println(""+path);
                int c=JOptionPane.showConfirmDialog(p, "Desea Crear una Copia de Seguridad en esta ruta \n"+path, "Mensaje de Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(c==JOptionPane.YES_OPTION){
                    backup="C:\\wamp\\bin\\mysql\\mysql5.7.21\\bin\\mysqldump --opt -u"+user+" -p"+password+" "+bd+"  -r "+path;
                    rt.exec(backup);
                    //JOptionPane.showMessageDialog(p, "BackUp Creado Correctamente en "+file.getPath());
                    new rojerusan.RSNotifyShadowAnimated("COPIA DE SEGURIDAD", "Creado correctamente en: "+file.getPath(), 7 , RSNotifyShadowAnimated.PositionNotify.TopRight, RSNotifyShadowAnimated.AnimationNotify.UpBottom, RSNotifyShadowAnimated.TypeNotify.INFORMATION).setVisible(true);
                    this.dispose();
                }
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }else
            JOptionPane.showMessageDialog(this, "Complete Todos Los Campos");
    }//GEN-LAST:event_botonRespaldarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover botonExaminar;
    private rojerusan.RSButtonHover botonRespaldar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radbtnsql;
    private javax.swing.JRadioButton radbtntxt;
    private javax.swing.JTextField txtruta;
    // End of variables declaration//GEN-END:variables
}
