package hello.core.singleton;

public class SingletonService {

    // 1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static SingletonService instance = new SingletonService();

    //2.  public 으로 열어서 객체 인스턴스가 필요하면 이 static 메소드를 통해서만 접근을 한다.
    public static SingletonService getInstance(){
        return instance;
    }

    //3. 생성자를 private로 선언해서 외부에서 new를 사용하여 객체 생성을 하지 못하도록 막는다.
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
