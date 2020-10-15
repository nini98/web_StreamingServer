package web.project.StreamingServer.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@Entity(name="member")
@NoArgsConstructor(access = AccessLevel.PROTECTED) // �⺻ �������� ���� ��� protected�� ����
@RequiredArgsConstructor // @NonNull�̳� final�� ���� �ʵ忡 ���� �����ڸ� ����
public class Member extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	@Column(nullable = false)
	@NonNull
	private String loginid; // �α��� �� ����ϴ� ���̵�
	@Column(nullable = false)
	@NonNull
	private String name; // ������� �̸�
	@Column(nullable = false)
	@NonNull
	private String password; // �н����� bcrypt�� ����� ����
	@Column(nullable = false)
	@NonNull
	private String email; //���к��� id������ ���� ���� ������
	@Column
	private int auth; // �����ߴ��� Ȯ��
	@Column
	private int password_cnt; // �н����� �Է� Ƚ��
	@Column
	private LocalDateTime last_login_try_Date; // ���������� �α����� �õ��� �ð�
	@Column
	private int is_lock; // �α��� ���� ����
	@Column
	private String role; // ����
}
