package ru.neoflex.cosmeticsStore.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomersDTO {

    Long id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;

}
