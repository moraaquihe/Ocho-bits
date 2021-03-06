/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import backup.Backups;

/**
 *
 * @author SailorSakura
 */
public class Mantenimientos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mantenimientos
     */
    public Mantenimientos() {
        initComponents();
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
        botonImpuestos = new rojerusan.RSButtonHover();
        botonBancos = new rojerusan.RSButtonHover();
        botonTiposServicios = new rojerusan.RSButtonHover();
        botonCuentas = new rojerusan.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        botonFuncionarios = new rojerusan.RSButtonHover();
        botonProveedores = new rojerusan.RSButtonHover();
        botonPaises1 = new rojerusan.RSButtonHover();
        botonDepartamento = new rojerusan.RSButtonHover();
        botonCiudades = new rojerusan.RSButtonHover();
        botonUsuario = new rojerusan.RSButtonHover();
        jPanel3 = new javax.swing.JPanel();
        botonAuditoria = new rojerusan.RSButtonHover();
        botonBackup = new rojerusan.RSButtonHover();

        setBorder(null);

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
        jLabel2.setText("ADMINISTRADOR");

        botonImpuestos.setBackground(new java.awt.Color(11, 11, 11));
        botonImpuestos.setText("IMPUESTOS");
        botonImpuestos.setColorHover(new java.awt.Color(240, 4, 7));
        botonImpuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImpuestosActionPerformed(evt);
            }
        });

        botonBancos.setBackground(new java.awt.Color(11, 11, 11));
        botonBancos.setText("BANCOS");
        botonBancos.setColorHover(new java.awt.Color(240, 4, 7));
        botonBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBancosActionPerformed(evt);
            }
        });

        botonTiposServicios.setBackground(new java.awt.Color(11, 11, 11));
        botonTiposServicios.setText("TIPOS DE SERVICIOS");
        botonTiposServicios.setColorHover(new java.awt.Color(240, 4, 7));
        botonTiposServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTiposServiciosActionPerformed(evt);
            }
        });

        botonCuentas.setBackground(new java.awt.Color(11, 11, 11));
        botonCuentas.setText("CUENTAS");
        botonCuentas.setColorHover(new java.awt.Color(240, 4, 7));
        botonCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuentasActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(240, 198, 196));

        botonFuncionarios.setBackground(new java.awt.Color(11, 11, 11));
        botonFuncionarios.setText("FUNCIONARIOS");
        botonFuncionarios.setColorHover(new java.awt.Color(240, 4, 7));
        botonFuncionarios.setName("botonFuncionarios"); // NOI18N
        botonFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFuncionariosActionPerformed(evt);
            }
        });

        botonProveedores.setBackground(new java.awt.Color(11, 11, 11));
        botonProveedores.setText("PROVEEDORES");
        botonProveedores.setColorHover(new java.awt.Color(240, 4, 7));
        botonProveedores.setName("botonProveedores"); // NOI18N
        botonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedoresActionPerformed(evt);
            }
        });

        botonPaises1.setBackground(new java.awt.Color(11, 11, 11));
        botonPaises1.setText("PAISES");
        botonPaises1.setColorHover(new java.awt.Color(240, 4, 7));
        botonPaises1.setName("botonPaises"); // NOI18N
        botonPaises1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPaises1ActionPerformed(evt);
            }
        });

        botonDepartamento.setBackground(new java.awt.Color(11, 11, 11));
        botonDepartamento.setText("DEPARTAMENTOS");
        botonDepartamento.setColorHover(new java.awt.Color(240, 4, 7));
        botonDepartamento.setName("botonDepartamento"); // NOI18N
        botonDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDepartamentoActionPerformed(evt);
            }
        });

        botonCiudades.setBackground(new java.awt.Color(11, 11, 11));
        botonCiudades.setText("CIUDADES");
        botonCiudades.setColorHover(new java.awt.Color(240, 4, 7));
        botonCiudades.setName("botonCiudades"); // NOI18N
        botonCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCiudadesActionPerformed(evt);
            }
        });

        botonUsuario.setBackground(new java.awt.Color(11, 11, 11));
        botonUsuario.setText("USUARIOS");
        botonUsuario.setColorHover(new java.awt.Color(240, 4, 7));
        botonUsuario.setName("botonUsuario"); // NOI18N
        botonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPaises1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(botonFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(botonCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonPaises1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(240, 198, 196));

        botonAuditoria.setBackground(new java.awt.Color(11, 11, 11));
        botonAuditoria.setText("AUDITORIA");
        botonAuditoria.setColorHover(new java.awt.Color(240, 4, 7));
        botonAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAuditoriaActionPerformed(evt);
            }
        });

        botonBackup.setBackground(new java.awt.Color(11, 11, 11));
        botonBackup.setText("COPIA DE SEGURIDAD");
        botonBackup.setColorHover(new java.awt.Color(240, 4, 7));
        botonBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonTiposServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(67, 67, 67)
                .addComponent(botonTiposServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBancos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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

    private void botonFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFuncionariosActionPerformed
        Funcionarios p = new Funcionarios();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonFuncionariosActionPerformed

    private void botonPaises1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPaises1ActionPerformed
        Paises p = new Paises();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonPaises1ActionPerformed

    private void botonDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDepartamentoActionPerformed
        Departamentos p = new Departamentos();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonDepartamentoActionPerformed

    private void botonCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCiudadesActionPerformed
        Ciudades p = new Ciudades();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonCiudadesActionPerformed

    private void botonImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImpuestosActionPerformed
        Impuestos m = new Impuestos();
        vistas.Principal.jDesktopPane1.add(m);
        m.setVisible(true);
        m.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, m);
        this.dispose();
    }//GEN-LAST:event_botonImpuestosActionPerformed

    private void botonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedoresActionPerformed
        Proveedores p = new Proveedores();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonProveedoresActionPerformed

    private void botonBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBancosActionPerformed
        Bancos p = new Bancos();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonBancosActionPerformed

    private void botonTiposServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTiposServiciosActionPerformed
        TiposServicios p = new TiposServicios();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonTiposServiciosActionPerformed

    private void botonBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBackupActionPerformed
        Backups p = new Backups();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonBackupActionPerformed

    private void botonCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuentasActionPerformed
        Cuentas p = new Cuentas();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonCuentasActionPerformed

    private void botonAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAuditoriaActionPerformed
        Auditorias p = new Auditorias();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonAuditoriaActionPerformed

    private void botonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuarioActionPerformed
        Usuarios p = new Usuarios();
        vistas.Principal.jDesktopPane1.add(p);
        p.setVisible(true);
        p.setUI(null);
        librerias.UtilitariosFrame.centrarInternalFrame(vistas.Principal.jDesktopPane1, p);
        this.dispose();
    }//GEN-LAST:event_botonUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover botonAuditoria;
    private rojerusan.RSButtonHover botonBackup;
    private rojerusan.RSButtonHover botonBancos;
    private rojerusan.RSButtonHover botonCiudades;
    private rojerusan.RSButtonHover botonCuentas;
    private rojerusan.RSButtonHover botonDepartamento;
    private rojerusan.RSButtonHover botonFuncionarios;
    private rojerusan.RSButtonHover botonImpuestos;
    private rojerusan.RSButtonHover botonPaises1;
    private rojerusan.RSButtonHover botonProveedores;
    private rojerusan.RSButtonHover botonTiposServicios;
    private rojerusan.RSButtonHover botonUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
