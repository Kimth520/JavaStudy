package makeTask;

import java.util.Scanner;

public class SolveTask04 {
      //정수일 때 출력
      void checkType(int num) {
           System.out.println(num + "는 정수입니다.");
       }
       //실수일 때 출력
       void checkType(double num) {
           System.out.println(num + "는 실수입니다.");
       }
       //문자일 때 출력
       void checkType(char ch) {
           System.out.println(ch + "는 문자입니다.");
       }
       //문자열 일 때 출력
       void checkType(String str) {
           System.out.println(str + "는 문자열입니다.");
       }
       //int인지 확인하는 메서드 
   boolean isInt(String s)                     
   {
	   int cnt = 0;
      for(int i =0; i < s.length(); i++) //문자 길이만큼 반복
      {
         char ch = s.charAt(i); //돌아갈 때 마다 ch에 저장 -  -1111
         if(((int)ch > 47 && (int)ch < 58) || (int)s.charAt(0) == 45)        	 //0 ~ 9 || 0 45(-)
                cnt++;       
      }
      return cnt == s.length(); //끝나도 false가 안되면 true
   }
   //실수인지 확인하는 메서드
   boolean isDecimal(String s)
   {
	   int cnt = 0, cnt1=0;  //11-11
      for(int i =0; i < s.length(); i++) //문자 길이만큼 반복
      {
         char ch = s.charAt(i); //돌아갈 때 마다 ch에 저장 1 1 - 1 1 실수 .  2 a.b 
         if(ch == '.') //저장된 ch에 .이 있으면 
            cnt++;  //true반환                    //3.14 3.3.3.3
         if(((int)ch > 47 && (int)ch < 58) || (int)s.charAt(0) == 45)        	 //0 ~ 9 || 0 45(-)
             cnt1++;   
      }
      return  cnt == 1; //반복문 끝나도 true가 되지 않으면 false
   }
   public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in); 
      SolveTask04 T = new SolveTask04(); 
      System.out.print("정수, 실수, 문자, 문자열 중 하나를 입력하세요: "); //입력메시지
      String type = sc.nextLine(); //입력메소드
      if(T.isDecimal(type)) //만약 참이면 
      {
    	  T.checkType((Double.parseDouble(type))); //Double로 형변환해서 출력 
      } 
      else if(T.isInt(type)) // 만약 문자의 길이가 1이면
      {   	  
    	  T.checkType(Integer.parseInt((type)));    //	   1          a b c - ! 
      }
      else if(type.length() == 1) //만약 isDecimal의 값이 참이면
      {
    	  
    	  T.checkType(type.charAt(0)); //char형으로 변환해서 출력      
      }    
      else //다아니면
         T.checkType(type); //그대로 출력 
   }
}
