import java.util.*;
import java.util.regex.Pattern;
public class UserServiceInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		US u=new US();
		System.out.print("Enter your name:");
		u.setName(sc.nextLine());
		System.out.print("Enter your DOB:");
		u.setDOB(sc.nextLine());
		System.out.print("Enter your age:");
		u.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter your phone number:");
		u.setPhoneNo(sc.nextLine());
		boolean validEmail = false;
        while (!validEmail) {
            System.out.print("Enter Email: ");
            validEmail = u.setEmail(sc.nextLine());
        }

        boolean validPassword = false;
        while (!validPassword) {
            System.out.print("Enter Password: ");
            validPassword = u.setPassword(sc.nextLine());
        }
        u.display();

	}

}
interface userService {
	void setName(String name);
	void setDOB(String dob);
	void setAge(int age);
	void setPhoneNo(String phoneNo);
	boolean setEmail(String email);
	boolean setPassword(String pwd);
	void display();
}

class US implements userService{
	String name;
	String dob;
	int age;
	String phoneNo;
	String email;
	String pwd;
	public void setName(String name) {
		this.name=name;
	}
	public void setDOB(String dob) {
		this.dob=dob;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo=phoneNo;
	}
	public boolean setEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$";
        if (Pattern.matches(emailRegex, email)) {
            this.email = email;
            return true;
        } else {
            System.out.println("Invalid Email Format!");
            return false;
        }
    }
	public boolean setPassword(String pwd) {
        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$"; 
        if (Pattern.matches(passwordRegex, pwd)) {
            this.pwd = pwd;
            return true;
        } else {
            System.out.println("Invalid Password! Password must be at least 8 characters long and contain at least one letter and one digit.");
            return false;
        }
    }
	public void display() {
		System.out.println("\nUser Registered Successfully!");
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Email: " + email);
	}
	
}
