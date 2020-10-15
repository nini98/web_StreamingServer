package web.project.StreamingServer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.project.StreamingServer.Entity.Member;


@Repository //  DBó���� �� DAO Ŭ������ bean�� �߰�
public interface JpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{
	
	Optional<Member> findByloginid(String id);
	
	Optional<Member> findByemail(String email);

}
