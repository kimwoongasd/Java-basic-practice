package chap_13;

import java.io.File;
import java.io.IOException;

public class _03_FIle {
    public static void main(String[] args) {
        // 파일 다루기
        String fileName = "test.txt";
        File file = new File(fileName);
        try {
            file.createNewFile(); // 파일 생성, 파일이 있다면 덮어쓰지 않는다
            if (file.exists()) {
                System.out.println("파일 이름 : " + file.getName());
                System.out.println("절대 경로 : " + file.getAbsolutePath());
                System.out.println("파일 크기 Byte : " + file.length());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
