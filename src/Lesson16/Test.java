package Lesson16;

public class Test {
	
	public static void main(String[] args) {
		Animal animal;
		animal = new Bat();
		animal.speak();
        animal = new Dog();
        animal.speak();
        
        System.out.println("==============");
        
        Animal[] animals = new Animal[4];
        animals[0]= new Bat();
        animals[1]= new Dog();
        animals[2]= new Hawk();
        animals[3]= new Ostrich();
        
        for (int i = 0; i < animals.length; i++) {
			Animal a = animals[i];
					a.speak();
					
					//casting
//					((Flyer)a).fly();
					if (a instanceof Flyer) {
					Flyer f = (Flyer) a;
					f.fly();
					}
//					System.out.println("=========");
					
					if (a instanceof Navigator) {
						Navigator n = (Navigator) a;
						n.navigate();
						}
						System.out.println("=========");
			
		}
        
	}

}
