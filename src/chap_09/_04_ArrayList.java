package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크(List, Set, Map)

        // 배열을 만들면 크기가 고정되므로 추가하지 못하고 새로운 배열을 만들어야한다
        int[] arr = new int[3];
        arr[0] = 0;
        arr[2] = 2;
        arr[1] = 1;

        // 컬렉션 프레임워크는 정령, 추가, 제거, 탐색등 기능이 있다
        ArrayList<String> list = new ArrayList<>();
        // 데이터 추가
        list.add("유재석");
        list.add("제시");
        list.add("조세호");
        list.add("전소민");
        list.add("양세찬");
        
        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println("------------------");

        // 데이터 삭제
        System.out.println(list.size()); // 리스트의 길이
        list.remove("조세호");
        System.out.println(list.size());
        System.out.println(list.get(2));

        System.out.println("------------------");
        System.out.println(list.size());
        System.out.println(list.remove(list.size() - 1));
        System.out.println(list.size());
        System.out.println("------------------");

        // 순회
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------");

        // 데이터 수정
        System.out.println(list.get(0));
        list.set(0, "이광수");
        System.out.println(list.get(0));
        System.out.println("------------------");

        // index 확인
        System.out.println(list.indexOf("제시"));

        System.out.println("------------------");
        // 포함 여부
        if (list.contains("제시")) {
            System.out.println("있음");
        } else {
            System.out.println("없음");
        }

        System.out.println("------------------");
        // 전체 삭제
        list.clear();

        // 비어있는지 확인
        if (list.isEmpty()) {
            System.out.println("비어있음");
        } else {
            System.out.println("비어있지 않음");
        }

        System.out.println("------------------");

        list.add("유재석");
        list.add("제시");
        list.add("조세호");
        list.add("전소민");
        list.add("양세찬");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

    }
}
