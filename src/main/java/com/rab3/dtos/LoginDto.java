package com.rab3.dtos;

import java.io.Serializable;

public class LoginDto implements Serializable {

	private static final long serialVersionUID = -4015173735404670259L;

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
