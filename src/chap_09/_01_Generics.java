package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 재네릭스 : 다양한 타입의 객체를 지원하는 클래스, 인터페이스, 메소드를 정의하는 방법
        // 같은 동작을 하는 클래스나 메소드를 한번만 정의함
        // 기본자료형 : int, boolean, String등 재네릭스에서 바로 못씀
        // Wrapper class 사용해야한다

        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printInArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T = Type, K = key, V = Value, E = Element
    // 재네릭스 생성 private static <T> void printAnyArray(T[] array) {}
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    };

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }


    private static void printInArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
