package com.sportivity.service;

import com.sportivity.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
