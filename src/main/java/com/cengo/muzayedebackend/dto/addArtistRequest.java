package com.cengo.muzayedebackend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class addArtistRequest {
    @NotBlank(message = "Full name is mandatory")
    private String fullName;
    @NotBlank(message = "Info is mandatory")
    private String info;
}
