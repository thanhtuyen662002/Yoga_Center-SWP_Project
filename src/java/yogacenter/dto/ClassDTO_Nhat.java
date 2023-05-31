/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yogacenter.dto;

/**
 *
 * @author dell
 */
public class ClassDTO_Nhat {

    private int id;
    private CourseDTO_Nhat course;
    private UserDTO_Nhat pt;
    private String name;
    private String description;
    private int total_sessions;
    private int capacity;

    public ClassDTO_Nhat(int id, CourseDTO_Nhat course, UserDTO_Nhat pt, String name, String description, int total_sessions, int capacity) {
        this.id = id;
        this.course = course;
        this.pt = pt;
        this.name = name;
        this.description = description;
        this.total_sessions = total_sessions;
        this.capacity = capacity;
    }

    public ClassDTO_Nhat() {
    }

    public ClassDTO_Nhat(int aInt, String string, String string0, String string1, boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ClassDTO_Nhat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CourseDTO_Nhat getCourse() {
        return course;
    }

    public void setCourse(CourseDTO_Nhat course) {
        this.course = course;
    }

    public UserDTO_Nhat getPtPhone() {
        return pt;
    }

    public void setPtPhone(UserDTO_Nhat ptPhone) {
        this.pt = ptPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotal_sessions() {
        return total_sessions;
    }

    public void setTotal_sessions(int total_sessions) {
        this.total_sessions = total_sessions;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ClassDTO_Nhat{" + "id=" + id + ", course=" + course + ", pt=" + pt + ", name=" + name + ", description=" + description + ", total_sessions=" + total_sessions + ", capacity=" + capacity + '}';
    }

}
