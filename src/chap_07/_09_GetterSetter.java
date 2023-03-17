package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        // Getter와 Setter
        BlackBox b1 = new BlackBox();
        b1.name = "까망이";
        // b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인 행사
        b1.price = -6000; // 잘못입력
        System.out.println(b1.price);

        // 값이 없으면 null이 나온다
        System.out.println(b1.resolution);
        System.out.println("------------------");
        
        BlackBox b2 = new BlackBox();
        b2.setName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println(b2.getPrice());
        System.out.println(b2.getResolution());
    }
}
