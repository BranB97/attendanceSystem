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
public class lecturerManager extends javax.swing.JFrame {

    /**
     * Creates new form lecturerManager
     */
    public lecturerManager() {
        this.ev = new emailValidator();
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
        searchLect = new javax.swing.JFormattedTextField();
        search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        moduleName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        lectID = new javax.swing.JFormattedTextField();
        contactNo = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Lecturer ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        try {
            searchLect.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("T####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(searchLect, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 310, 30));

        search.setText("Enter");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 540, 110));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lecturer Information"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Module");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel3.setText("Lecturer ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setText("Last Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setText("Contact Number");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel6.setText("Email address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        moduleName.setEditable(false);
        jPanel2.add(moduleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 310, 30));
        jPanel2.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 310, 30));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 310, 30));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        try {
            lectID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("T####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(lectID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 310, 30));

        try {
            contactNo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(contactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 310, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Potions", "Defense Against the Dark Arts", "History of Magic", "Transfiguration", "Charms" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 310, -1));

        jLabel7.setText("First Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel2.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 310, 30));

        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Please enter valid ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));
        jLabel9.setVisible(false);

        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Please enter valid name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));
        jLabel10.setVisible(false);

        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Please enter valid name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));
        jLabel11.setVisible(false);

        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("Please enter valid email");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
        jLabel12.setVisible(false);

        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("Please enter valid number");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));
        jLabel13.setVisible(false);

        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("Please enter valid module");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));
        jLabel14.setVisible(false);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 500, 560));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecturer ID", "First Name", "Last Name", "Email ", "Contact No", "Module"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 560, 530));

        jButton6.setText("Refresh table");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    emailValidator ev;
   

    private class lectTable implements fillTable {

        @Override
        public void fillTable() {
            System.out.println("printing table");
        }

        @Override
        public void fillRows() {
            String line;
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            File file = new File("lectdb.txt");
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                //ToDO
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(";");
                    if (line.length() > 0) {
                        dtm.addRow(data);
                    }

                }

            } catch (IOException ex) {
                Logger.getLogger(lecturerManager.class.getName()).log(Level.SEVERE, null, ex);
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
    
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:

        String search_Lect = searchLect.getText();
        try {
            searchPerson ss = new searchLect();
            ss.search(search_Lect);
            if (ss.validation()) {
                ArrayList<String> list = ss.getList();
                lectID.setText(list.get(0));
                firstName.setText(list.get(1));
                lastName.setText(list.get(2));
                email.setText(list.get(3));
                contactNo.setText(list.get(4));
                moduleName.setText(list.get(5));
            } else {
                JOptionPane.showMessageDialog(null, "User doesnt exist", "TEST", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(lecturerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

        boolean check = true;
        String lect_ID = lectID.getText();
        String first_Name = firstName.getText();
        String last_Name = lastName.getText();
        String studEmail = email.getText();
        String studContact = contactNo.getText();
        String course = moduleName.getText();

        if (!lectID.isEditValid()) {
            jLabel9.setVisible(true);
            check = false;
        }
        if (first_Name.equals("")) {
            jLabel10.setVisible(true);
            check = false;
        }
        if (last_Name.equals("")) {
            jLabel11.setVisible(true);
            check = false;
        }
        if (!ev.validate(studEmail.trim())) {
            jLabel12.setVisible(true);
            check = false;
        }
        if (!contactNo.isEditValid()) {
            jLabel13.setVisible(true);
            check = false;
        }
        if (course.equals("")) {
            jLabel14.setVisible(true);
            check = false;
        }

        if (check) {
            try {
                person addLect = new lectDbase();
                addLect.verifyID(lect_ID);
                if (addLect.validation()) {
                    addLect.add(lect_ID, first_Name, last_Name, studEmail, studContact, course);
                    User user = new User();
                    user.add(lect_ID, lect_ID);
                    JOptionPane.showMessageDialog(null, "Data is saved successfully");
                    jLabel9.setVisible(false);
                    jLabel10.setVisible(false);
                    jLabel11.setVisible(false);
                    jLabel12.setVisible(false);
                    jLabel13.setVisible(false);
                    jLabel14.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "User already exist", "TEST", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                Logger.getLogger(lecturerManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Please fill in all fields", "TEST", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        Boolean check = true;
        String lect_ID = lectID.getText();
        String first_Name = firstName.getText();
        String last_Name = lastName.getText();
        String studEmail = email.getText();
        String studContact = contactNo.getText();
        String course = moduleName.getText();
        String lectUpdate = searchLect.getText();

        if (!lectID.isEditValid()) {
            jLabel9.setVisible(true);
            check = false;
        }
        if (first_Name.equals("")) {
            jLabel10.setVisible(true);
            check = false;
        }
        if (last_Name.equals("")) {
            jLabel11.setVisible(true);
            check = false;
        }
        if (!ev.validate(studEmail.trim())) {
            jLabel12.setVisible(true);
            check = false;
        }
        if (!contactNo.isEditValid()) {
            jLabel13.setVisible(true);
            check = false;
        }
        if (course.equals("")) {
            jLabel14.setVisible(true);
            check = false;
        }

        if (check) {

            try {
                person addLect = new lectDbase();
                searchPerson ss = new searchLect();
                ss.search(lectUpdate);
                if (ss.validation() && lect_ID.equals(lectUpdate)) {

                    addLect.delete(lectUpdate);
                    addLect.add(lect_ID, first_Name, last_Name, studEmail, studContact, course);
                    JOptionPane.showMessageDialog(null, "Data is updated successfully");
                    jLabel9.setVisible(false);
                    jLabel10.setVisible(false);
                    jLabel11.setVisible(false);
                    jLabel12.setVisible(false);
                    jLabel13.setVisible(false);
                    jLabel14.setVisible(false);

                } else {
                    if (!lect_ID.equals(lectUpdate)) {
                        JOptionPane.showMessageDialog(null, "Lecturer ID cannot be modified once given", "TEST", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "User doesnt exist", "TEST", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(lecturerManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Please fill in all fields", "TEST", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:

        searchLect.setValue(null);
        lectID.setValue(null);
        firstName.setText("");
        lastName.setText("");
        email.setText("");
        contactNo.setValue(null);
        moduleName.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:

        String searchID = searchLect.getText();
        try {
            person addLect = new lectDbase();
            searchPerson ss = new searchLect();
            ss.search(searchID);
            if (ss.validation()) {

                addLect.delete(searchID);
                User user = new User();
                user.delete(searchID);
                JOptionPane.showMessageDialog(null, "Data is deleted successfully");

            } else {
                JOptionPane.showMessageDialog(null, "User doesnt exist", "TEST", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(lecturerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

        String value = (String) jComboBox1.getSelectedItem();
        moduleName.setText(value);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        fillTable ft = new lectTable();
        ft.delRows();
        ft.fillRows();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        fillTable ft = new lectTable();
        ft.fillRows();
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        int selectedRowIndex = jTable1.getSelectedRow();
        
        searchLect.setText(dtm.getValueAt(selectedRowIndex, 0).toString());
        lectID.setText(dtm.getValueAt(selectedRowIndex, 0).toString());
        firstName.setText(dtm.getValueAt(selectedRowIndex, 1).toString());
        lastName.setText(dtm.getValueAt(selectedRowIndex, 2).toString());
        email.setText(dtm.getValueAt(selectedRowIndex, 3).toString());
        contactNo.setText(dtm.getValueAt(selectedRowIndex, 4).toString());
        moduleName.setText(dtm.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(lecturerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecturerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecturerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecturerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lecturerManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JFormattedTextField contactNo;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastName;
    private javax.swing.JFormattedTextField lectID;
    private javax.swing.JTextField moduleName;
    private javax.swing.JButton search;
    private javax.swing.JFormattedTextField searchLect;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}