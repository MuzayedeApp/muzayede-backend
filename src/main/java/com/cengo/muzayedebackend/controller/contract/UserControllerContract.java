package com.cengo.muzayedebackend.controller.contract;

import com.cengo.muzayedebackend.dto.UserDTO;
import com.cengo.muzayedebackend.request.UserSaveRequest;

import java.util.List;

public interface UserControllerContract {

	UserDTO saveUser(UserSaveRequest userSaveRequest);
	List<UserDTO> getAllUsers();
	UserDTO getUserById(Long id);
	void deleteUser(Long id);
}
