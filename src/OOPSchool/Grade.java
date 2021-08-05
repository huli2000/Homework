package OOPSchool;

import java.util.Arrays;

public class Grade {

	public static final int MIN_SCORE = 40;
	public static final int MAX_SCORE = 100;

	public String profession ;
	private int score;

		public Grade(String profession, int score) {
		super();
		this.profession = profession;
		setScore(score);
	}
	public int getScore() {
		return score;
	}

	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public void setScore(int score) {
		if (score >= MIN_SCORE && score <= MAX_SCORE) {
			this.score = score;
		}
		}
	@Override
	public String toString() {
		return "Grade [profession=" + profession + ", score=" + score + "]";
	}

	

	}

	

