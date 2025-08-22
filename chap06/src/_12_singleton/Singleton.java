package _12_singleton;

/*
 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
 장점: 메모리 낭비 방지
 단점: 1. 의존성이 높아진다.
      2. private 생성자를 이용하기에 상속이 어렵다
      3. 테스트하기가 힘들다.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
