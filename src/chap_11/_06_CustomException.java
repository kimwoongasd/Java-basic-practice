package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        // 사용자 정의 예외
        int age = 18;
        try {
            if (age < 19) {
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다");
            } else {
                System.out.println("판매합니다");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println("성인이 되어서 와라");
        } catch (Exception e) {
            System.out.println("모든 예외 처리");
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");
    }
}

class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}
