package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.name = "까망이";
        
        // 모델명 업데이트 하기 = 뒤에 최신형 붙이기
        b1.appendName("(최신형)");
        System.out.println(b1.name);
    }
}
