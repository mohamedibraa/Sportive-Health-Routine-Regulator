/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestproject;

import static bestproject.employee.members;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Admin implements methods_for_admin_and_emloyee {
  public static   ArrayList<employee> employees = new ArrayList<>();
   final public String username ="admin";
   final public String password ="admin";

    public Admin(String user_name,String password) {
//        user_name="admin";
//        password="admin";
    }

    public Admin() {
    }

  @Override
   public DefaultTableModel display() {
        Display_emp d1 = new Display_emp();
   
     DefaultTableModel model =(DefaultTableModel) d1.jTable1.getModel();
        
       Object rowData[] = new Object[5];
             
             
       for (int i=0; employees.size()>i;i++){
          
           rowData[0]=  employees.get(i).getUser_name();
           rowData[1]=  employees.get(i).getName();
           rowData[2]=  employees.get(i).getEmpid();
           rowData[3]=  employees.get(i).getGender();
           rowData[4]=  employees.get(i).getAge();
           model.addRow( rowData);
       }
        
    
              return model;
   }

   

   
     public boolean add(String name, String gender, float age, String user_name, String password, int id) 
           
    {
        int isfound= search(id);
        if (isfound==-1  &&  Admin.search2(user_name, password) == -1)
        {
        
            employees.add(new employee(  id, name,  gender,  age,  user_name,  password));

            return true;
           
        }
        else 
        { 

            JOptionPane.showMessageDialog(null, "the Employee is already Exist");
              return false;
        }            
        
    }
    @Override
    public int search(int tripid) {  
          int s =-1;       
         for (int i=0;i<employees.size();i++){
             if (employees.get(i).getEmpid()==tripid){
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

     public void save() throws IOException
    {
         if(members.size()!=0)
        {
            File f2= new File("Bestmem");
            f2.createNewFile();
            FileWriter fm = new FileWriter(f2);
            PrintWriter pm=new PrintWriter(fm);
            
            
            for(int i=0;i<members.size();i++)
            {
              String mem = members.get(i).getMember_id()+":"+members.get(i).getWeight()+":"+members.get(i).getHeight()
                    +":"+members.get(i).getType()+":"+members.get(i).getName()+":"+members.get(i).getGender()
                    +":"+members.get(i).getAge()+":"+members.get(i).getUser_name()+":"+members.get(i).getPassword();
             pm.println(mem);
            }
            fm.close();
            pm.close();
            //JOptionPane.showMessageDialog(null, " Data Saved");
        } 
         
        if(employees.size()!=0)
        {
            File f1= new File("BestEmp");
            f1.createNewFile(); 
            FileWriter fe = new FileWriter(f1); 
            PrintWriter pe = new PrintWriter(fe);
            
            for(int i=0;i<employees.size();i++)
            {
               String emp=employees.get(i).getEmpid()+":"+employees.get(i).getName()+":"+employees.get(i).getGender()+":"+employees.get(i).getAge()
                   +":"+employees.get(i).getUser_name()+":"+employees.get(i).getPassword()+":";
                
               pe.println(emp);
            }
            fe.close();
            pe.close();
           // JOptionPane.showMessageDialog(null, "Saved");
        }
               
    }
    }

   
            

  
    
