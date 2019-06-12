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

/**
 *
 * @author acer
 */
public class PopulateComboBox {

    public String[] readIntake() {
        ArrayList<String> arr = new ArrayList<>();
        File file = new File("intakedb.txt");
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            //ToDO
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                arr.add(data[0]);
            }

        } catch (IOException ex) {
            Logger.getLogger(lecturerManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arr.toArray(new String[arr.size()]);
    }

    public String[] readCourse() {
        ArrayList<String> arr = new ArrayList<>();
        File file = new File("intakedb.txt");
        String line;
        String intake[] = readIntake();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            //ToDO
            while ((line = br.readLine()) != null) {
                if (line.contains(intake[5])) {

                    String[] data = line.split(";");
                    arr.add(data[1]);
                    arr.add(data[3]);
                    arr.add(data[5]);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(lecturerManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arr.toArray(new String[arr.size()]);
    }

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

    public void populate() {
        String[] lines;
        lines = readIntake();
    }

    public void populateStat() {
        String[] arr = {"Present", "Absent", "Late"};
    }

    public void populateModule() {
        String[] lines;
        lines = readCourse();
    }

}
