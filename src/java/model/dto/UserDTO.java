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
    private String name;
    private String address;
    private String gender;
    private String roleID;
    private boolean status;
    private String courseName;
    private String className;
    
    
    public UserDTO() {
    }

    public UserDTO(String phone, String password, String name, String address, String gender, String roleID, boolean status, String courseName) {
        this.phone = phone;
        this.password = password;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.roleID = roleID;
        this.status = status;
        this.courseName = courseName;
    }

    public UserDTO(String phone, String password, String name, String address, String gender, String roleID, boolean status, String courseName, String className) {
        this.phone = phone;
        this.password = password;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.roleID = roleID;
        this.status = status;
        this.courseName = courseName;
        this.className = className;
    }
    
    



    public UserDTO(String phone, String password, String name, String address, String gender, String roleID, boolean status) {
        this.phone = phone;
        this.password = password;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.roleID = roleID;
        this.status = status;
    }

    public UserDTO(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public UserDTO(String phone, String name, String address, String gender, String roleID, boolean status) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.roleID = roleID;
        this.status = status;
    }

    public UserDTO(String phone, String name, String role) {
        this.phone = phone;
        this.name = name;
        this.roleID = role;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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
        return "UserDTO{" + "phone=" + phone + ", password=" + password + ", name=" + name + ", address=" + address + ", gender=" + gender + ", roleID=" + roleID + ", status=" + status + '}';
    }




}
