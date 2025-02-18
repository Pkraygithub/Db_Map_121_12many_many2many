package in.sbms.controller;

import in.sbms.service.UserService;

public class UserController {

	private UserService userservice;

	public UserController() {

		System.out.println("This User Controller Constructore----🥰🥰🥰🥰");
	}

	public UserController(UserService service) {
		this.userservice = service;
	}

	public void register() {

		userservice.userRegistration();
	}

}
