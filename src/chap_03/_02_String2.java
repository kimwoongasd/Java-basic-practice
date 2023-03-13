package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        // end를 ,로 변환
        System.out.println(s.replace(" and", ","));
        // 시작 위치부터 끝 위치 직전까지, 마지막 index 입력하지 않으면 끝까지(이전 내용은 삭제된다)
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.lastIndexOf(".")));

        // 공백 제거
        s = "      I love Java              ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + ", " + s2);
        // concat 뒤에 올 문자열 붙이기
        System.out.println(s1.concat(", ").concat(s2));
    }
}
