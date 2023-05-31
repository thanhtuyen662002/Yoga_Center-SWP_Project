/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yogacenter.dto;

import java.sql.Date;

/**
 *
 * @author HP Pro
 */
public class ScheduleDTO_Nhat {
    private ClassDTO_Nhat classStudy;
    private UserDTO_Nhat pt;
    private ClassSlotDTO_Nhat slot;
    private RoomDTO_Nhat room;
    private Date date;
    private CustomerDTO_Nhat customer;

    public ScheduleDTO_Nhat(ClassDTO_Nhat classStudy, UserDTO_Nhat pt, ClassSlotDTO_Nhat slot, RoomDTO_Nhat room, Date date, CustomerDTO_Nhat customer) {
        this.classStudy = classStudy;
        this.pt = pt;
        this.slot = slot;
        this.room = room;
        this.date = date;
        this.customer = customer;
    }

    public ScheduleDTO_Nhat() {
    }

    public ClassDTO_Nhat getClassStudy() {
        return classStudy;
    }

    public void setClassStudy(ClassDTO_Nhat classStudy) {
        this.classStudy = classStudy;
    }

    public UserDTO_Nhat getPtPhone() {
        return pt;
    }

    public void setPtPhone(UserDTO_Nhat ptPhone) {
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

    public CustomerDTO_Nhat getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO_Nhat customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "ScheduleDTO_Nhat{" + "classStudy=" + classStudy + ", pt=" + pt + ", slot=" + slot + ", room=" + room + ", date=" + date + ", customer=" + customer + '}';
    }
    
    
    
}
