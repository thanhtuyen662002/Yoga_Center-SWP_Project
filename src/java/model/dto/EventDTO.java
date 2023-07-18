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
    private String courseName;
    private float discount;
    private String daystart;
    private String dayend;
    private String image;
    private String data;
    private boolean status;
    private boolean flag;

    public EventDTO(int eventID, String eventName, int courseID, float discount, String daystart, String dayend, String image, String data, boolean status) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.courseID = courseID;
        this.discount = discount;
        this.daystart = daystart;
        this.dayend = dayend;
        this.image = image;
        this.data = data;
        this.status = status;
    }

    public EventDTO(String eventName, int courseID, float discount, String daystart, String dayend, String image, String data, boolean status) {
        this.eventName = eventName;
        this.courseID = courseID;
        this.discount = discount;
        this.daystart = daystart;
        this.dayend = dayend;
        this.image = image;
        this.data = data;
        this.status = status;
    }

   

    public EventDTO(String eventName, int courseID, String courseName, float discount, String daystart, String dayend, String image, String data, boolean status) {
        this.eventName = eventName;
        this.courseID = courseID;
        this.courseName = courseName;
        this.discount = discount;
        this.daystart = daystart;
        this.dayend = dayend;
        this.image = image;
        this.data = data;
        this.status = status;
    }

    public EventDTO(int eventID, String eventName, int courseID, String courseName, float discount, String daystart, String dayend, String image, String data, boolean flag) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.courseID = courseID;
        this.courseName = courseName;
        this.discount = discount;
        this.daystart = daystart;
        this.dayend = dayend;
        this.image = image;
        this.data = data;
        this.flag = flag;
    }

    public EventDTO(int eventID, float discount) {
        this.eventID = eventID;
        this.discount = discount;
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

    public String getDayend() {
        return dayend;
    }

    public void setDayend(String dayend) {
        this.dayend = dayend;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "EventDTO{" + "eventID=" + eventID + ", eventName=" + eventName + ", courseID=" + courseID + ", discount=" + discount + ", daystart=" + daystart + ", dayend=" + dayend + ", image=" + image + ", data=" + data + ", status=" + status + '}';
    }

}
    