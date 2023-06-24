/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

import java.time.LocalDate;

/**
 *
 * @author HP Pro
 */
public class BillDTO {
    private int signupID;
    private int courseID;
    private String phone; 
    private String name; 
    private float price; 
    private String time;
    private String courseName;

    public BillDTO() {
    }

    public BillDTO(int signupID, int courseID, String phone, String name, float price, String time, String courseName) {
        this.signupID = signupID;
        this.courseID = courseID;
        this.phone = phone;
        this.name = name;
        this.price = price;
        this.time = time;
        this.courseName = courseName;
    }

    public BillDTO(int courseID) {
        this.courseID = courseID;
    }

    public BillDTO(int signupID, String name, float price) {
        this.signupID = signupID;
        this.name = name;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
    public int getSignupID() {
        return signupID;
    }

    public void setSignupID(int signupID) {
        this.signupID = signupID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "BillDTO{" + "signupID=" + signupID + ", courseID=" + courseID + ", phone=" + phone + ", name=" + name + ", price=" + price + ", time=" + time + ", courseName=" + courseName + '}';
    }

  
    
}
