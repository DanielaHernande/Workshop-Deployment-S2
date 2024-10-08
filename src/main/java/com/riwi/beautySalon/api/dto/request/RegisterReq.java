package com.riwi.beautySalon.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterReq {
    @NotBlank(message = "El usaurio el obligatorio")
    @Size(min = 8, max = 150, message = "El usuario debe tener entre 8 y 150 caracteres")
    private String userName;
    @NotBlank(message = "El password el obligatorio")
    @Size(min = 8, max = 150, message = "El password debe tener entre 8 y 150 caracteres")
    // @Pattern(regexp = "expresion regular")
    private String password;
}