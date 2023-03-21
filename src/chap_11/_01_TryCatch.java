package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외처리
        // 컴파일 오류 : 코드에 문제가 있는 것
        // 런타임 오류 : 실행하는 과저에서 오류가 있는 것 ex) index 크기보다 벗어나는 경우
        // error : 코드를 수습할 수 없는경우 ex) 재귀의 스택오브플로우
        // 예외(exception) : 수습가능한 경우 ex) 파일 경로가 없는 경우

        // 문법 try {} catch(Exception e) {}
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            System.out.println("문제 원인 : " + e.getMessage());
            // e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
        System.out.println("----------------");

        try {
            int[] arr = new int[3];
            arr[5] = 0;
        } catch (Exception e) {
            System.out.println("문제 원인 : " + e.getMessage());
            // e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

        System.out.println("----------------");

        try {
            Object obj = "test";
            System.out.println((int)obj);
        } catch (Exception e) {
            System.out.println("문제 원인 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
