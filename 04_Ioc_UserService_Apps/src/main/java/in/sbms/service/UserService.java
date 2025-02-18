package in.sbms.service;

import in.sbms.dao.UserDao;
import in.sbms.email.EmailService;
import in.sbms.pwd.PwdService;

public class UserService {

	
	private UserDao userdao;
	private PwdService pwdservice;
	private EmailService emailservice;
	public UserService() {
		System.out.println("UserService() got Execuated....🥰🥰🥰🤑");
	}

	
	
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public void setPwdservice(PwdService pwdservice) {
		this.pwdservice = pwdservice;
	}

	public void setEmailservice(EmailService emailservice) {
		this.emailservice = emailservice;
	}

	public void userRegistration() {
		
		//encrpyt pwd
		pwdservice.encrypt();
		//save user in db
		userdao.save();
		//send mail
		emailservice.sendEmail();
	}
}
