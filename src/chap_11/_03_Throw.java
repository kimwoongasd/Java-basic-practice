package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        // throw
        // 원해서 에러를 발생시킬 수 있다
        int age = 18;
        try {
            if (age < 19) {
                throw new Exception("만 19세 미만에게는 판매하지 않습니다");
            } else {
                System.out.println("판매합니다");
            }
        } catch (Exception e) {
            System.out.println("문제 원인 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");

    }
}
