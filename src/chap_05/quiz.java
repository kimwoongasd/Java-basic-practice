package chap_05;

public class quiz {
    public static void main(String[] args) {
        int[] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5 * i);
        }

        for (int x : size) {
            System.out.println("사이즈 " + x + " 재고 있음");
        }
    }
}
