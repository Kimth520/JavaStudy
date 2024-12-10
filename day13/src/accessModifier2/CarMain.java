package accessModifier2;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
//      c.speed = 100;
	      c.setSpeed(100);
	      System.out.println(c.getSpeed());
		
	}
}
