package com.dinfosoft.springexceptionhandling.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {

    @NotNull(message = "username shouldn't be null")
    String name;
    @Email(message = "invalid email address")
    String email;
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered ")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;
}
