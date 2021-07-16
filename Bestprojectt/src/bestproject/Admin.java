/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestproject;

import static bestproject.employee.members;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Admin implements methods_for_admin_and_emloyee {
  public static   ArrayList<employee> employees = new ArrayList<>();
   

    // public Admin(String name, String gender, float age, String user_name, String password) {
       // super(name, gender, age, user_name, password);
  // }

    public Admin(String user_name,String password) {
        user_name="Admin";
        password="admin";
    }

 

  

  
    

    @Override
   public final void display() {
      /*  display d1 = new display();
       add("safaa", "7amada", 100.0f, "kalamata","wza", 12);
        DefaultTableModel model =(DefaultTableModel) d1.jTable1.getModel();
       Object rowData[] = new Object[5];
              if ( employees.size()==0){
             System.out.println("fadyaa");}
              else {
       for (int i=0; employees.size()>i;i++){
           System.out.println("gowa el for");
           rowData[0]=  employees.get(i).getUser_name();
           System.out.println(employees.get(i).getUser_name());
           rowData[1]=  employees.get(i).getName();
            rowData[2]=  employees.get(i).getEmpid();
           rowData[3]=  employees.get(i).getGender();
           rowData[4]=  employees.get(i).getAge();
           model.addRow( rowData);
       }
        
    }*/}

   


   
      
     public boolean add(String name, String gender, float age, String user_name, String password, int id) 
           
    {
        int isfound= search(id);
        if (isfound==-1  &&  Admin.search2(user_name, password) == -1){
        
     employees.add(new employee(  id, name,  gender,  age,  user_name,  password));
   //  System.out.println("added successfully ");
     return true;
           
    }
        else { 
          
          
            JOptionPane.showMessageDialog(null, "the Employee is ready Exist");
              return false;
        }            
        
    }
    @Override
    public int search(int id) {
     
          int s =-1;
        
         for (int i=0;i<employees.size();i++){
             if (employees.get(i).getEmpid()==id){
                   s = i;
                         
             
            }
            
     }
         
         return s;
     }
     public static int search2(String user_name,String password)
    {
        int s =-1;
        
         for (int i=0;i<employees.size();i++)
         {
             if (employees.get(i).getUser_name().equals(user_name) && employees.get(i).getPassword().equals(password))
             {
                   s = i;
             }
            
         }
         
         return s;
    }

  

    @Override
    public boolean remove(int id ) {
         int j=search(id);
         boolean found;
         if(j!=-1){
                   employees.remove(j);
                   found= true;
                   
               }
               else
         {
                 found= false;  
         }
         return found;
         
    }

    
    }

   
            

  
    
