package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        // 클래스 메소드
        BlackBox b1 = new BlackBox();
        b1.callServieCenter();

        BlackBox b2 = new BlackBox();
        b2.callServieCenter();


        // 객체를 생성하지 않고 클래스에 직접 접근하여 호출 가능
        BlackBox.callServieCenter();

        String s = String.valueOf(3);
    }
}
