package com.spring.App.domain;
//Creamos nuevas clase para el domino asi no expones nuestra base de datos
// y utilizamos estas clases y no tenemos problemas con el idioma
public class Category {
    private Integer categoryId;
    private String description;
    private Boolean active;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
