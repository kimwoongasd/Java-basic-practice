package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        // 예외처리 미루기
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("main 메소드에서 해결");
        }
    }
    
    
    // 메소드 내에서 처리하다가 발생한 문제를 내부적으로 처리하지 않고 다른데로 던진다.
    public static void writeFile() throws IOException {
        /*try {
            FileWriter writer = new FileWriter("test.txt");
            throw new IOException("파일 쓰기 실패");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("writeFile 메소드 내에서 자체 해결했어요");
        }*/

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기 실패");
    }
}
