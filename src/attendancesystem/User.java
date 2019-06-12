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
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class User {

    private String userName;
    private String passWord;

    public static String currentUser;
    private User.Type usertype;

    public enum Type {
        ADMIN, LECTURER, STUDENT,
    }

    public boolean hasPermission1(String un) {
        this.userName = un;
        return this.userName.contains("S");
    }

    public boolean hasPermission2(String un) {
        this.userName = un;
        return this.userName.contains("T");
    }

    public boolean rootPermission(String un) {
        this.userName = un;
        return this.userName.equals("root");
    }

    public void priviledge(User.Type utype) {

        this.usertype = utype;
        switch (this.usertype) {
            case ADMIN:
                JOptionPane.showMessageDialog(null, "Welcome " + currentUser + ", you have root priviledges");
                AdminMenu superuser = new AdminMenu();
                superuser.setVisible(true);
                break;

            case LECTURER:
                JOptionPane.showMessageDialog(null, "Welcome " + currentUser + ", you have lecturer priviledges");
                LectMenu lect = new LectMenu();
                lect.setVisible(true);
                break;

            case STUDENT:
                JOptionPane.showMessageDialog(null, "Welcome " + currentUser + ", you have normal priviledges");
                StudMenu stud = new StudMenu();
                stud.setVisible(true);
                break;

            default:
                System.out.println("No desc available.");
                break;
        }
    }

    public HashMap<String, String> readFile() throws IOException {
        HashMap<String, String> map = new HashMap<>();
        File file = new File("logindb.txt");
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";", 2);
                if (parts.length >= 2) {
                    String un = parts[0];
                    String pw = parts[1];
                    map.put(un, pw);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
        }
        for (String un : map.keySet()) {
            System.out.println(un + ":" + map.get(un));
        }
        return map;
    }

    public boolean authenticate(String un, String pw) throws IOException {

        this.userName = un;
        this.passWord = pw;
        HashMap<String, String> maps = readFile();
        if (maps.containsKey(this.userName)) {
            String passwords = maps.get(this.userName);
            if (passwords.equals(this.passWord)) {
                return true;
            }
        }
        return false;
    }

    public void delete(String id) throws FileNotFoundException, IOException {
        
        this.userName = id;
        File inputFile = new File("logindb.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

                String currentLine;

                while ((currentLine = reader.readLine()) != null) {

                    String trimmedLine = currentLine.trim();
                    if (!trimmedLine.startsWith(this.userName)) {
                        writer.write(currentLine + System.getProperty("line.separator"));
                    }
                }
            }

        }

        inputFile.delete();
        boolean successfull = tempFile.renameTo(inputFile);
        System.out.println(successfull);

    }

    public void add(String un, String pw) throws IOException {
        
        this.userName = un;
        this.passWord = pw;
        try (FileWriter fw = new FileWriter("logindb.txt", true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

            out.println(this.userName + ";" + this.passWord);

        }
    }

}
