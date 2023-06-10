/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dto;

/**
 *
 * @author dell
 */
public class UserDTO {

    private String phone;
    private String password;
    private String userlogin;
    private String name;
    private String address;
    private String gender;
    private String roleID;
    private boolean status;

    public UserDTO() {
    }

    public UserDTO(String phone, String password, String userlogin, String name, String address, String gender, String role, boolean status) {
        this.phone = phone;
        this.password = password;
        this.userlogin = userlogin;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.roleID = role;
        this.status = status;
    }

    public UserDTO(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public UserDTO(String phone, String name, String role) {
        this.phone = phone;
        this.name = name;
        this.roleID = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserlogin() {
        return userlogin;
    }

    public void setUserlogin(String userlogin) {
        this.userlogin = userlogin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User" + "phone=" + phone + ", password=" + password + ", userlogin=" + userlogin + ", name=" + name + ", address=" + address + ", gender=" + gender + ", role=" + roleID + ", status=" + status + '}';
    }

}
