/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class assignLect extends lectDbase {
    
    private String incode;

    public assignLect() {
        super();
        this.lectCheck = -1;
    }

    public ArrayList<String> assign(String code, String id, String subject) throws IOException {

        ArrayList<String> temp = new ArrayList<>();
        this.incode = code;
        String get_id = getID(id);
        String get_module = getModule(subject);
        String currentLine;

        File file = new File("intakedb.txt");
        try (Scanner scan = new Scanner(file)) {

            while (scan.hasNextLine()) {

                currentLine = scan.nextLine();
                String[] list = currentLine.split(";");
                if (currentLine.contains(this.incode)) {
                    System.out.println("found");
                    temp.addAll(Arrays.asList(list));
                    for (int i = 0; temp.size() > i; i++) {

                        if (temp.get(i).equals(get_module) && temp.get(i + 1).equals("n/a")) {

                            temp.set(i + 1, get_id);
                            lectCheck = 0;
                            System.out.println(temp);
                        } else {
                            System.out.println("already assigned");
                        }
                    }
                    break;
                } else {
                    System.out.println("not found");
                }
            }

        }
        return temp;
    }

    public ArrayList<String> unassign(String code, String id, String subject) throws IOException {

        ArrayList<String> temp = new ArrayList<>();
        this.incode = code;
        String get_module = getModule(subject);
        String currentLine;
        
        File file = new File("intakedb.txt");
        try (Scanner scan = new Scanner(file)) {

            while (scan.hasNextLine()) {

                currentLine = scan.nextLine();
                String[] list = currentLine.split(";");
                if (currentLine.contains(this.incode)) {
                    System.out.println("found");
                    temp.addAll(Arrays.asList(list));
                    for (int i = 0; temp.size() > i; i++) {

                        if (temp.get(i).equals(get_module) && !temp.get(i + 1).equals("n/a")) {

                            temp.set(i + 1, "n/a");
                            lectCheck = 0;
                            System.out.println(temp);
                        } else {
                            System.out.println("already assigned");
                        }
                    }
                    break;
                } else {
                    System.out.println("not found");
                }
            }

        }
        return temp;
    }

    @Override
    public boolean validation() {
        return super.validation();
    }

}
