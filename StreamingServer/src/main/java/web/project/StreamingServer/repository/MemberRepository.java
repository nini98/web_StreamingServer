package web.project.StreamingServer.repository;

import java.util.List;
import java.util.Optional;

import web.project.StreamingServer.Entity.Member;

// ���� �ʱ⿡ DB�� �������� �ʾ��� ��� interface�� ���� ���� Ŭ������ ������ �� �ֵ��� ����

public interface MemberRepository {
	Member save(Member member);
	
	Optional<Member> findByloginid(String id);
	// Optional��  null�� ����ϱ� ���� ������� ���ο� �ھ� ���̺귯�� ������ Ÿ��
	// �Ϲ������� NullPointerException�� ���� �߻��ϴµ� �̸� ���� ���ؼ��� ���ǹ��� ���� �߰� �ؾ� ��
	// �̶� Optional�� ����ϸ� �ڵ尡 ª���� �������� �������� ���������� ������
	
	Optional<Member> findByemail(String email);
	
	Optional<Member> findByidx(Long id);
	
	List<Member> findAll();
	
	void delete(Member member);

}
