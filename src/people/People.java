package people;

import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;

public abstract class People implements PeopleInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7590340215267524594L;
	protected PeopleKind kind = PeopleKind.Friendly;
	protected String name;
	protected String birthday;
	protected String phone;
	protected String email;
	protected String tag;

	public PeopleKind getKind() {
		return kind;
	}

	public People(PeopleKind kind) {
		this.kind = kind;
	}
	public void setKind(PeopleKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws EmailFormatException {
		if(!email.contains("@")) {
			throw new EmailFormatException();
		}
		this.email = email;
	}
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public People() {
	}
	
	public People(String name) {
		this.name = name;
	}
	
	public People(String name, String birthday, String phone, String email) {
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
	}
	
	public People(PeopleKind kind, String name, String birthday, String phone, String email) {
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
	} 
	
	public void printInfo() {
		System.out.print(this.tag+ ", ");
		System.out.println(this.kind);
		System.out.println("name : " + this.name);
		System.out.println("birthday : " + this.birthday);
		System.out.println("phone : " + this.phone);
		System.out.println("email : " + this.email);
	}
	
	public void setPeopleName(Scanner sc) {
		System.out.print("Enter Name : ");
		String name = sc.next();
		this.setName(name);
	}
	public void setPeopleBirthday(Scanner sc) {
		System.out.print("Enter Birthday : ");
		String birthday = sc.next();
		this.setBirthday(birthday);
	}
	public void setPeoplePhone(Scanner sc) {
		System.out.print("Enter Phone : ");
		String phone = sc.next();
		this.setPhone(phone);
	}
	public void setPeopleEmail(Scanner sc) {
		String email = "";
		while(!email.contains("@")) {
			System.out.print("Enter Email : ");
			email = sc.next();
			try {
				this.setEmail(email);
			}
			catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
				
			}
				
		}
	}
	
	public void wantMoreLess (Scanner sc) {
		while(true) {
			System.out.print("Do you want more friendly?? Answer (Y/N)");
			char answer = sc.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				this.tag = "Important";
				break;
			}
			else if (answer == 'N' || answer == 'n') {
				this.tag = "a little important";
				break;
			}
			else {
				System.out.println("Please answer (Y/N)");
				continue;
			}
		}
	}
	public void recievePresents(Scanner sc) {
		while(true) {
			System.out.print("Did he/she give me birthday presents?? Anwser (Y/N)");
			char answer = sc.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				this.tag = "Very important";
				break;
			}
			else if (answer == 'N' || answer == 'n') {
				this.tag = "important";
				break;
			}
			else {
				System.out.println("Please answer (Y/N)");
				continue;
			}
		}
	}
}