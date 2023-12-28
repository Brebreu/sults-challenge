package com.sultschallenge.springbootbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {
    private String name;
    private String empresa;
    private String email;
    private String celular;

    @Override
    public String toString() {
        return "AccountDto{" +
                "name='" + name + '\'' +
                ", empresa='" + empresa + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
