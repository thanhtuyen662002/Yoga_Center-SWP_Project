/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yogacenter.dto;

/**
 *
 * @author HP Pro
 */
public class UserDTO {

    private int phone;
    private String userLogin;
    private String name;
    private String password;
    private String address;
    private String gender;
    private String roleID;
    private byte status;

    public UserDTO() {
    }

    public UserDTO(int phone, String userLogin, String name, String password, String address, String gender, String roleID, byte status) {
        this.phone = phone;
        this.userLogin = userLogin;
        this.name = name;
        this.password = password;
        this.address = address;
        this.gender = gender;
        this.roleID = roleID;
        this.status = status;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "phone=" + phone + ", userLogin=" + userLogin + ", name=" + name + ", password=" + password + ", address=" + address + ", gender=" + gender + ", roleID=" + roleID + ", status=" + status + '}';
    }

}
