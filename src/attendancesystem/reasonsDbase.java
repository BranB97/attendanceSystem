/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class reasonsDbase extends studentDbase {

    private String date;
    private String fullName;
    private String course;
    private String reason;
    private String proof;

    public reasonsDbase() {
        super();
    }

    public void write(String date, String id, String fullName, String intake, String course, String reason, String proof) throws IOException {
        
        String get_id = getID(id);
        String get_intake = getIntake(intake);
        this.date = date;
        this.fullName = fullName;
        this.course = course;
        this.reason = reason;
        this.proof = proof;
        
        try (FileWriter fw = new FileWriter("reasonsdb.txt", true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

            out.print(this.date + ";" + get_id + ";" + this.fullName + ";" + get_intake + ";" + this.course + ";" + this.reason + ";" + this.proof);
            out.print("\n");

        }
    }

    public void verify(String date, String id, String course) throws IOException {
        
        String get_id = getID(id);
        this.date = date;
        this.course = course;
        String currentLine;
        
        File file = new File("reasonsdb.txt");
        try (Scanner scan = new Scanner(file)) {
            scan.useDelimiter(";");
            while (scan.hasNextLine()) {

                currentLine = scan.nextLine();

                if (currentLine.contains(date) && currentLine.contains(course) && currentLine.contains(get_id)) {
                    System.out.println("found");
                    studCheck = -1;
                    break;
                } else {
                    System.out.println("not found");
                }
            }

        }
    }
    
    @Override
    public boolean validation() {
        return super.validation();
    }

}
