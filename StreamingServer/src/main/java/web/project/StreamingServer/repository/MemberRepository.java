package web.project.StreamingServer.repository;

import java.util.List;
import java.util.Optional;

import web.project.StreamingServer.Entity.Member;

// 개발 초기에 DB가 선정되지 않았을 경우 interface를 통해 구현 클래스를 변경할 수 있도록 설계

public interface MemberRepository {
	Member save(Member member);
	
	Optional<Member> findByloginid(String id);
	// Optional은  null을 대신하기 위해 만들어진 새로운 코어 라이브러리 데이터 타입
	// 일반적으로 NullPointerException이 자주 발생하는데 이를 막기 위해서는 조건문을 따로 추가 해야 함
	// 이때 Optional을 사용하면 코드가 짧아져 가독성이 높아지고 유지보수가 편해짐
	
	Optional<Member> findByemail(String email);
	
	Optional<Member> findByidx(Long id);
	
	List<Member> findAll();
	
	void delete(Member member);

}
