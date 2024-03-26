package com.cengo.muzayedebackend.controller.contract.impl;

import com.cengo.muzayedebackend.controller.contract.UserControllerContract;
import com.cengo.muzayedebackend.dto.UserDTO;
import com.cengo.muzayedebackend.mapper.UserMapper;
import com.cengo.muzayedebackend.model.User;
import com.cengo.muzayedebackend.request.UserSaveRequest;
import com.cengo.muzayedebackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserControllerContractImpl implements UserControllerContract {
	private final UserService userService;
	@Override
	public UserDTO saveUser(UserSaveRequest userSaveRequest) {
		User user = UserMapper.INSTANCE.convertToUser(userSaveRequest);
		user = userService.save(user);

		return UserMapper.INSTANCE.convertToUserDTO(user);
	}

	@Override
	public List<UserDTO> getAllUsers() {
		List<User> userList = userService.findAll();

		return UserMapper.INSTANCE.convertToUserDTOs(userList);
	}

	@Override
	public UserDTO getUserById(Long id) {
		User user = userService.getById(id);

		return UserMapper.INSTANCE.convertToUserDTO(user);
	}

	@Override
	public void deleteUser(Long id) {
		userService.delete(id);
	}
}
