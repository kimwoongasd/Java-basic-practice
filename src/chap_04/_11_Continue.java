package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // continue = 반복문일 경우 다음 회차로 넘아간다
        // 치킨 매일 20마리 1인 1닭
        // 노쇼하는 경우
        int max = 20; // 최대 판매 수향
        int sold = 0; // 판매 수량
        int no_show = 15;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 치킨 나왔습니다");
            if (i == no_show){
                System.out.println("노쇼 손님 " + i);
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료 소진");
                break;
            }
        }
        System.out.println("구분------------------");

        int idx = 0;
        sold = 0;
        no_show = 14;
//        while (idx < 50) {
        // 탈출 조건이 있기때문에 반복문 무한 루프에서 탈출가능
        while (true) {
            idx++;
            System.out.println(idx + "번 손님 치킨 나왔습니다");
            if (no_show == idx) {
                System.out.println("노쇼 손님 " + idx);
                continue;
            }

            sold++;
            if (sold == max){
                System.out.println("금일 재료 소진");
                break;
            }
        }

    }
}
