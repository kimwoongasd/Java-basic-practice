package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 while
        // while (조건) {}
        int distance = 25; // 이동할 거리
        int move = 0; // 현재 거리
        while (distance > move) {
            System.out.println("현재 이동 거리 " + move);
            move += 3;
        }
        System.out.println("도착");
    }
}
