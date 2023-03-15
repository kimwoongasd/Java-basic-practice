package chap_06;

public class quiz {
    // 나도코딩 코드
    /*public static String getHiddenData(String str, int x) {
        String data = str.substring(0, x);;
        for (int i = x; i < str.length(); i++) {
            data += "*";
        }
        return data;
    }*/

    // 내 코드
    public static String getHiddenData(String str, int x) {
        String res;
        res = str.substring(0, x);
        for (int i = x; i < str.length(); i++) {
            res += "*";
        }
        return res;
    }

    public static void main(String[] args) {
        String name = "솜솜이";
        String number = "123-1234-1234";
        String id = "111111-1111111";

        System.out.println("이름 " + getHiddenData(name, 1));
        System.out.println("번호 " + getHiddenData(number, 9));
        System.out.println("아이디 " + getHiddenData(id, 8));
    }
}
