package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변화
        System.out.println(s.toUpperCase()); // 대문자
        System.out.println(s.toLowerCase()); // 소문자

        // 문자열 포함 관계
        System.out.println(s.contains("Java")); // 포함되면 true 아니면 false
        System.out.println(s.contains("C#"));

        // 문자열 위치
        System.out.println(s.indexOf("Java")); // 시작 위치를 반환
        System.out.println(s.indexOf("C#")); // 포함되지 않다면 -1 반환
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치 정보
        System.out.println(s.startsWith("I like")); // 문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith(".")); // 문자열로 끝나면 true 아니면 false
    }
}
