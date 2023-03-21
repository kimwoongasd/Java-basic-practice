package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        // finally : 무조건 수행해야하는 문장
        // 에러가 발생해도, 발생하지 않아도 finally 구문이 실행
        try {
            System.out.println("가게 문을 연다");
            throw new Exception("오늘은 휴무");
//            System.out.println("택시 탄다");
        } catch (Exception e) {
            System.out.println("문제 원인 : " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("가게 문을 닫는다");
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");

        // try + catch, try + catch + finally, try + finally
        // try 만 단독사용 불가능
        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
