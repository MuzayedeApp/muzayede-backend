package com.cengo.muzayedebackend.service;

import com.cengo.muzayedebackend.dao.UserRepository;
import com.cengo.muzayedebackend.model.User;
import com.cengo.muzayedebackend.service.base.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseEntityService<User, UserRepository> {
	protected UserService(UserRepository repository) {
		super(repository);
	}
}
