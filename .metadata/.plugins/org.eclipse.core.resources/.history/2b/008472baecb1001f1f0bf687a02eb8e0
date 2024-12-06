package makeTask;

import java.util.Random;

public class SolveTask05 {
   public static void main(String[] args) {
   SolveTask05 mt = new SolveTask05();
   mt.randomDice("김태현");
      
      
   }
   //로직구성
   //리턴값이 없으므로 void
   //주사위 값을 받을 변수 2개와 던지는 횟수를 셀 변수 선언
   //while문으로 반복문 구성해주고
   //1부터6까지 랜덤으로 출력할 메서드 사용
   //매 반복마다 횟수 증감해주고
   //이전 주사위 값 변수에 현재 주사위 값 대입해주고
   //만약 이전 주사위값과 현재 주사위 값이 같으면
   //break종료
   
   
   void randomDice(String name) {
      Random random = new Random();
      int previousData = 0;
      int currentData = 0;
      int count = 0;
            
      while(true) {
         currentData = random.nextInt(6)+1;//1~6
         System.out.println(currentData);
         count++;
         
         if(currentData ==previousData) {
        	
            System.out.println("연속으로 같은 수 나오기 성공!");
            System.out.println(name +"님은 총" + count + "번 던지고 성공하셨습니다");
            break;
         }
         previousData = currentData;
      }
         
   }
   
}
