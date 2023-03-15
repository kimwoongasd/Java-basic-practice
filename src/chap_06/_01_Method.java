package chap_06;

public class _01_Method {
    // 메소드 정의
    public static void sayhello() {
        System.out.println("안녕하세요 메소드 입니다");
    }

    public static void main(String[] args) {
        // 메소드 : 어떤 기능을 하느 코드의 묶음 ex) 함수 같은것
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayhello();
        sayhello();
        sayhello();
        System.out.println("메서드 호출 후");
    }
}
