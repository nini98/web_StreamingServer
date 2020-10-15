package web.project.StreamingServer.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter // lombok 기능 = getter 생성
@MappedSuperclass // 매핑 정보만 상속받는 super class라는 의미, 이 annotation이 선언된 클래스는 entity가 아니다, 즉 테이블과 매핑되지 않음
@EntityListeners(AuditingEntityListener.class) // 해당 클래스에 Auditing 기능을 포함 -> jpa auditing = Spring Data JPA에서 시간에 대해서 자동으로 값을 넣어주는 기능
public abstract class BaseEntity {
	
	@CreatedDate
	@Column(name = "created_date")
	private LocalDateTime CreatedDate;
	
	@LastModifiedDate
	@Column(name = "modified_date")
	private LocalDateTime ModifiedDate;
	
	
}
