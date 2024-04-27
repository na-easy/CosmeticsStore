package ru.neoflex.cosmeticsStore.entities;

import javax.persistence.*;

@Entity
@Table(name = "gender")
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gender_id")
    private Long id;

    @Column(name = "description")
    private String description;

    public Gender () {
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

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", description='" + description +
                '}';
    }
}
