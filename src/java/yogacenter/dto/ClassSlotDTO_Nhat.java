/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yogacenter.dto;

import java.sql.Time;

/**
 *
 * @author dell
 */
public class ClassSlotDTO_Nhat {
    private int id;
    private Time startTime;
    private Time endTime;

    public ClassSlotDTO_Nhat() {
    }

    public ClassSlotDTO_Nhat(int id, Time startTime, Time endTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ClassSlotDTO_Nhat{" + "id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + '}';
    }
    
    
}
