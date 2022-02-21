package gui;

import clases.TareaClass;
import acciones.TareaAcciones;
import java.sql.SQLException;


public class CrearTarea extends javax.swing.JFrame {
    
    static void mostrar(){
        CrearTarea crearTarea = new CrearTarea();
        crearTarea.cargarWidget();
        crearTarea.setSize(600,400);
        crearTarea.setVisible(true);
        crearTarea.requestFocus();
        
    }
    
    TareaNueva tareaNueva;

    private CrearTarea() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarButtom = new javax.swing.JButton();
        cancelarButtom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tareaPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear tarea");

        guardarButtom.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        guardarButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        guardarButtom.setText("Guardar");
        guardarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtomActionPerformed(evt);
            }
        });

        cancelarButtom.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cancelarButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x-circle.png"))); // NOI18N
        cancelarButtom.setText("Cancelar");
        cancelarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtomActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setText("Crear Cuenta");

        tareaPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tareaPanel.setLayout(new javax.swing.BoxLayout(tareaPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(tareaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarButtom)
                    .addComponent(cancelarButtom))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardarButtom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                        .addComponent(cancelarButtom)
                        .addGap(47, 47, 47))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtomActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelarButtomActionPerformed

    private void guardarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtomActionPerformed
        TareaClass tareaClass = tareaNueva.getTareaClass();
        try {
            TareaAcciones.guardarTarea(tareaClass);
            proyecto.Tareas.principal.agregarTarea(tareaClass);
            dispose();
        } catch (SQLException sQLException) {
            
        }
    }//GEN-LAST:event_guardarButtomActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButtom;
    private javax.swing.JButton guardarButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tareaPanel;
    // End of variables declaration//GEN-END:variables

    private void cargarWidget() {
        tareaNueva = new TareaNueva();
        tareaNueva.setSize(300,100);
        tareaNueva.setVisible(true);
        tareaPanel.removeAll();
        tareaPanel.add(tareaNueva);
        validate();
    }
}
