package Lesson16B;

import Lesson16B.States.Citizen;

public class Test {

	public static void main(String[] args) {

			States isr = new States ("Israel");
			Citizen moshe = isr.new Citizen("Moshe", 101);
			Citizen dana = isr.new Citizen("Dana", 102);
			Citizen avi = isr.new Citizen("Avi", 103);
			
			States fra = new States ("France");
			Citizen david = isr.new Citizen("David", 104);
			Citizen eli = isr.new Citizen("Eli", 105);
			Citizen tikva = isr.new Citizen("Tikva", 106);
			
			
	}

}
