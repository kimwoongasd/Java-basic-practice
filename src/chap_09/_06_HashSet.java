package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트 = 중복을 허용하지 않는다
        // 순서를 보장하지 않는다
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("김치");
        set.add("김치");
        set.add("김치");
        set.add("상추");
        set.add("소금");

        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("--------------");

        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출반");
        }
        System.out.println("--------------");

        // 삭제
        System.out.println("총 상품 수 " + set.size());
        set.remove("삼겹살");
        System.out.println("총 상품 수 " + set.size());
        System.out.println("--------------");

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("집으로");
        } else {
            System.out.println("마트로");
        }
        System.out.println("--------------");
        // 중복, 순서보장 x
        HashSet<Integer> inSet = new HashSet<>();
        inSet.add(3);
        inSet.add(1);
        inSet.add(5);
        inSet.add(13);
        inSet.add(1);

        for (int i : inSet) {
            System.out.println(i);
        }
        System.out.println("--------------");
        // 순서 보장하려면 LinkedHashSet
        HashSet<Integer> inSet2 = new LinkedHashSet<>();
        inSet2.add(3);
        inSet2.add(1);
        inSet2.add(5);
        inSet2.add(13);
        inSet2.add(1);

        for (int i : inSet2) {
            System.out.println(i);
        }
    }
}
