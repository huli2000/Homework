package OOPSchool;



public class Utils {

	public static String getRandomProfession() {
		String[] professions = { "Math", "chemistry", "geography", "literature", "physics", "sports" };
		int profIndex = (int) (Math.random() * professions.length) ;
		return professions[profIndex];
	}
	
	public static Grade[] getRandomGrades() {
        Grade[] grades = new Grade[6];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = new Grade(getRandomProfession(), getRandomNum(40, 100));
        }
        return grades;
    }
	
	public static int getRandomNum(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

}