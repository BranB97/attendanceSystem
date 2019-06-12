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

/**
 *
 * @author acer
 */
public class reasonMaker extends javax.swing.JFrame {

    /**
     * Creates new form reasonMaker
     */
    public reasonMaker() {
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
        reasons = new javax.swing.JTextArea();
        studID = new javax.swing.JTextField();
        studName = new javax.swing.JTextField();
        course = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        studIntake = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        supportingDocs = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        otherDocs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reason for Absence"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reasons.setColumns(20);
        reasons.setRows(5);
        jScrollPane1.setViewportView(reasons);
        reasons.setLineWrap(true);
        reasons.setWrapStyleWord(true);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 470, 120));

        studID.setEditable(false);
        jPanel1.add(studID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 190, 30));

        studName.setEditable(false);
        jPanel1.add(studName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 30));

        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, -1));

        jLabel1.setText("Student ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setText("Intake");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel4.setText("Description of circumstances");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        studIntake.setEditable(false);
        jPanel1.add(studIntake, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, 30));

        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 211, 190, 30));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 740, -1, -1));

        jLabel6.setText("Course");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        supportingDocs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Death Certificate", "Flight Ticket", "Medical Certificate", "Police Report", "Others (Please Specify)" }));
        supportingDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supportingDocsActionPerformed(evt);
            }
        });
        jPanel1.add(supportingDocs, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 180, -1));

        jLabel7.setText("Supporting Document");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        otherDocs.setColumns(20);
        otherDocs.setRows(5);
        jScrollPane2.setViewportView(otherDocs);
        otherDocs.setLineWrap(true);
        otherDocs.setWrapStyleWord(true);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        otherDocs.setVisible(false);
        PopulateComboBox pop = new reasonMakerComboBox();
        pop.readIntake();
        pop.readCourse();
        pop.populateModule();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Boolean check = true;
        String getID = studID.getText();
        String getName = studName.getText();
        String getIntake = studIntake.getText();
        String getCourse = (String) course.getSelectedItem();
        String getReason = reasons.getText();
        String getDate = date.getText();
        String getProof;
        int selectedIndex = supportingDocs.getSelectedIndex();

        if (selectedIndex == 4) {
            getProof = otherDocs.getText();
            if (getProof.isEmpty()) {
                check = false;
            }

        } else {
           getProof = (String) supportingDocs.getSelectedItem();
        }

        if (getDate.isEmpty()) {
            check = false;
        }

        if (getReason.isEmpty()) {
            check = false;
        }

        if (check) {

            reasonsDbase rd = new reasonsDbase();
            try {
                rd.verify(getDate, getID, getCourse);
                if (rd.validation()) {

                    rd.write(getDate, getID, getName, getIntake, getCourse, getReason, getProof);
                    JOptionPane.showMessageDialog(null, "Data is saved successfully");

                } else {
                    JOptionPane.showMessageDialog(null, "Reason already written for this date and module", "TEST", JOptionPane.ERROR_MESSAGE);
                }

            } catch (IOException ex) {
                Logger.getLogger(reasonMaker.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "TEST", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void supportingDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supportingDocsActionPerformed
        // TODO add your handling code here:

        String temp = (String) supportingDocs.getSelectedItem();
        if (temp.equals("Others (Please Specify)")) {
            otherDocs.setVisible(true);
        } else {
            otherDocs.setVisible(false);
        }
    }//GEN-LAST:event_supportingDocsActionPerformed

    private class reasonMakerComboBox extends PopulateComboBox {

        @Override
        public String[] readIntake() {
            ArrayList<String> list = new ArrayList<>();
            try {
                searchPerson ss = new searchStudent();
                ss.search(User.currentUser);
                list = ss.getList();
                studID.setText(list.get(0));
                studName.setText(list.get(1) + " " + list.get(2));
                studIntake.setText(list.get(5));
            } catch (IOException ex) {
                Logger.getLogger(attendanceViewer.class.getName()).log(Level.SEVERE, null, ex);
            }
            return list.toArray(new String[list.size()]);
        }

        @Override
        public void populateModule() {

            String lines[];
            lines = readCourse();

            course.removeAllItems();

            for (String str : lines) {
                course.addItem(str);
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
            java.util.logging.Logger.getLogger(reasonMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reasonMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reasonMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reasonMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reasonMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> course;
    private javax.swing.JFormattedTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea otherDocs;
    private javax.swing.JTextArea reasons;
    private javax.swing.JTextField studID;
    private javax.swing.JTextField studIntake;
    private javax.swing.JTextField studName;
    private javax.swing.JComboBox<String> supportingDocs;
    // End of variables declaration//GEN-END:variables
}
