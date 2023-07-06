/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

/**
 *
 * @author HOANG ANH
 */
public class FeedbackDTO {
    private int courseID;
    private String cusPhone;
    private String comment;
    private String dayup;
    private boolean status;
    private String cusName;
    private String courseName;
    
    public FeedbackDTO() {
    }

    public FeedbackDTO(int courseID, String cusPhone, String comment, String dayup, boolean status, String cusName, String courseName) {
        this.courseID = courseID;
        this.cusPhone = cusPhone;
        this.comment = comment;
        this.dayup = dayup;
        this.status = status;
        this.cusName = cusName;
        this.courseName = courseName;
    }

    
    public FeedbackDTO(int courseID, String cusPhone, String comment, boolean status) {
        this.courseID = courseID;
        this.cusPhone = cusPhone;
        this.comment = comment;
        this.status = status;
    }

    public FeedbackDTO(int courseID, String cusPhone, String comment, String dayup, boolean status) {
        this.courseID = courseID;
        this.cusPhone = cusPhone;
        this.comment = comment;
        this.dayup = dayup;
        this.status = status;
    }

    public FeedbackDTO(int courseID, String cusPhone, String comment, String dayup, boolean status, String cusName) {
        this.courseID = courseID;
        this.cusPhone = cusPhone;
        this.comment = comment;
        this.dayup = dayup;
        this.status = status;
        this.cusName = cusName;
    }

    public String getDayup() {
        return dayup;
    }

    public void setDayup(String dayup) {
        this.dayup = dayup;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
    
    

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }



    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FeedbackDTO{" + "courseID=" + courseID + ", cusPhone=" + cusPhone + ", comment=" + comment + ", status=" + status + '}';
    }
    
    
    
    
}
