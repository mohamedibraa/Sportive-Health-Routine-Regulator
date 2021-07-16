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
public class member extends person {
    private int member_id;
private float weight;
    private float height;
private String type;
      Diet_routine Diet;
      Exercise_routine exercise;

    public member(int member_id, float weight, float height, String type, String name, String gender, float age, String user_name, String password) {
        super(name, gender, age, user_name, password);
        this.member_id = member_id;
        this.weight = weight;
        this.height = height;
        this.type = type;
        this.Diet = Diet;
        this.exercise = exercise;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
      
         
    public float getWeight() {
        return weight;
        
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
    
    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

   
}
