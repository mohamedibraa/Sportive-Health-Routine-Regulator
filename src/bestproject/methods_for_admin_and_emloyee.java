/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestproject;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public interface methods_for_admin_and_emloyee {
     
     public abstract DefaultTableModel  display();
     public abstract  int  search(int id);
     public abstract  boolean remove(int id);
    
}
