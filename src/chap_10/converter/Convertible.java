package chap_10.converter;

// 함수형 인터페이스라는걸 컴파일러에게 알려준다
@FunctionalInterface
public interface Convertible {
    void convert(int USD);
}
