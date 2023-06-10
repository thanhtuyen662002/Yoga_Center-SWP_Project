/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

import java.util.Date;


/**
 *
 * @author HOANG ANH
 */
public class NewsDTO {
    private int newsID;
    private String stPhone;
    private String title;
    private String postDate;
    private String image;
    private String content;
    private int categoryID;
    private boolean status ;

    public NewsDTO(int newsID, String stPhone, String title, String postDate, String image, String content, int categoryID, boolean status) {
        this.newsID = newsID;
        this.stPhone = stPhone;
        this.title = title;
        this.postDate = postDate;
        this.image = image;
        this.content = content;
        this.categoryID = categoryID;
        this.status = status;
    }

    public NewsDTO(int newsID, String stPhone, String title, String postDate, String image, String content, int categoryID) {
        this.newsID = newsID;
        this.stPhone = stPhone;
        this.title = title;
        this.postDate = postDate;
        this.image = image;
        this.content = content;
        this.categoryID = categoryID;
    }
    

    public int getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getStPhone() {
        return stPhone;
    }

    public void setStPhone(String stPhone) {
        this.stPhone = stPhone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NewsDTO{" + "newsID=" + newsID + ", stPhone=" + stPhone + ", title=" + title + ", postDate=" + postDate + ", image=" + image + ", content=" + content + ", categoryID=" + categoryID + ", status=" + status + '}';
    }

    
    
    
    
}