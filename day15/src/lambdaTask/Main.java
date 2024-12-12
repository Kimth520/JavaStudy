package lambdaTask;

public class Main {
	
	public static void main(String[] args) {
		MultipleInter mi = new MultipleInter() {
			
			@Override
			public int calculator(int num1, int num2) {
				return num1 * num2;
			}
		};
	}
}
