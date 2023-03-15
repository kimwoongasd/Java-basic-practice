package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] list = {"아아", "카푸치노", "라떼", "아바라"};

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        // enhanced for (for-each) 반복문
        for (String coffee : list) {
            System.out.println(coffee + " 하나");
        }

        for (String coffees :
                list) {
            System.out.println(coffees + " 둘");
        }
    }
}
