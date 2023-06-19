package model.dto;


public class ClubDTO {
    private int clubID;
    private String clubName;
    private String district;
    private String address;
    private String hotline;
    private String dataImage;

    public ClubDTO() {
    }

    public ClubDTO(int clubID, String clubName, String district, String address, String hotline, String dataImage) {
        this.clubID = clubID;
        this.clubName = clubName;
        this.district = district;
        this.address = address;
        this.hotline = hotline;
        this.dataImage = dataImage;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline;
    }

    public String getDataImage() {
        return dataImage;
    }

    public void setDataImage(String dataImage) {
        this.dataImage = dataImage;
    }

    @Override
    public String toString() {
        return "ClubDTO{" + "clubID=" + clubID + ", clubName=" + clubName + ", district=" + district + ", address=" + address + ", hotline=" + hotline + ", dataImage=" + dataImage + '}';
    }


    
}
