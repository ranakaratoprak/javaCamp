package example5.business.abstracts;


import java.util.regex.Pattern;

import example5.entities.concretes.User;

public abstract class UserCheckManager implements UserService {
	
	String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	Pattern pattern = Pattern.compile(regex);
	
	
	public boolean passwordRule(User user) {
		if(user.getPassword().length() == 6) {
			return true;
		}else {
			System.out.println("Parola 6 karakterden oluþmalýdýr.");
			return false;
		}
		
	}

	
	public boolean emailRule(User user) {
		if(user.getEmail().matches(regex)) {
			return true;
		}else {
			System.out.println("E-postanýz uygun bir e-posta deðildir.");
			return false;
		}
	}


	
	public boolean nameRule(User user) {
		if(user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
			return true;
		}else {
			System.out.println("Adýnýz ve soyadýnýz en az 2 karakterden oluþmalýdýr.");
			return false;
		}
	}

	
	public void sendVerificationMail(User user) {
		System.out.println("Doðrulama e-postasý gönderildi.");
		if(clickedLink(user)) {
			System.out.println("Kaydýnýz tamamlanmýþtýr.");
		}else {
			System.out.println("Lütfen doðrulama linkine týklayýnýz.");
		}
		
	}
	
	
	private boolean clickedLink(User user) {
		return true;
	}
	
	
}
