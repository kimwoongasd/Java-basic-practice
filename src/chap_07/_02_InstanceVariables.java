package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        // 객체 생성
        BlackBox b1 = new BlackBox();

        // 인스턴스 변수에 값 저장
        b1.name = "까망";
        b1.resolution = "HD";
        b1.price = 200000;
        b1.color = "블랙";

        System.out.println(b1.name);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        System.out.println("구분------------");
        // 새로운 객체 생성
        BlackBox b2 = new BlackBox();
        b2.name = "하양이";
        b2.resolution = "FHD";
        b2.price = 300000;
        b2.color = "화이트";

        System.out.println(b2.name);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
    }
}
