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
public class lectDbase implements person {

    protected int lectCheck;
    private String lectID;
    private String firstName;
    private String lastName;
    private String email;
    private String num;
    private String module;

    public lectDbase() {
        this.lectCheck = 0;
    }

    @Override
    public void add(String id, String firstName, String lastName, String email, String num, String module) throws IOException {

        this.lectID = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.num = num;
        this.module = module;

        try (FileWriter fw = new FileWriter("lectdb.txt", true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

            out.println(this.lectID + ";" + this.firstName + ";" + this.lastName + ";" + this.email + ";" + this.num + ";" + this.module);

        }
    }

    @Override
    public void verifyID(String id) throws IOException {

        String currentLine;
        this.lectID = id;
        File file = new File("lectdb.txt");
        try (Scanner scan = new Scanner(file)) {
            scan.useDelimiter(";");
            while (scan.hasNextLine()) {

                currentLine = scan.nextLine();

                if (currentLine.contains(this.lectID)) {
                    System.out.println("found");
                    lectCheck = -1;
                    break;
                } else {
                    System.out.println("not found");
                }
            }

        }
    }

    @Override
    public boolean validation() {
        return lectCheck == 0;
    }

    @Override
    public void delete(String id) throws FileNotFoundException, IOException {

        this.lectID = id;
        File inputFile = new File("lectdb.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

                String currentLine;

                while ((currentLine = reader.readLine()) != null) {

                    String trimmedLine = currentLine.trim();
                    if (!trimmedLine.startsWith(this.lectID)) {
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
        return lectID = id;
    }
    
    public String getModule(String subject) {
        return module = subject;
    }

}
