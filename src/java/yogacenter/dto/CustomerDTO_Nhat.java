/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yogacenter.dto;

/**
 *
 * @author dell
 */
public class CustomerDTO_Nhat {
    private String id;
    private String name;
    private String phone;
    private String address;
    private boolean status;

    public CustomerDTO_Nhat() {
    }

    public CustomerDTO_Nhat(String id, String name, String phone, String address, boolean status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CustomerDTO_Nhat{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", status=" + status + '}';
    }
    
    
}
