package com.cengo.muzayedebackend.dto;

import java.time.LocalDate;

public record UserDTO(Long id,
					  String name,
					  String surname,
					  String email,
					  String phone,
					  String address,
					  LocalDate birthDate) {
}
