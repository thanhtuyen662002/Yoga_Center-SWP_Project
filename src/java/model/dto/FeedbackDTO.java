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
    private String cusphone;
    private String comment;
    private String dayup;
    private boolean status;

    public FeedbackDTO(int courseID, String cusphone, String comment, boolean status) {
        this.courseID = courseID;
        this.cusphone = cusphone;
        this.comment = comment;
        this.status = status;
    }

    public FeedbackDTO(int courseID, String cusphone, String comment, String dayup, boolean status) {
        this.courseID = courseID;
        this.cusphone = cusphone;
        this.comment = comment;
        this.dayup = dayup;
        this.status = status;
    }

    public String getDayup() {
        return dayup;
    }

    public void setDayup(String dayup) {
        this.dayup = dayup;
    }
    
    
    
    

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCusphone() {
        return cusphone;
    }

    public void setCusphone(String cusphone) {
        this.cusphone = cusphone;
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
        return "FeedbackDTO{" + "courseID=" + courseID + ", cusphone=" + cusphone + ", comment=" + comment + ", status=" + status + '}';
    }
    
    
    
    
}
