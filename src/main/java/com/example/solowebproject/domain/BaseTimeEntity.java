package com.example.solowebproject.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA Entity 클래스들이 해당 클래스 상속시 필드들도 컬럼으로 인식하도록 설정
@EntityListeners(AuditingEntityListener.class) // Auditing 기능
public class BaseTimeEntity {
    @CreatedDate // Entity가 생성될 때 시간이 자동 저장
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
