package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}

// junit 단위 테스트 도구 -> assertXXX를 사용해 Test
// mockito 목 라이브러리
// assertj 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
// spring-test 스프링 통합 테스트 지원