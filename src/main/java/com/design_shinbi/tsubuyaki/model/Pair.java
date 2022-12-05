package com.design_shinbi.tsubuyaki.model;

import com.design_shinbi.tsubuyaki.model.entity.Message;
import com.design_shinbi.tsubuyaki.model.entity.User;

public class Pair {
	private User user;
	private Message message;

	public Pair(User user, Message message) {
		this.user = user;
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public Message getMessage() {
		return message;
	}
}
