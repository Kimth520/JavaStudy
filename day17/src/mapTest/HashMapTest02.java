package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		System.out.println(map);
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		System.out.println(map);

		map.put("e", 1);// key는 중복 불가능, value는 중복 가능
		System.out.println(map);
		System.out.println(map.get("d"));

		System.out.println(map.size());// 사이즈 확인 메서드
		System.out.println(map.keySet());
		System.out.println(map.values());

		HashMap<String, Integer> mart = new HashMap<>();
		// 추가 put()
		mart.put("새우깜", 2200);
		mart.put("뿌뿌로", 2500);
		mart.put("퍼커칩", 2600);
		mart.put("양파랑", 2700);

		// 조회 get(key)
		System.out.println(mart.get("새우깜"));
		System.out.println(mart.get("새우깡"));

		// 삭제 remove(key)
//		mart.remove("뿌뿌로");
		System.out.println(mart.remove("뿌뿌로"));
		System.out.println(mart);

		// 길이 확인 size
		System.out.println(mart.size());

		// key에 포함되어있는지 확인 containsKey
		// value에 포함되어있는지 확인 containsKValues
		System.out.println(mart.containsKey("퍼커칩"));
		System.out.println(mart.containsValue(1000));

		// Iterator
		// keySet -> key만 가져오기
		System.out.println(mart.keySet());
		Iterator<String> iter = mart.keySet().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// values에서 value만 가져오기
		System.out.println(mart.values());
		Iterator<Integer> iter2 = mart.values().iterator();
		System.out.println(iter2);
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		// Entry key, value 한쌍씩 가져오기
		Set<Entry<String, Integer>> items = mart.entrySet();
		for (Entry<String, Integer> entry : items) {
			System.out.println(entry);
		}

	}
}
