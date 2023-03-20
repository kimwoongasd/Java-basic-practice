package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 - 순회
        // 삭제할 데이터를 쉽게 삭제

        // List는 인터페이스이다, ArrayList 안에 list를 구현하고있다
        // 다형성
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list.add("유재석");
        list.add("알수없음");
        list.add("주우재");
        list.add("알수없음");
        list.add("이상호");
        list.add("알수없음");
        list.add("다나카");
        list.add("알수없음");
        list.add("추성훈");

        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        // 이터레이터 사용
        Iterator<String> it = list.iterator(); // 처음은 List<String> list = new ArrayList<>(); 가르킨다
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("-----------------");
        // 커서를 다시 처음으로
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------");
        // 삭제하기
        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("알수없음")) {
                it.remove();
            }
        }

        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("-----------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

//        map.iterator(); // key, value 두개값이 있어서 할 수 없다

        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("-----------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("-----------------");

        // key value 같이 출력
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
