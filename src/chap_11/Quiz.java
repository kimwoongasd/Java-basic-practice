package chap_11;

public class Quiz {
    public static void main(String[] args) {
        int code = 0;

        try {
            if (code == 0) {
                System.out.println("상품 구매를 완료하였습니다");
            } else if (code == 2) {
                throw new SoldOutProduct("해당 상품은 매진되었습니다");
            } else if (code == 1) {
                throw new TimeOut("상품 구매 가능 시간이 아닙니다.");
            }
        } catch (TimeOut e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다");
        } catch (SoldOutProduct e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에");
        }
    }
}

class SoldOutProduct extends Exception{
    public SoldOutProduct(String message) {
        super(message);
    }
}

class TimeOut extends Exception{
    public TimeOut(String message) {
        super(message);
    }
}