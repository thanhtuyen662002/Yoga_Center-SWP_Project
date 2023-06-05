/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

/**
 *
 * @author nguye
 */
public class EventDTO {
    private int eventID;
    private String eventName;
    private int courseID;
    private String description;
    private float discount;
    private String daystart;
    
    public EventDTO() {
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getDaystart() {
        return daystart;
    }

    public void setDaystart(String daystart) {
        this.daystart = daystart;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    public EventDTO(int eventID, String eventName, int courseID, String description, float discount, String daystart) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.courseID = courseID;
        this.description = description;
        this.discount = discount;
        this.daystart = daystart;
    }

    @Override
    public String toString() {
        return "VoucherDTO{" + "eventID=" + eventID + ", eventName=" + eventName + ", courseID=" + courseID + ", description="+ description + ", discount=" + discount + ", daystart=" + daystart + '}';
    }
    
}
