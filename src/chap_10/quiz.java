package chap_10;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {
        // 스트림 이용
        ArrayList<Customer> arr = new ArrayList<>();
        arr.add(new Customer("챈들러", 50));
        arr.add(new Customer("레이철", 42));
        arr.add(new Customer("모니카", 21));
        arr.add(new Customer("벤자민", 18));
        arr.add(new Customer("제임스", 5));


        System.out.println("미술관 입장료");
        System.out.println("------------------");
        arr.stream().map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료")
                .forEach(System.out::println);
    }
}

class Customer {
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
