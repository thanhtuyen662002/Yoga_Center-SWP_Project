/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yogacenter.dto;

/**
 *
 * @author dell
 */
public class UserDTO_Nhat {

    private String phone;
    private String password;
    private String userlogin;
    private String name;
    private String address;
    private String gender;
    private String role;
    private boolean status;

    public UserDTO_Nhat() {
    }

    public UserDTO_Nhat(String phone, String password, String userlogin, String name, String address, String gender, String role, boolean status) {
        this.phone = phone;
        this.password = password;
        this.userlogin = userlogin;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.role = role;
        this.status = status;
    }

    public UserDTO_Nhat(String phone, String name) {
        this.phone = phone;
        this.name = name;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserDTO_Nhat{" + "phone=" + phone + ", password=" + password + ", userlogin=" + userlogin + ", name=" + name + ", address=" + address + ", gender=" + gender + ", role=" + role + ", status=" + status + '}';
    }

}
