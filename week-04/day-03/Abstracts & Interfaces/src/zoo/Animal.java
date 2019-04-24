package zoo;

abstract class Animal {

	String name;
	int age;
	String gender;
	int size;

	abstract String getName();

	abstract String breed();

	abstract void eat();
}
