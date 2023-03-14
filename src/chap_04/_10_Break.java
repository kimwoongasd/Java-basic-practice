package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // break = 중지
        // 치킨을 매일 20마리만 판매 (1인 1닭)

        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("금일 재로 소진");
                break;
            }
        }
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님 치킨 나왔습니다.");
            if (index == max) {
                System.out.println("금일 재료 소진");
                break;
            }
            index++;
        }
    }
}
