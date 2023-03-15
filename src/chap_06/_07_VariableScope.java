package chap_06;

public class _07_VariableScope {
    public static void methodA() {
//        System.out.println(num);
    }

    public static void methodB() {
        int res = 1; // 지역 변수 : 변수가 선언된 영역 내에서만 사용 가능
    }

    public static void main(String[] args) {
        // 변수의 범위
        // 변수는 중괄호 {} 범위를 벗어나는 장소에서는 사용할 수 없다

        int num = 3;

//        System.out.println(res);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
            System.out.println(num);
        }
//        System.out.println(j);
    }
}
