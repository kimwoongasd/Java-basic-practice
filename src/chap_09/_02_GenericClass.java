package chap_09;

import chap_09.Coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 재네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(31);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("-----------------");

        // Object를 쓰면 정수인지 문자열인지 모른다
        CoffeeByName c3 = new CoffeeByName(34);
        CoffeeByName c4 = new CoffeeByName("강호동");
        c3.ready();
        c4.ready();

        System.out.println("-----------------");
        // 형변환해야한다
        int c3Name = (int)c3.name;
        System.out.println(c3Name);

        String c4Name = (String) c4.name;
        System.out.println(c4Name);

        // 정수를 문자열로 형변환 못한다
        // 실행하기 전까지 오류가 발생한지 모른다
        /*c4Name = (String) c3.name;
        System.out.println(c4Name);*/
        System.out.println("-----------------");

        // <> 안에는 wrapper 클래스 사용
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();

        // 형변환 없이 이름을 가져온다
        int c5Name = c5.name;
        System.out.println(c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Nmae = c6.name;
        System.out.println(c6Nmae);

        System.out.println("-----------------");

        // 이광수라는 이름의 객체를 만들고 그 객체를 CoffeeByUser만들때 집어넣어서 만든다
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("이광수"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("이수근"));
        c8.ready();

        System.out.println("-----------------");
        orderCoffee("김영철");
        orderCoffee(36);
        orderCoffee("김희철", "아아");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    // <>안에 복수가 가능하다
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
