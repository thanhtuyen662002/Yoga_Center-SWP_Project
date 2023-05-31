/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yogacenter.dto;

/**
 *
 * @author dell
 */
public class RoomDTO_Nhat {
    private String id;
    private String locate;
    private String roomNumber;
    private boolean status;
    private String description;

    public RoomDTO_Nhat() {
    }

    public RoomDTO_Nhat(String id, String locate, String roomNumber, boolean status) {
        this.id = id;
        this.locate = locate;
        this.roomNumber = roomNumber;
        this.status = status;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RoomDTO_Nhat{" + "id=" + id + ", locate=" + locate + ", roomNumber=" + roomNumber + ", status=" + status + ", description=" + description + '}';
    }
    
    
}
