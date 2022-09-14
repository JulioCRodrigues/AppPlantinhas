package com.julioprojects.appplantinhas.model;

public class Produto {


    private String namePlants;
    private String plantType;
    private String plantDescription;

    private Integer img_plant;
    private Integer img_moister;

    public String getNamePlants() {
        return namePlants;
    }

    public void setNamePlants(String namePlants) {
        this.namePlants = namePlants;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public String getPlantDescription() {
        return plantDescription;
    }

    public void setPlantDescription(String plantDescription) {
        this.plantDescription = plantDescription;
    }

    public Integer getImg_plant() {
        return img_plant;
    }

    public void setImg_plant(Integer img_plant) {
        this.img_plant = img_plant;
    }

    public Integer getImg_moister() {
        return img_moister;
    }

    public void setImg_moister(Integer img_moister) {
        this.img_moister = img_moister;
    }
}
