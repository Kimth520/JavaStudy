package InterfaceTest3;
//인터페이스의 디폴트메소드와 클래스의 메소드가 동일한 경우
public interface Inter1 {
	default void printText() {//default 없으며 추상 메서드로 인식(public abstract)
		System.out.println("Inter1의 printText메서드");
	}
}
