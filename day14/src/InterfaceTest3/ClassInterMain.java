package InterfaceTest3;

public class ClassInterMain extends Class1 implements Inter1 {
//The inherited method Class1.printText() cannot hide the public abstract method in Inter1
	//인터페이스의 메소드와 클래스 메소드 간의 충돌 문제 방생
	//인터페이스의 메소드가 abstract인경우 클래스에서 숨기거나 무시할 수 없다
}
