package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(5 / 2); // 정수간에 나누었기 때문에 정수값인 2가 나온다
        System.out.println(5 % 2); // 나머지

        // 우선 순위 연산
        System.out.println(2 + 4 * 2);
        System.out.println((2 + 2) * 2);

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연상 ++, --
        int val;
        val = 10;
        // ++val 은 +1을 진행한 후 나머지 수행
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);

        val = 10;
        // val++ 앞 문장들 수행 후 +1
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);

        // --도 ++와 같다
        val = 10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);

        // 은행 대기번호 표 예제
        int waiting = 0;
        // 0을 출력 후 1이 더해져서 다음 번호표를 뽑는다면 1이 출력된다
        System.out.println("대기 번호 :" + waiting++);
        System.out.println("대기 번호 :" + waiting++);
        System.out.println("대기 번호 :" + waiting++);
        System.out.println("총 대기 인원 : " + waiting);
    }
}
