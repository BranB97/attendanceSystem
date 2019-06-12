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
public class createIntake {

    private int check;
    private String intake;
    private String sub1;
    private String lect1;
    private String sub2;
    private String lect2;
    private String sub3;
    private String lect3;

    public createIntake() {

        this.check = 0;
    }

    public void create(String intake, String sub1, String lect1, String sub2, String lect2, String sub3, String lect3) throws IOException {

        this.intake = intake;
        this.sub1 = sub1;
        this.lect1 = lect1;
        this.sub2 = sub2;
        this.lect2 = lect2;
        this.sub3 = sub3;
        this.lect3 = lect3;

        try (FileWriter fw = new FileWriter("intakedb.txt", true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

            out.println(this.intake + ";" + this.sub1 + ";" + this.lect1 + ";" + this.sub2 + ";" + this.lect2 + ";" + this.sub3 + ";" + this.lect3);

        }

    }

    public void verifyIntake(String intake) throws IOException {

        String currentLine;
        this.intake = intake;
        File file = new File("intakedb.txt");
        try (Scanner scan = new Scanner(file)) {
            scan.useDelimiter(";");
            while (scan.hasNextLine()) {

                currentLine = scan.nextLine();

                if (currentLine.contains(this.intake)) {
                    System.out.println("found");
                    check = -1;
                    break;
                } else {
                    System.out.println("not found");
                }
            }

        }
    }

    public boolean validation() {
        return check == 0;
    }

    public void delete(String code) throws FileNotFoundException, IOException {

        this.intake = code;
        File inputFile = new File("intakedb.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

                String currentLine;

                while ((currentLine = reader.readLine()) != null) {

                    String trimmedLine = currentLine.trim();
                    if (!trimmedLine.startsWith(this.intake)) {
                        writer.write(currentLine + System.getProperty("line.separator"));
                    }
                }
            }

        }

        inputFile.delete();
        boolean successfull = tempFile.renameTo(inputFile);
        System.out.println(successfull);

    }

}
