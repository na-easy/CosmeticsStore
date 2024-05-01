package ru.neoflex.cosmeticsStore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", description='" + description +
                '}';
    }
}
