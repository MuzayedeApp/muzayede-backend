package com.cengo.muzayedebackend.mapper;

import com.cengo.muzayedebackend.dto.UserDTO;
import com.cengo.muzayedebackend.model.User;
import com.cengo.muzayedebackend.request.UserSaveRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	//TODO approved will be false
	User convertToUser(UserSaveRequest request);
	UserDTO convertToUserDTO(User user);
	List<UserDTO> convertToUserDTOs(List<User> users);
}
