package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 Do While
        // Do {} while (조건); {}

        int distance = 25; // 이동할 거리
        int move = 0; // 현재 거리
        int h = 2; // 사람 키
        while (distance > (move + h)) {
            System.out.println("현재 이동 거리 " + move);
            move += 3;
        }
        System.out.println("도착 1");

        move = 0;
        h = 25;
        while (distance > (move + h)) {
            System.out.println("현재 이동 거리 " + move);
            move += 3;
        }
        System.out.println("도착 2");

        // do while
        // do while은 do 안에 있는 문장을 실행 후 while로 이동
        // 조건이 맞다면 다시 do로 이동
        h = 5;
        do {
            System.out.println("현재 이동 거리 " + move);
            move += 3;
        } while (distance > (move + h)); {
            System.out.println("도착 3");
        }
    }
}
