/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestproject;
import static bestproject.Admin.employees;
import static bestproject.employee.members;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Bestproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       // JOptionPane.showMessageDialog(null, "welcome");
        person p1=new employee();
        person p2 =new member();
        employee emp;
        member mem;
        if(p1 instanceof employee)
           {
                File f1= new File("BestEmp");
        if(f1.exists())
        {
          
        BufferedReader bufReader = new BufferedReader(new FileReader("BestEmp"));
        
       // ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();
        
        while (line != null)
        {
            try{
                
            
           String[] ss=line.split(":");
           emp=(employee)p1;
           emp = new employee(Integer.valueOf(ss[0]), ss[1], ss[2], Float.parseFloat(ss[3]),ss[4], ss[5]);
           employees.add(emp); 
           line = bufReader.readLine();
           
            }
            catch(IOException x)
            {
                 JOptionPane.showMessageDialog(null, "can not read employee");
            }
        }
        bufReader.close();
        }
           
           }
       
        if(p2 instanceof member)
           {
         File f2= new File("Bestmem");
        if(f2.exists())
        {
          
        BufferedReader bufReader = new BufferedReader(new FileReader("Bestmem"));
        
       // ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();
        
        while (line != null)
        {
            try{
                
            
           String[] ss=line.split(":");
           mem=(member)p2;
           mem = new member(Integer.valueOf(ss[0]),Float.parseFloat(ss[1]),Float.parseFloat(ss[2]), ss[3], ss[4], ss[5], Float.parseFloat(ss[6]), ss[7], ss[8]);
           members.add(mem); 
           line = bufReader.readLine();
            }
              catch(IOException x)
            {
                 JOptionPane.showMessageDialog(null, "can not read member");
            }
        }
        bufReader.close();
        }
           }
      
            try
        {
            
            JFXPanel sound=new JFXPanel();
        String uri=new File("dance.mp3").toURI().toString();
        new MediaPlayer(new Media(uri)).play();
        }
        catch (Exception ex)
        {
        JOptionPane.showMessageDialog(null, ex);
 
        }
            
    welcome uu=new welcome();
    uu.setVisible(true);
    uu.pack();
    uu.setLocationRelativeTo(null);

    }

    private static Object File(String bestEmp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
