package setTest;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		System.out.println(set.toString());
		
		//요소 추가 add
		set.add("김");
		set.add("김무");
		set.add("김무");
		set.add("김무열");
		set.add("김무무열");
		set.add("김무무무열");
		set.add("김무무무열열");
		System.out.println(set);
		
		//요소 포함 contains
		System.out.println(set.contains("김무열"));
		System.out.println(set.contains("김우열"));
		
		//요소 제거 remove
		System.out.println(set.remove("김무무무열열"));
		System.out.println(set);
		
		//크기 확인 size
		System.out.println(set.size());
		
		//모든 요소 제거 clear
		set.clear();
		System.out.println(set);
	}
}
