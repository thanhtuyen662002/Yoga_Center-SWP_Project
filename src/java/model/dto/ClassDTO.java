package model.dto;


public class ClassDTO {
    private int classID;
    private int courseID;
    private int capacity;
    private String ptPhone;
    private String ptName;
    private String className;
    private String description;
    private int totalSession;
    private boolean status;
    private String courseName;
    private String staffName;
    private int numberOfMonths;

    
    public ClassDTO() {
    }

    public ClassDTO(int classID, int courseID, int capacity, String ptName, String className, String description, int totalSession, boolean status) {
        this.classID = classID;
        this.courseID = courseID;
        this.capacity = capacity;
        this.ptName = ptName;
        this.className = className;
        this.description = description;
        this.totalSession = totalSession;
        this.status = status;
    }

    
    
    
    public ClassDTO(int courseID, String courseName, int numberOfMonths) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.numberOfMonths = numberOfMonths;
    }

    public ClassDTO(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }



    public ClassDTO(String ptPhone, String staffName) {
        this.ptPhone = ptPhone;
        this.staffName = staffName;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPtPhone() {
        return ptPhone;
    }

    public void setPtPhone(String ptPhone) {
        this.ptPhone = ptPhone;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalSession() {
        return totalSession;
    }

    public void setTotalSession(int totalSession) {
        this.totalSession = totalSession;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClassDTO{" + "classID=" + classID + ", courseID=" + courseID + ", capacity=" + capacity + ", ptPhone=" + ptPhone + ", className=" + className + ", description=" + description + ", totalSession=" + totalSession + ", status=" + status + ", courseName=" + courseName + ", staffName=" + staffName + ", numberOfMonths=" + numberOfMonths + '}';
    }
  
}
