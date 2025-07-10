package com.fierce.adventurer.journalApp.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotEmpty
     private String userName;

    private String email;

    private boolean sentimentAnalysis;

    @NotEmpty
    private String password;
}
