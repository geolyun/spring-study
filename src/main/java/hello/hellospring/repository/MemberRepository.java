// 회원 리포지토리 인터페이스
package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원 저장
    Optional<Member> findById(Long id); // 아이디로 찾아올 수 있음
    Optional<Member> findByName(String name); // 이름으로 찾아올 수 있음
    List<Member> findAll(); // 지금까지 저장된 모든 회원 정보 리스트 반환
}

// Optional -> null이 올 수 있는 값을 감싸는 Wrapper 클래스, NPE방지를 위해서 사용(메소드의 결과가 null이 될 때 사용하는게 제일 좋음)