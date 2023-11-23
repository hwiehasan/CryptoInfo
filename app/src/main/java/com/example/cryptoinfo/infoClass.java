package com.example.cryptoinfo;

public class infoClass {

    private Integer image ;
    private String description ;

    public infoClass( String description , Integer image)
    {

        this.description = description ;
        this.image = image ;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
