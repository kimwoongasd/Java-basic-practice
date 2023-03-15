package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된공간
        String coffee1 = "아아";
        String coffee2 = "아바라";
        String coffee3 = "라떼";
        String coffee4 = "카푸치노";

        System.out.println(coffee1 + " 하나");
        System.out.println(coffee2 + " 하나");
        System.out.println(coffee3 + " 하나");
        System.out.println(coffee4 + " 하나");

        // 배열 선언 첫 번째 방법
        // String[] coffees = new String[안에 들어갈 데이터 갯수];
        String[] coffees = new String[4];

        // 두 번째 방법
//        String cooffe[] = new String[4];
        // index 값을 정해주면서 값을 넣어주는 방법
        coffees[0] = "아아";
        coffees[1] = "아바라";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        // 세번째 방법
        // 숫자를 넣지 않고 들어갈 값들을 뒤에 입력
//        String[] list = new String[] {"아아", "카푸치노", "라떼", "아바라"};

        System.out.println("구분----------------");

        // 네번째 방법
        String[] list = {"아아", "카푸치노", "라떼", "아바라"};
        System.out.println(list[0] + " 하나");
        System.out.println(list[1] + " 하나");
        list[2] = "핫초코";
        System.out.println(list[2] + " 하나");
        System.out.println(list[3] + " 하나");

        // 다른 자료형
        int[] i = new  int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = new double[] {10.0, 1.1, 1.2};
        boolean[] b = new boolean[] {true, true};
    }
}
