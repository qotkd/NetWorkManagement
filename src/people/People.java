package people;

import java.util.Scanner;

public class People {
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
	public void setEmail(String email) {
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
	
	public void getUserInput(Scanner sc) {
		System.out.print("Add Name : ");
		String name = sc.next();
		this.setName(name);
		System.out.print("Add Birthday :");
		String birthday = sc.next();
		this.setBirthday(birthday);
		System.out.print("Add Phone Number :");
		String phone = sc.next();
		this.setPhone(phone);
		System.out.print("Add Email Address :");
		String email = sc.next();
		this.setEmail(email);
		while(true) {
			System.out.print("Do you want more friendly?? Answer (Y/N)");
			char answer = sc.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				this.tag = "Important";
				break;
			}
			else if (answer == 'N' || answer == 'n') {
				this.tag = "Not important";
				break;
			}
			else {
				System.out.println("Please answer (Y/N)");
				continue;
			}
		}
	}
}