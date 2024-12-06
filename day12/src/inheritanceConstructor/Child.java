package inheritanceConstructor;
//9번 : 상속관계-생성자 확인
//자식클래스(서브클래스)
public class Child extends Parents{
   //필드
   int num;

   //생성자
   public Child() {
	   super();//부모 객체 불러옴
      System.out.println("Child 생성자 호출");
   }
   
   //메소드
   void printInt(int num) {
      System.out.println(num);
   }
}
