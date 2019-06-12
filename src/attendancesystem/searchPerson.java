/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public interface searchPerson {
    
    public void search(String id) throws IOException;
    
    public boolean validation();
    
    public ArrayList<String> getList();
    
    
}
