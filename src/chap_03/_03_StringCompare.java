package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        // 문자열 내용이 같으면 true 아니면 false
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Java"));
        System.out.println(s1.equals("java"));
        System.out.println(s2.equals("python"));

        // 대소문자 관계 없이 같은지만 확인
        System.out.println(s2.equalsIgnoreCase("python"));
        System.out.println(s1.equalsIgnoreCase("java"));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // 내용을 비교
        System.out.println(s1 == s2); // 참조하는 것을 비교

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // 서로 다른곳을 참조하기 때문에 false 이다

        // 문자열 비교할 때 equals 사용
    }
}
