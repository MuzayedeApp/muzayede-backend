package com.cengo.muzayedebackend.model.base;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
public class BaseAdditionalFields {

	@CreatedDate
	private LocalDateTime createDate;

	@LastModifiedDate
	private LocalDateTime updateDate;
}
