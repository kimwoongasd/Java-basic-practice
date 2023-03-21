package chap_11;

import java.util.Locale;

public class _02_Catch {
    public static void main(String[] args) {
        // catch
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println("잘못 계산했습니다");
        } catch (Exception e) {
            System.out.println("문제 원인 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");

        try {
            int[] arr = new int[3];
            arr[7] = 7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index 범위를 벗어났습니다");
        } catch (Exception e) {
            System.out.println("문제 원인 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");

        try {
            Object obj = "test";
            System.out.println((int)obj);
        } catch (ArithmeticException e) {
            System.out.println("잘못 계산했습니다");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index 범위를 벗어났습니다");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형변환입니다.");
        } catch (Exception e) {
            System.out.println("그 외의 문제 원인 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");

        try {
            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ArithmeticException e) {
            System.out.println("잘못 계산했습니다");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index 범위를 벗어났습니다");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형변환입니다.");
        } catch (Exception e) {
            System.out.println("그 외의 문제 원인 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");

        // 두개의 예외처리 합치기
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("실수");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형변환입니다.");
        } catch (Exception e) {
            System.out.println("그 외의 문제 원인 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");

        try {
            int[] arr = new int[3];
            arr[7] = 7;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("실수");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형변환입니다.");
        } catch (Exception e) {
            System.out.println("그 외의 문제 원인 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");
    }
}
