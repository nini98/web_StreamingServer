package web.project.StreamingServer.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter // lombok ��� = getter ����
@MappedSuperclass // ���� ������ ��ӹ޴� super class��� �ǹ�, �� annotation�� ����� Ŭ������ entity�� �ƴϴ�, �� ���̺�� ���ε��� ����
@EntityListeners(AuditingEntityListener.class) // �ش� Ŭ������ Auditing ����� ���� -> jpa auditing = Spring Data JPA���� �ð��� ���ؼ� �ڵ����� ���� �־��ִ� ���
public abstract class BaseEntity {
	
	@CreatedDate
	@Column(name = "created_date")
	private LocalDateTime CreatedDate;
	
	@LastModifiedDate
	@Column(name = "modified_date")
	private LocalDateTime ModifiedDate;
	
	
}
