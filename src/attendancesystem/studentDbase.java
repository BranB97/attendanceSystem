/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class studentDbase implements person {

    protected int studCheck;
    private String studId;
    private String firstName;
    private String lastName;
    private String email;
    private String num;
    private String studIntake;

    public studentDbase() {
        this.studCheck = 0;
    }

    @Override
    public void add(String id, String firstName, String lastName, String email, String num, String intake) throws IOException {

        this.studId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.num = num;
        this.studIntake = intake;

        try (FileWriter fw = new FileWriter("studentdb.txt", true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

            out.println(this.studId + ";" + this.firstName + ";" + this.lastName + ";" + this.email + ";" + this.num + ";" + this.studIntake);

        }
    }

    @Override
    public void verifyID(String id) throws IOException {

        String currentLine;
        this.studId = id;
        File file = new File("studentdb.txt");
        try (Scanner scan = new Scanner(file)) {
            scan.useDelimiter(";");
            while (scan.hasNextLine()) {

                currentLine = scan.nextLine();

                if (currentLine.contains(this.studId)) {
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
        return studCheck == 0;
    }

    @Override
    public void delete(String id) throws FileNotFoundException, IOException {
        
        this.studId = id;
        File inputFile = new File("studentdb.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

                String currentLine;

                while ((currentLine = reader.readLine()) != null) {

                    String trimmedLine = currentLine.trim();
                    if (!trimmedLine.startsWith(this.studId)) {
                        writer.write(currentLine + System.getProperty("line.separator"));
                    }
                }
            }

        }

        inputFile.delete();
        boolean successfull = tempFile.renameTo(inputFile);
        System.out.println(successfull);

    }
    
    public String getID(String id) {
        return studId = id;
    }
    
    public String getIntake(String intake) {
        return studIntake = intake;
    }

}
