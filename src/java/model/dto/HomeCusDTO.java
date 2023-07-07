package model.dto;

import java.sql.Time;

public class HomeCusDTO {
    private String image;
    private String storyContent;
    private int clubID;
    private String nameClub;
    private Time timeToCome;
    private String fullName;
    private String phone;
    
   
    public HomeCusDTO() {
    }

    public HomeCusDTO(String phone, String image, String storyContent) {
        this.phone = phone;
        this.image = image;
        this.storyContent = storyContent;        
    }

    


    public HomeCusDTO(int clubID, String fullName, String phone, Time timeToCome) {
        this.clubID = clubID;
        this.timeToCome = timeToCome;
        this.fullName = fullName;
        this.phone = phone;
    }

    public HomeCusDTO(Time timeToCome) {
        this.timeToCome = timeToCome;
    }

    public HomeCusDTO(int clubID, String nameClub) {
        this.clubID = clubID;
        this.nameClub = nameClub;
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

    
    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public String getNameClub() {
        return nameClub;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }

    public Time getTimeToCome() {
        return timeToCome;
    }

    public void setTimeToCome(Time timeToCome) {
        this.timeToCome = timeToCome;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStoryContent() {
        return storyContent;
    }

    public void setStoryContent(String storyContent) {
        this.storyContent = storyContent;
    }

    @Override
    public String toString() {
        return "HomeCusDTO{" + "image=" + image + ", storyContent=" + storyContent + ", clubID=" + clubID + ", nameClub=" + nameClub + ", timeToCome=" + timeToCome + ", fullName=" + fullName + ", phone=" + phone + '}';
    }


    
    
    
}
