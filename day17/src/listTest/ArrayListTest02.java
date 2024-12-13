package listTest;

class MyClass<T>{
	//필드
	T data;//확장성

	public MyClass(T data) {
		super();
		this.data = data;
	}
	
	//메소드
	void printData() {
		System.out.println(data);
	}
	
}

public class ArrayListTest02<T> {
	public static void main(String[] args) {
		MyClass<Double> mc1 = new MyClass<>(1.1);
		System.out.println(mc1);
		mc1.printData();
		
		MyClass<String> mc2 = new MyClass<>("Hello");
		mc2.printData();
	}
}


