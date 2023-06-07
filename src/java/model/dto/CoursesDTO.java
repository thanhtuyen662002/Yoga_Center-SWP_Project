/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

import java.io.Serializable;

/**
 *
 * @author HP Pro
 */
public class CoursesDTO implements Serializable{
    private int courseID;
    private String courseName;
    private String description;
    private float price;
    private String courseImage;
    private boolean status;

    public CoursesDTO() {
    }
    
    public CoursesDTO(int courseID, String courseName, String description, String courseImage, float price, boolean status) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.courseImage = courseImage;
        this.price = price;
        this.status = status;
    }


    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    @Override
    public String toString() {
        return "courseID=" + courseID + ", courseName=" + courseName + ", description=" + description + ", courseImage=" + courseImage + ", price=" + price + ", status=" + status;
    }

 
    
    
}
