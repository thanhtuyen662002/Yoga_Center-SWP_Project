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
public class ProductDTO {

    private String productName;
    private String description;
    private String productImage;
    private int price;
    private byte status;

    public ProductDTO() {
    }

    public ProductDTO(String productName, String description, String productImage, int price, byte status) {
        this.productName = productName;
        this.description = description;
        this.productImage = productImage;
        this.price = price;
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProductDTO{" + "productName=" + productName + ", description=" + description + ", productImage=" + productImage + ", price=" + price + ", status=" + status + '}';
    }

    
}
