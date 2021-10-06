package com.mechanicshop.challenge.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class ChangePasswordDTO {
    private String email;
    private String password;
    private String newPassord;
}
