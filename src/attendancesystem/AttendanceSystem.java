/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;

import java.io.IOException;


/**
 *
 * @author acer
 */
public class AttendanceSystem {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        MainMenu login = new MainMenu();
        login.setVisible(true);
    }
    
}
