package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 롬복 예시 코드, Getter Setter을 생성해주는 라이브러리
 */
@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {

        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("aaaa");
        String name = helloLombok.getName();
        System.out.println("name = " + name);
        System.out.println("helloLombok = " + helloLombok);

    }
}
