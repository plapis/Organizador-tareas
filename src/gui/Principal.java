package gui;

import acciones.TareaAcciones;
import clases.TareaClass;
import clases.TareaVisualizar;
import clases.Tiempo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal extends javax.swing.JFrame {
    
    ArrayList <TareaVisualizar> tareasList = new ArrayList<>(); 
    
    CrearTarea panel = new CrearTarea();
    Tiempo tiempo = new Tiempo();
    Bienvenida panelBienvenida = new Bienvenida();
    
    
    
    
    
    public Principal() {
        initComponents();
        
        style();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        TareasButton = new javax.swing.JButton();
        CrearTareaButton = new javax.swing.JButton();
        InicioButton = new javax.swing.JButton();
        HistorialButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaJLabel = new javax.swing.JLabel();
        tareasPanel = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(13, 73, 161));

        TareasButton.setBackground(new java.awt.Color(19, 91, 172));
        TareasButton.setForeground(new java.awt.Color(255, 255, 250));
        TareasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book-open.png"))); // NOI18N
        TareasButton.setText("Tareas");
        TareasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareasButtonActionPerformed(evt);
            }
        });

        CrearTareaButton.setBackground(new java.awt.Color(19, 91, 172));
        CrearTareaButton.setForeground(new java.awt.Color(255, 255, 250));
        CrearTareaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file-plus.png"))); // NOI18N
        CrearTareaButton.setText("Crear Tarea");
        CrearTareaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearTareaButtonActionPerformed(evt);
            }
        });

        InicioButton.setBackground(new java.awt.Color(19, 91, 172));
        InicioButton.setForeground(new java.awt.Color(255, 255, 250));
        InicioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        InicioButton.setText("Inicio");
        InicioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioButtonActionPerformed(evt);
            }
        });

        HistorialButton.setBackground(new java.awt.Color(19, 91, 172));
        HistorialButton.setForeground(new java.awt.Color(255, 255, 250));
        HistorialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        HistorialButton.setText("Historial");

        aboutButton.setBackground(new java.awt.Color(19, 91, 172));
        aboutButton.setForeground(new java.awt.Color(255, 255, 250));
        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        aboutButton.setText("About me");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(logo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(InicioButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TareasButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CrearTareaButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HistorialButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aboutButton)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(InicioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TareasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CrearTareaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HistorialButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(aboutButton)
                .addGap(22, 22, 22))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 570));

        jPanel4.setBackground(new java.awt.Color(24, 118, 208));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Control de Tareas");

        fechaJLabel.setBackground(new java.awt.Color(255, 255, 255));
        fechaJLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaJLabel)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(fechaJLabel)
                .addGap(34, 34, 34)
                .addComponent(jLabel1))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 530, 120));
        jPanel2.add(tareasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 530, 450));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        addBienvenida();
        mostrarTiempo();
    }//GEN-LAST:event_formWindowOpened

    private void InicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioButtonActionPerformed
        // TODO add your handling code here:
        addBienvenida();
    }//GEN-LAST:event_InicioButtonActionPerformed

    private void CrearTareaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearTareaButtonActionPerformed
        // TODO add your handling code here:
        addMenu();
    }//GEN-LAST:event_CrearTareaButtonActionPerformed

    private void TareasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareasButtonActionPerformed
        // TODO add your handling code here:
        cargarTareas();
    }//GEN-LAST:event_TareasButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // TODO add your handling code here:
        AboutMe aboutMe = AboutMe.getInstance();
        aboutMe.setVisible(true);
        aboutMe.setFocusable(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aboutButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearTareaButton;
    private javax.swing.JButton HistorialButton;
    private javax.swing.JButton InicioButton;
    private javax.swing.JButton TareasButton;
    private javax.swing.JButton aboutButton;
    public javax.swing.JLabel fechaJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logo;
    private javax.swing.JScrollPane tareasPanel;
    // End of variables declaration//GEN-END:variables


    private void addMenu() {
        panel.setSize(530, 450);
        panel.setLocation(0,0);
        
        tareasPanel.removeAll();
        tareasPanel.add(panel);
        tareasPanel.revalidate();
        tareasPanel.repaint();
    }

    private void mostrarTiempo() {
        String fechaCompleta = tiempo.fecha();
        fechaJLabel.setText(fechaCompleta);
    }
    
    
    private void cargarTareas() {
        try {
            ArrayList<TareaClass> tareas = TareaAcciones.obtenerTareas();
            tareasList.clear();
            tareasPanel.removeAll();
            for(TareaClass tarea: tareas){
                TareaVisualizar tareaVisualizar = new TareaVisualizar(tarea);
                tareaVisualizar.setSize(530, 450);
                //tareaVisualizar.setLocation(0,0);
                tareasList.add(tareaVisualizar);
                tareasPanel.add(tareaVisualizar);
                tareasPanel.validate();
                tareasPanel.repaint();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void addBienvenida() {
        panelBienvenida.setSize(530, 450);
        panelBienvenida.setLocation(0,0);
        
        tareasPanel.removeAll();
        tareasPanel.add(panelBienvenida);
        tareasPanel.revalidate();
        tareasPanel.repaint();
    }

    private void style() {
        //aboutButton.setOpaque(false);
        //aboutButton.setContentAreaFilled(false); 
        aboutButton.setBorderPainted(false); 
        InicioButton.setBorderPainted(false);
        TareasButton.setBorderPainted(false);
        CrearTareaButton.setBorderPainted(false);
        HistorialButton.setBorderPainted(false);
    }
}