package beforeinheritancehomework;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

	String name;
	List<Student> listOfStudents;
	List<Mentor> listOfMentors;

	public Cohort(String name) {
		this.name = name;
		this.listOfStudents = new ArrayList<>();
		this.listOfMentors = new ArrayList<>();
	}

	public void addStudent(Student student) {
		listOfStudents.add(student);
	}

	public void addMentor(Mentor mentor) {
		listOfMentors.add(mentor);
	}

	public void info() {
		System.out.println("The " + this.name + " cohort has " + listOfStudents.size() + " students and "
						                   + listOfMentors.size() + " mentors.");
	}
}
