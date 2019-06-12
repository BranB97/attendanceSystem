/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author acer
 */
public interface person {
    
    public void add(String id, String firstName, String lastName, String email, String num, String placeholder) throws IOException;
    
    public void verifyID(String id) throws IOException;
    
    public boolean validation();
    
    public void delete(String id) throws FileNotFoundException, IOException;
    
    
}
