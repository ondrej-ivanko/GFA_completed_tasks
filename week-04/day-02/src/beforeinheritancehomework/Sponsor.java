package beforeinheritancehomework;

public class Sponsor extends Person {

	String company;
	int hiredStudents;

	public Sponsor(String name, int age, String gender, String company) {
		super(name, age, gender);
		this.company = company;
		this.hiredStudents = 0;
	}

	public Sponsor() {
		this("Jane Doe", 30, "female", "Google");
	}

	public void introduce() {
		System.out.println("Hi I´m " + this.name + ", a " + this.age + " years old " + this.gender + " who represents " +
						                  this.company + " and hired " + this.hiredStudents + " students so far.");
	}

	public void getGoal() {
		System.out.println("My goal is: Hire brilliant junior software developers.");
	}

	public void hire() {
		this.hiredStudents++;
	}


}
