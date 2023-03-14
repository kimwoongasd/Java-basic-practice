package chap_04;

public class quiz {
    public static void main(String[] args) {
        int hour = 10;
        boolean a_car = false; // 경차
        boolean b_car = true; // 장애인 차량
        int total = 0;

        for (int i = 1; i < hour + 1; i++) {
            total += 4000;
            if (total >= 30000){
                total = 30000;
                break;
            }
        }

        if (a_car || b_car) {
            total *= 0.5;
        }
        System.out.println("차량 " + hour + "시간 주차시 " + total + "원");
    }
}
