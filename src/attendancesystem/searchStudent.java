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
public class searchStudent implements searchPerson {
    
    private int check;
    ArrayList<String> temp = new ArrayList<>();

    public searchStudent() {
        this.check = -1;
    }
    
    
    @Override
    public void search (String id) throws IOException {
        
        String currentLine;
        String verifyWord = id;
        File file = new File("studentdb.txt");
        try (Scanner scan = new Scanner(file)) {

            while(scan.hasNext()) {
                
                currentLine = scan.next();
                String [] list = currentLine.split(";");
                if(currentLine.contains(verifyWord)) {
                    System.out.println("found");
                    temp.addAll(Arrays.asList(list));
                    /*temp.add(list[0]);
                    temp.add(list[1]); */
                    System.out.println(temp.get(2));
                    check = 0;
                    break;
                }
                else {
                    System.out.println("not found");
                }
            }

        }
    }
    
    
    @Override
    public boolean validation() {
        return check == 0;
    }
    
    @Override
    public ArrayList<String> getList() {
        return temp;
    }
}
