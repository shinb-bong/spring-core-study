package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core", // 탐색을 시작할 폴더 여러개도 가능 디폴트는 설정정보의 패키지 부터 시작함.
        // 그래서 설정 정보를 최상단에 올려놔야 디폴트로 탐색하고 생략
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION ,
                classes = Configuration.class)// 원래 설정정보 무시
) // 컴포넌트 스캔
public class AutoAppConfig {

}
