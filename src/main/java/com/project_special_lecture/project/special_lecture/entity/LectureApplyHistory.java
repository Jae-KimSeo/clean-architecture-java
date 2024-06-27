package com.project_special_lecture.project.special_lecture.entity;

import com.project_special_lecture.project.special_lecture.domain.*;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="lecture")
public class LectureApplyHistory{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="lecture_apply_id", length = 10)
    private Long lectureApplyId;

    @Column(name="user_id", length = 10, nullable = false)
    private Long userId;

    @Column(name= "is_applied", nullable = false)
    private boolean applied;

    @Column(name="applied_time", nullable = false)
    private LocalDateTime appliedTime;

    @Column(name="registered_time", nullable = false)
    private LocalDateTime registeredTime;

    protected LectureApplyHistory() {}

    public LectureApplyHistory(Long lectureApplyId, Long userId, boolean applied, LocalDateTime appliedTime, LocalDateTime registeredTime) {
        this.lectureApplyId = lectureApplyId;
        this.userId = userId;
        this.applied = applied;
        this.appliedTime = appliedTime;
        this.registeredTime = registeredTime;
    }

    public LectureApplyHistoryDomain toDomain() {
        return new LectureApplyHistoryDomain(userId);
    }
} 
