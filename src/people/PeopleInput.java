package people;

import java.util.Scanner;

import exception.EmailFormatException;

public interface PeopleInput {
	
	public String getName();

	public void getUserInput(Scanner sc);

	public void setName(String name);

	public void setBirthday(String birthday);
	
	public String getBirthday();

	public void setPhone(String phone);
	
	public String getPhone();

	public void setEmail(String email) throws EmailFormatException;
	
	public String getEmail();

	public void printInfo();
	
	public void setPeopleName(Scanner sc); 
		
	public void setPeopleBirthday(Scanner sc); 
	
	public void setPeoplePhone(Scanner sc); 
		
	public void setPeopleEmail(Scanner sc);
}
