
public class Member {
private String firstname,lastname,gender,email,birthday,pin;

public Member() {
	super();
}

public Member(String firstname,  String lastname, String gender, String email, String birthday,
		String pin) {
	super();
	this.firstname = firstname;
	
	this.lastname = lastname;
	this.gender = gender;
	this.email = email;
	this.birthday = birthday;
	this.pin = pin;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getBirthday() {
	return birthday;
}

public void setBirthday(String birthday) {
	this.birthday = birthday;
}

public String getPin() {
	return pin;
}

public void setPin(String pin) {
	this.pin = pin;
}



}