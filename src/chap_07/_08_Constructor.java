package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        // 생성자
        // 일일이 인스턴스 변수에 값을 넣는 작업을 더 편하게 할 수 있다
        BlackBox b1 = new BlackBox();
        b1.name = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        System.out.println(b1.serialNumber);

        // 사용하고 싶으면 생성자 주석 없애기
        /*BlackBox b2 = new BlackBox("하양이", "UHD", 3000000, "화이트");
        System.out.println(b2.name);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
        System.out.println(b2.serialNumber);*/
    }
}
