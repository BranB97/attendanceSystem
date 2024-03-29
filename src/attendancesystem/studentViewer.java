/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class studentViewer extends javax.swing.JFrame {

    /**
     * Creates new form studentViewer
     */
    public studentViewer() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        intake = new javax.swing.JComboBox<>();
        viewStud = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Information"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Email", "Contact No", "Intake"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 670, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 710, 620));

        intake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(intake, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 130, -1));

        viewStud.setText("View");
        viewStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudActionPerformed(evt);
            }
        });
        getContentPane().add(viewStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, -1));

        jLabel1.setText("Intake Code");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        PopulateComboBox pop = new studentViewComboBox();
        pop.normalRead();
        pop.populate();
    }//GEN-LAST:event_formWindowOpened

    private void viewStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudActionPerformed
        // TODO add your handling code here:
        
        fillTable st = new studTable();
        st.delRows();
        st.fillRows();
        
    }//GEN-LAST:event_viewStudActionPerformed

    private class studTable implements fillTable {

        String getIntake = intake.getSelectedItem().toString();
        boolean bool = false;
        
        @Override
        public void fillTable() {
            System.out.println("printing table");
        }

        @Override
        public void fillRows() {
            String line;
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            File file = new File("studentdb.txt");
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                //ToDO
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(";");
                    if (line.length() > 0 && line.contains(getIntake)) {
                        dtm.addRow(data);
                        bool = true;
                    }

                }

            } catch (IOException ex) {
                Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(!bool) {
                JOptionPane.showMessageDialog(null, "No records", "TEST", JOptionPane.ERROR_MESSAGE);
            }
        }

        @Override
        public void delRows() {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            int rowCount = dtm.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                dtm.removeRow(i);
            }
        }
    }

    private class studentViewComboBox extends PopulateComboBox {

        @Override
        public String[] normalRead() {

            ArrayList<String> arr = new ArrayList<>();
            File file = new File("intakedb.txt");
            String line;
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                //ToDO
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(";");
                    if (line.contains(User.currentUser)) {
                        arr.add(data[0]);
                    }
                }

            } catch (IOException ex) {
                Logger.getLogger(lecturerManager.class.getName()).log(Level.SEVERE, null, ex);
            }

            return arr.toArray(new String[arr.size()]);
        }

        @Override
        public void populate() {

            String[] lines = normalRead();

            intake.removeAllItems();

            for (String str : lines) {
                intake.addItem(str);
            }

        }
    }

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
            java.util.logging.Logger.getLogger(studentViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> intake;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton viewStud;
    // End of variables declaration//GEN-END:variables
}
