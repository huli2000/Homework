package OOPSchool;

import java.util.Arrays;

public class School {

	private ClassRoom[] classrooms = new ClassRoom[5];

	public School(ClassRoom[] classrooms) {
		super();
		this.classrooms = classrooms;
	}

	@Override
	public String toString() {
		return "School [classrooms=" + Arrays.toString(classrooms) + "]";
	}

	public ClassRoom[] getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(ClassRoom[] classrooms) {
		this.classrooms = classrooms;
	}

}
