package chap_11;

public class _05_TryWithResources {
    public static void main(String[] args) {
        // 파일을 쓰거나 읽거나 db관련 작업할 때 try - finally 문 실행해얗ㄴ다
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("퇴근 하고싶다");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("--------------");
        // try 구문 내에서 ()안에 정의하면 try문을 빠져나올 때 close를 실행한다
        // implements AutoCloseable를 구현해야하는 조건이 있다
        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("집에 가고싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 닫습니다");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다");
        System.out.println("입력 내용 : " + line);
    }
}