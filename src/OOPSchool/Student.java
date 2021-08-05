package OOPSchool;

import java.util.Arrays;

public class Student extends Person {

	private Grade[] grades = new Grade[6];

	public Grade[] getGrades() {
		return grades;
	}

	public Student(String name, int age, Grade[] grades) {
		super(name, age);
		this.grades = grades;

	}

	@Override
	public String toString() {
		return "Student [" + this.getName() + ", age = " + this.getAge() + " grades=" + Arrays.toString(grades) + "]";
	}

}
