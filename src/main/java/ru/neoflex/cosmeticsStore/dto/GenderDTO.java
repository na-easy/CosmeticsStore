package ru.neoflex.cosmeticsStore.dto;

public class GenderDTO {

    private Long id;
    private String description;

    public GenderDTO () {
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
