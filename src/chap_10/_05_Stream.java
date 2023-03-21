package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 : 데이터 흐른다
        // 많은 데이터에서 내가 원하는 데이터를 필터링를 통해서 얻는다

        // stream 생성
        // Arrays.stream
        int[] scores = {100, 80, 50, 70, 90};
        IntStream scoreStream = Arrays.stream(scores);

        // Collections.stream
        String[] lengs = {"Python", "Java", "C", "C++", "C#"};
        Stream<String> stream = Arrays.stream(lengs);

        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("Python", "Java", "C", "C++", "C#");

        // Stream.of
        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        Stream<String> langOfStream = Stream.of("Python", "Java", "C", "C++", "C#");


        // stream 사용
        // 중간 연산(Intermediate Operation) : 필터링(filter, map, sorted, distinct, skip....)
        // 최종 연산(Terminal Operation) : 필터링을 통해서 최종적으로 얻는 결과물
        // (count, min, max, sum, foreach, anyMatch, allMatch...)
        // 스트림은 필퍼링, 맵핑하게 되면서 안에있는 데이터 사용, 재사용 불가능

        // 90이상인 점수 출력
        System.out.println("-----------------------------");
        Arrays.stream(scores).filter(x -> 80 <= x).forEach(x -> System.out.println(x)); // 람다식 사용

        System.out.println("-----------------------------");
        Arrays.stream(scores).filter(x -> 80 <= x).forEach(System.out::println);

        System.out.println("-----------------------------");
        // 90이상 사람수
        int cnt = (int)Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(cnt);

        System.out.println("-----------------------------");
        // 90이상 수들의 합
        int s = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(s);
        System.out.println("-----------------------------");
        // 정렬
        Arrays.stream(scores).filter(x -> x >= 80).sorted().forEach(System.out::println);

        // 문자열
        // C로 시작하는 문자열
        System.out.println("-----------------------------");
        Arrays.stream(lengs).filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("-----------------------------");

        // Java 포함하는 문자열
        Arrays.stream(lengs).filter(x -> x.contains("Java")).forEach(System.out::println);
        System.out.println("-----------------------------");
        
        // 문자열 길이가 4이하의 언어 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("-----------------------------");

        // 4글자 이하이면서 C포함
        langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("C")).forEach(System.out::println);
        System.out.println("-----------------------------");

        // 4글자 이하 문자열 중에 하나라도 C 가 포함되는 문자열이 있는지 확인 여부
        boolean anyMatch = langList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("C"));
        System.out.println(anyMatch);
        System.out.println("-----------------------------");

        // 3글자 이하 모든 문자열이 C 가 포함되는 확인 여부
        boolean allMatch = langList.stream().filter(x -> x.length() <= 3).allMatch(x -> x.contains("C"));
        System.out.println(allMatch);
        System.out.println("-----------------------------");

        // 4글자 이하, C 글자를 포함하는 문자열 뒤에 새로운 문자열 추가
        langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("C"))
                .map(x -> x + " 어려워요").forEach(System.out::println);

        System.out.println("-----------------------------");
        
        // C라는 포함하는 문자열 소문자로
        langList.stream().filter(x -> x.contains("C")).map(String::toLowerCase).forEach(System.out::println);
        System.out.println("-----------------------------");

        // 가공한 데이터를 리스토로
        List<String> langListOfC = langList.stream().filter(x -> x.contains("C"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        langListOfC.forEach(System.out::println);
    }
}
