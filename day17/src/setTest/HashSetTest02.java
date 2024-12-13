package setTest;

import java.util.HashSet;

public class HashSetTest02 {
	public static void main(String[] args) {
		//Hashset 객체 생성
		HashSet<Student> set = new HashSet<>();
		
		System.out.println(set);
		
		//Student 객체 생성
		Student st1 = new Student(1,"김무열");
		Student st2 = new Student(1,"김무열");
		
		set.add(st1);
		set.add(st2);
		System.out.println(set);
	}
}
