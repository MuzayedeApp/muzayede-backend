package com.cengo.muzayedebackend.controller;

import com.cengo.muzayedebackend.controller.contract.UserControllerContract;
import com.cengo.muzayedebackend.dto.UserDTO;
import com.cengo.muzayedebackend.request.UserSaveRequest;
import com.cengo.muzayedebackend.response.RestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	private final UserControllerContract userControllerContract;

	public UserController(UserControllerContract userControllerContract) {
		this.userControllerContract = userControllerContract;
	}

	@GetMapping
	public ResponseEntity<RestResponse<List<UserDTO>>> findAll() {
		List<UserDTO> users = userControllerContract.getAllUsers();
		return ResponseEntity.ok(RestResponse.of(users));
	}

	@GetMapping("/{id}")
	public ResponseEntity<RestResponse<UserDTO>> findById(@PathVariable Long id) {
		UserDTO user = userControllerContract.getUserById(id);
		return ResponseEntity.ok(RestResponse.of(user));
	}

	@PostMapping
	public ResponseEntity<RestResponse<UserDTO>> save(@RequestBody UserSaveRequest userSaveRequest) {
		UserDTO user = userControllerContract.saveUser(userSaveRequest);
		return ResponseEntity.ok(RestResponse.of(user));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<RestResponse<Object>> delete(@PathVariable Long id) {
		userControllerContract.deleteUser(id);
		return ResponseEntity.ok(RestResponse.empty());
	}
}
