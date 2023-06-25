package model.dto;


public class GuestDTO {
    private int signupID;
    private String fullName;
    private String phone;
    private String address;
    private String gender;
    private String courseName;
    private int courseID;
    private float price;
    private boolean status;
    private boolean flag;

    public GuestDTO() {
    }

    public GuestDTO(int signupID, String fullName, String phone, String address, String gender, int courseID, String courseName, float price, boolean status, boolean flag) {
        this.signupID = signupID;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.courseID = courseID;
        this.courseName = courseName;
        this.price = price;
        this.status = status;
        this.flag = flag;
    }

    public GuestDTO(int signupID, String fullName, String phone, String address, int courseID, float price, boolean status, boolean flag) {
        this.signupID = signupID;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.courseID = courseID;
        this.price = price;
        this.status = status;
        this.flag = flag;
    }

    public GuestDTO(int signupID, String fullName, String phone, String address, String gender, int courseID, float price, boolean status, boolean flag) {
        this.signupID = signupID;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.courseID = courseID;
        this.price = price;
        this.status = status;
        this.flag = flag;
    }
    
    

    public GuestDTO(int courseID, String courseName) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
    public int getSignupID() {
        return signupID;
    }

    public void setSignupID(int signupID) {
        this.signupID = signupID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "GuestDTO{" + "signupID=" + signupID + ", fullName=" + fullName + ", phone=" + phone + ", address=" + address + ", gender=" + gender + ", courseName=" + courseName + ", courseID=" + courseID + ", price=" + price + ", status=" + status + ", flag=" + flag + '}';
    }

}
