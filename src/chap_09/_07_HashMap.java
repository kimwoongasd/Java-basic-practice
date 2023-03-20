package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)로 이루어진 형태 = 파이썬 dict
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("정준하", 3);
        map.put("하하", 15);
        System.out.println("총 고객 수 : " + map.size());
        System.out.println("-------------------");
        
        // 조회, get("key")
        System.out.println(map.get("유재석"));
        System.out.println(map.get("박명수"));
        System.out.println("-------------------");

        // 확인
        if (map.containsKey("하하")) {
            int point = map.get("하하");
            map.put("하하", ++point);
            System.out.println(map.get("하하"));
        } else {
            map.put("하하", 1);
            System.out.println("하하님 신규 등록");
        }
        System.out.println("-------------------");

        // 석제
        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("-------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        } else {
            System.out.println("가게 하자");
        }
        System.out.println("-------------------");

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("정준하", 3);
        map.put("하하", 15);

        // key 확인
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("-------------------");

        // Value 확인
        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println("-------------------");

        // Key-Value 같이 확인
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + " 포인트 : " + map.get(key));
        }
        System.out.println("-------------------");

        // 맵 : 중복, 순서보장 X
        // 마지막에 입력한 값이 저장된다
        map.put("유재석", 10);
        map.put("유재석", 20);
        map.put("유재석", 40);
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + " 포인트 : " + map.get(key));
        }
        System.out.println("-------------------");

        // 순서 보장 LinkedHashMap
        HashMap<String, Integer> link = new LinkedHashMap<>();
        link.put("정준하", 3);
        link.put("하하", 15);
        link.put("유재석", 10);
        link.put("박명수", 5);
        for (String key : link.keySet()) {
            System.out.println("고객 이름 : " + key + " 포인트 : " + link.get(key));
        }
        System.out.println("-------------------");
    }
}
