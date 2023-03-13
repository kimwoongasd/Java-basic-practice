package chap_03;

public class quiz {
    public static void main(String[] args) {
        String num = "123456-1234567";
        System.out.println(num.substring(0, num.indexOf("-") + 2));
        System.out.println(num.substring(0, num.lastIndexOf("-") + 2));
        System.out.println(num.substring(0, 8));
    }
}
