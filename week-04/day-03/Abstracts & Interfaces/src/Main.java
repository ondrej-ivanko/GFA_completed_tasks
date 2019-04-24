import cloneableexcer.Student;

public class Main {
	public static void main(String[] args) throws
					CloneNotSupportedException {
		Student someDude = new Student("John", 20, "male", "BME");
		someDude.clone();
	}
}
