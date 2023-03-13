package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자
        // \n, \t, \\, \*
        System.out.println("자바");
        System.out.println("초보");

        // \n은 줄바꿈
        System.out.println("자바가\n처음인\n초보");

        // \t : tap 효과
        // 신라면      1000원
        // 삼양라면    2500원
        // 진라면 3500원
        System.out.println("신라면\t\t1000원");
        System.out.println("삼량라면\t\t2500원");
        System.out.println("진라면\t\t3500원");

        // \\ : 파일경로나 폴더 경로애 역슬래시 표현할때 사용
        System.out.println("c:\\file\\java");

        // ""(끝 따음표), ''(작은 따음표)앞에 \을 붙이면 그대로 출력가능
        System.out.println("단비가 \"야옹\" 이라고 했어요");
        System.out.println("단비가 '뭘 봐?' 라고 했어요");
        System.out.println("단비가 \'뭘 봐?\' 라고 했어요");

        char c = 'a';
        c = '\'';
        System.out.println(c);
    }
}
