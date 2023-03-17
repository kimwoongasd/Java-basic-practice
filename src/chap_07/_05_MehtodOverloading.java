package chap_07;

public class _05_MehtodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.name = "까망이";

        b1.record(true, true, 3);
        System.out.println("---------------------");
        b1.record(false,false, 10);
        System.out.println("---------------------");
        b1.record(true, false, 20);
        System.out.println("---------------------");
        b1.record();
    }
}
