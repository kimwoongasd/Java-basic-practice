package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식
        // (전달값1(파라미터),전달값2...) -> (코드)
    }

/*    public void print() {
        String s = "test";
        System.out.println(s);
    }*/

    // 람다식은 접근제어자,이름, void 가 필요없다
    /*() -> {
        String s = "test";
        System.out.println(s);
    }*/

    /*public void print(String s) {
        System.out.println(s);
    }*/

    // 문장이 한줄이라면 {}생략, ;생략, String 생략가능 - 전달값이 컴파일러가 알수있기 때문이다
    // 전달값이 한개면 () 생략가능
//    s -> System.out.println(s);


    /*public int add(int x, int y) {
        return x + y;
    }*/

    // return이 있다면 {} 생략불가능
//    (x, y) -> x + y
}
