package com.cengo.muzayedebackend.model.base;

import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Setter
@Getter
public abstract class BaseEntity implements BaseModel {
	@Version
	private Integer version;

	@Embedded
	private BaseAdditionalFields baseAdditionalFields;
}
