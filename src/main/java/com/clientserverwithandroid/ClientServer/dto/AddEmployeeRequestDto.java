package com.clientserverwithandroid.ClientServer.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
public class AddEmployeeRequestDto {

    @NotBlank
    private String name;
    @NotBlank
    private String location;
    @NotBlank
    private String branch;
}
