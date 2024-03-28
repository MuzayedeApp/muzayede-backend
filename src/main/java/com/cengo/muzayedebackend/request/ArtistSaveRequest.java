package com.cengo.muzayedebackend.request;

import jakarta.validation.constraints.NotBlank;

public record ArtistSaveRequest(@NotBlank String fullName,
                                @NotBlank String info) {
}
