/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yogacenter.dto;

/**
 *
 * @author HP Pro
 */
public class CoursesDTO {
    private int courseID;
    private String courseName;
    private String description;
    private int price;
    private String courseImage;

    public CoursesDTO() {
    }

    public CoursesDTO(int courseID, String courseName, String description, String courseImage,int price) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.courseImage = courseImage;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    @Override
    public String toString() {
        return "courseID=" + courseID + ", courseName=" + courseName + ", description=" + description + ", courseImage=" + courseImage + ", price=" + price;
    }

 
    
    
}
