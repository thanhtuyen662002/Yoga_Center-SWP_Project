/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

import java.io.Serializable;
import java.sql.Time;

/**
 *
 * @author HP Pro
 */
public class CoursesDTO implements Serializable {

    private int courseID;
    private String courseName;
    private String description;
    private float price;
    private String courseImage;
    private String courseData;
    private Boolean status;
    private int numberOfMonths;
    private int slotID;
    private Time startTime;
    private Time endTime;
    private Time timeToCome;

    public CoursesDTO() {
    }

    public CoursesDTO(int courseID, String courseName, String description, int numberOfMonths, String courseImage, String courseData, float price, Boolean status) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.numberOfMonths = numberOfMonths;
        this.price = price;
        this.courseImage = courseImage;
        this.courseData = courseData;
        this.status = status;
    }

    public CoursesDTO(int courseID, String courseName, String description, String courseImage, float price, boolean status) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.courseImage = courseImage;
        this.price = price;
        this.status = status;
    }

    public CoursesDTO(String courseName, String description, String courseImage, float price) {
        this.courseName = courseName;
        this.description = description;
        this.price = price;
        this.courseImage = courseImage;
    }

    public CoursesDTO(int courseID, String courseName, String description) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
    }

    public CoursesDTO(String courseName, String description, float price, String courseData, int numberOfMonths) {
        this.courseName = courseName;
        this.description = description;
        this.price = price;
        this.courseData = courseData;
        this.numberOfMonths = numberOfMonths;
    }

    public CoursesDTO(int courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public CoursesDTO(int slotID, Time startTime, Time endTime) {
        this.slotID = slotID;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public CoursesDTO(Time timeToCome) {
        this.timeToCome = timeToCome;
    }



    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Time getTimeToCome() {
        return timeToCome;
    }

    public void setTimeToCome(Time timeToCome) {
        this.timeToCome = timeToCome;
    }

    public int getSlotID() {
        return slotID;
    }

    public void setSlotID(int slotID) {
        this.slotID = slotID;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public String getCourseData() {
        return courseData;
    }

    public void setCourseData(String courseData) {
        this.courseData = courseData;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
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
        return "CoursesDTO{" + "courseID=" + courseID + ", courseName=" + courseName + ", description=" + description + ", price=" + price + ", courseImage=" + courseImage + ", courseData=" + courseData + ", status=" + status + ", numberOfMonths=" + numberOfMonths + ", slotID=" + slotID + ", startTime=" + startTime + ", endTime=" + endTime + ", timeToCome=" + timeToCome + '}';
    }

    

}
