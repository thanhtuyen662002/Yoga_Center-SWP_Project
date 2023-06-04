/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

import java.sql.Date;

/**
 *
 * @author HP Pro
 */
public class ScheduleDTO_Nhat {

    private int id;
    private ClassDTO_Nhat classStudy;
    private UserDTO pt;
    private ClassSlotDTO_Nhat slot;
    private RoomDTO_Nhat room;
    private Date date;
    private UserDTO customer;

    public ScheduleDTO_Nhat(int id, ClassDTO_Nhat classStudy, UserDTO pt, ClassSlotDTO_Nhat slot, RoomDTO_Nhat room, Date date, UserDTO customer) {
        this.id = id;
        this.classStudy = classStudy;
        this.pt = pt;
        this.slot = slot;
        this.room = room;
        this.date = date;
        this.customer = customer;
    }

    public UserDTO getCustomer() {
        return customer;
    }

    public void setCustomer(UserDTO customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserDTO getPt() {
        return pt;
    }

    public void setPt(UserDTO pt) {
        this.pt = pt;
    }

    public ScheduleDTO_Nhat() {
    }

    public ClassDTO_Nhat getClassStudy() {
        return classStudy;
    }

    public void setClassStudy(ClassDTO_Nhat classStudy) {
        this.classStudy = classStudy;
    }

    public UserDTO getPtPhone() {
        return pt;
    }

    public void setPtPhone(UserDTO ptPhone) {
        this.pt = ptPhone;
    }

    public ClassSlotDTO_Nhat getSlot() {
        return slot;
    }

    public void setSlot(ClassSlotDTO_Nhat slot) {
        this.slot = slot;
    }

    public RoomDTO_Nhat getRoom() {
        return room;
    }

    public void setRoom(RoomDTO_Nhat room) {
        this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    

    @Override
    public String toString() {
        return "ScheduleDTO_Nhat{" + "classStudy=" + classStudy + ", pt=" + pt + ", slot=" + slot + ", room=" + room + ", date=" + date + ", customer=" + customer + '}';
    }

}
