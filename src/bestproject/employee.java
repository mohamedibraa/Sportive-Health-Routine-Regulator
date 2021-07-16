/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestproject;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
 public class employee extends person implements  methods_for_admin_and_emloyee{

    static void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 private int emp_id;

 public static ArrayList<member> members = new ArrayList<>();

 
public employee(int emp_id, String name, String gender, float age, String user_name, String password) {
        super(name, gender, age, user_name, password);
        this.emp_id = emp_id;
    }

   public employee() {
   }
 
    public int getEmpid() {
        return emp_id;
    }
    public void setEmpid(int empid) {
        this.emp_id = empid;
    }

  
    public boolean add(int member_id, float weight, float height, String type, String name, String gender, float age, String user_name, String password){
        
        int isfound=search(member_id);
        if (isfound==-1 && employee.search3(user_name, password) == -1)
        {
         members.add(new member( member_id, weight,  height, type, name, gender, age, user_name, password));
         JOptionPane.showMessageDialog(null, "added successfully");
        return true;
        }
        else
        {
             JOptionPane.showMessageDialog(null, "the member is already Exist");
            return false;
            
        }

    }
    

    @Override
    public int  search(int id) {
      int s =-1;
        
         for (int i=0;i<members.size();i++){
             if (members.get(i).getMember_id()==id){
                   s = i;
             
            }     
     }
         
         return s;
     }
    
    public static int search3(String user_name,String password)
    {
        int s =-1;
        
         for (int i=0;i<members.size();i++)
         {
             if (members.get(i).getUser_name().equals(user_name) && members.get(i).getPassword().equals(password))
             {
                   s = i;
             }
            
         }
         
         return s;
    }

    @Override
    public boolean remove(int id) {
     int j=search(id);
         boolean found;
         if(j!=-1){
                   members.remove(j);
                   found= true;
                   
               }
               else
         {
                 found= false;  
         }
         return found;
         
    }

     @Override
    public DefaultTableModel display() {
         display_member d1 = new display_member ();
         DefaultTableModel model =(DefaultTableModel) d1.jTable1.getModel();
         Object rowData[] = new Object[8];
       for (int i=0; members.size()>i;i++)
       { 
           rowData[0]= members.get(i).getUser_name();
           rowData[1]= members.get(i).getName();
           rowData[2]= members.get(i).getMember_id();
           rowData[3]= members.get(i).getType();
           rowData[4]= members.get(i).getHeight();
           rowData[5]= members.get(i).getWeight();
           rowData[6]= members.get(i).getGender();
           rowData[7]= members.get(i).getAge();
           model.addRow(rowData);

       }
       return model;
    }

    

}
   

