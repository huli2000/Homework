package OOPSchool;

import java.util.Arrays;

public class SchoolStatistics {

	public static void main(String[] args) {

		// create school

		School school = new School(getRandomClassRooms());

		// part1: school overall average

		schoolAvg(school);

		// Part2: class average
		classAverage(school.getClassrooms());

		// Part3: school average per profession
		schoolAveragePerProfession(school);

	}

	private static void schoolAvg(School school) {
		int totalScore = 0;
		int totalGrades = 0;

		for (ClassRoom classRoom : school.getClassrooms()) {
			totalScore += classTotal(classRoom);
			totalGrades += classRoom.getStudents().length * 6;
		}
		System.out.println("School avg is: " + totalScore / totalGrades);
	}

	private static int classTotal(ClassRoom classRoom) {
		int total = 0;
		for (Student student : classRoom.getStudents()) {
			total += studentTotalScore(student);

		}
		return total;
	}

	private static void classAverage(ClassRoom[] classRooms) {

		for (ClassRoom classRoom : classRooms) {
			int totalScore = 0;
			for (Student student : classRoom.getStudents()) {
				totalScore += studentTotalScore(student);
			}
			System.out.println("Class name: " + classRoom.getName() + " Class average "
					+ totalScore / (classRoom.getStudents().length * 6));
		}
	}

	private static int studentTotalScore(Student student) {
		int total = 0;
		for (Grade grade : student.getGrades()) {
			total += grade.getScore();
		}

		return total;
	}

	private static ClassRoom[] getRandomClassRooms() {
		ClassRoom[] classrooms = new ClassRoom[5];
		for (int i = 0; i < classrooms.length; i++) {

			Teacher teacher = new Teacher(getRandomName(), getRandomAge(), getRandomProfession());
			String name = "class" + i;
			Student[] students = getRandomStudents();
			classrooms[i] = new ClassRoom(name, teacher, students);
		}
		System.out.println(Arrays.toString(classrooms));

		return classrooms;
	}

	private static void schoolAveragePerProfession(School school) {
		int totalMath, totalChemistry, totalGeography, totalLiterature, totalPhysics, totalSports;
		totalMath = totalChemistry = totalGeography = totalLiterature = totalPhysics = totalSports = 0;

		int countMath, countChemistry, countGeography, countLiterature, countPhysics, countSports;
		countMath = countChemistry = countGeography = countLiterature = countPhysics = countSports = 0;

		for (ClassRoom classRoom : school.getClassrooms()) {
			for (Student student : classRoom.getStudents()) {
				for (Grade grade : student.getGrades()) {
					switch (grade.getProfession()) {
					case "math" -> {
						totalMath += grade.getScore();
						countMath++;
					}
					case "chemistry" -> {
						totalChemistry += grade.getScore();
						countChemistry++;
					}
					case "geography" -> {
						totalGeography += grade.getScore();
						countGeography++;
					}
					case "literature" -> {
						totalLiterature += grade.getScore();
						countLiterature++;
					}
					case "physics" -> {
						totalPhysics += grade.getScore();
						countPhysics++;
					}
					case "sports" -> {
						totalSports += grade.getScore();
						countSports++;
					}
					}
				}
			}
		}
		System.out.print(
				"math: " + totalMath / countMath + "\nchemistry: " + totalChemistry / countChemistry + "\ngeography: "
						+ totalGeography / countGeography + "\nliterature: " + totalLiterature / countLiterature
						+ "\nphysics: " + totalPhysics / countPhysics + "\nsports: " + totalSports / countSports);
	}

	private static Student[] getRandomStudents() {
		Student[] students = new Student[15];
		for (int i = 0; i < students.length; i++) {
			Grade[] grades = Utils.getRandomGrades();
			students[i] = new Student(getRandomName(), getRandomAge(), grades);
//			System.out.println(students[i]);
		}

		return students;

	}

	private static String getRandomProfession() {
		String[] professions = { "Math", "chemistry", "geography", "literature", "physics", "sports" };
		int profIndex = (int) (Math.random() * professions.length);
		return professions[profIndex];
	}

	private static int getRandomAge() {
		return ((int) (Math.random() * 101) + 20);

	}

	private static String getRandomName() {
		String[] TeacherNames = { "Moshe", "Avi", "Nissim", "Ilana", "Batya", "Mazal", "Ahuva", "Nadav", "David",
				"Bar" };
		int teachnames = (int) (Math.random() * TeacherNames.length);
		return TeacherNames[teachnames];
	}

}
