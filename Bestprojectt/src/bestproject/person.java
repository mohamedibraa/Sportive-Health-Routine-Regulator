/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestproject;
import java.util.*;
/**
 *
 * @author HP
 */
public  abstract class  person {
private String name;
private  String gender;
private  float age;
private String user_name;
private String password;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public person(String name, String gender, float age, String user_name, String password) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.user_name = user_name;
        this.password = password;
    }

public person(String user_name, String password)   //**********************************
{
     this.user_name = user_name;
     this.password = password;
}

   

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public float getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(float age) {
        this.age = age;
    }
    

}
