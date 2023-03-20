package chap_09.Coffee;

import chap_09.user.User;

// 재네릭 클래스 타입제한
public class CoffeeByUser <T extends User> {
    // 어떤 타입을 쓰던 관계없지만 user 라는 클래스를 상속하는 T를 써야한다
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
