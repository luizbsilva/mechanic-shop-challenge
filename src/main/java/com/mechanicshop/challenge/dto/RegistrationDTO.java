package com.mechanicshop.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDTO {
    private Long code;
    private String userName;
    private String email;
    private String password;

    public RegistrationDTO(Long code, String userName, String email) {
        this.code = code;
        this.userName = userName;
        this.email = email;
    }
}
