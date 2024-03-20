/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author heiva
 */
public class VistaEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form VistaProductos
     */
    public VistaEmpleados() {
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

        spHeadersTable = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblReturnToMenu = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - EMPLEADOS");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductos"); // NOI18N
        getContentPane().setLayout(null);

        spHeadersTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tblEmpleado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idEmpleado", "Nombre", "Apellido Paterno", "Apellido Materno", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spHeadersTable.setViewportView(tblEmpleado);

        getContentPane().add(spHeadersTable);
        spHeadersTable.setBounds(142, 58, 1138, 662);

        btnMenu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btnMenu.setText("🏠");
        btnMenu.setPreferredSize(new java.awt.Dimension(65, 65));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(30, 540, 80, 70);

        btnUpdate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnUpdate.setText("🖊️");
        btnUpdate.setPreferredSize(new java.awt.Dimension(65, 65));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(0, 129, 65, 65);

        btnCreate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnCreate.setText("➕");
        btnCreate.setPreferredSize(new java.awt.Dimension(65, 65));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate);
        btnCreate.setBounds(0, 58, 136, 65);

        btnDelete.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnDelete.setText("🗑️");
        btnDelete.setPreferredSize(new java.awt.Dimension(65, 65));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(71, 129, 65, 65);

        lblReturnToMenu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        lblReturnToMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnToMenu.setText("MENU");
        getContentPane().add(lblReturnToMenu);
        lblReturnToMenu.setBounds(10, 620, 120, 60);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        VistaEmpleadosActualizar vistaEmpleadosActualizar = new VistaEmpleadosActualizar();
        vistaEmpleadosActualizar.show();
        dispose();   
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        VistaMenu vistaMenu = new VistaMenu();
        vistaMenu.show();
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        VistaEmpleadosCrear vistaEmpleadosCrear = new VistaEmpleadosCrear();
        vistaEmpleadosCrear.show();
        dispose();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Logica del pop up de confirmacion
        int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "¿Estas seguro de eliminar este Empleado?", 
                            "QUALITAS - CONFIRMACION",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                        );
         
            if(result == JOptionPane.YES_OPTION){
                System.out.println(1);
               //label.setText("You selected: Yes");
            }else if (result == JOptionPane.NO_OPTION){
                System.out.println(2);
               //label.setText("You selected: No");
            }else {
                System.out.println(3);
               //label.setText("None selected");
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblReturnToMenu;
    private javax.swing.JScrollPane spHeadersTable;
    private javax.swing.JTable tblEmpleado;
    // End of variables declaration//GEN-END:variables
}
