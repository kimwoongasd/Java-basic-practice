package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        // 리스트는 중복 데이터를 허용한다
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("제시");
        list.add("조세호");
        list.add("김종국");
        list.add("양세찬");

        // 데이터 조회(인텍스)
        System.out.println(list.get(0));
        System.out.println(list.getFirst()); // 처음 데이터
        System.out.println(list.getLast()); // 마지막 데이터
        System.out.println("-----------------");

        // 추가
        list.addFirst("송지효"); // 맨앞에 추가

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------");
        list.addLast("이수근");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");
        // 중간에 값 추가
        list.add(1, "지석진");
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("-----------------");

        // 삭제
        System.out.println(list.size());
        list.remove(list.size() - 1);
        System.out.println(list.size());

        System.out.println("-----------------");
        // 처음과 마지막 데이터 삭제
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        // 변경
        list.set(0, "주우재");
        System.out.println(list.get(0));
        System.out.println("-----------------");

        // index 확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("있음");
        } else {
            System.out.println("없음");
        }
        System.out.println("-----------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println(list.size());
        } else {
            System.out.println("있음");
            System.out.println(list.size());
        }

        System.out.println("-----------------");

        list.add("유재석");
        list.add("제시");
        list.add("조세호");
        list.add("김종국");
        list.add("양세찬");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
