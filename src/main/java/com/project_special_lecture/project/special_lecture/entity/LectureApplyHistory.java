package com.project_special_lecture.project.special_lecture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import com.project_special_lecture.project.special_lecture.domain.*;

import lombok.RequiredArgsConstructor;

@Entity
@Table(name="lecture")
@RequiredArgsConstructor
public class LectureApplyHistory{
    private long userId;

    public LectureApplyHistory(long userId) {
        this.userId = userId;
    }

    public LectureApplyHistoryDomain toDomain() {
        return new LectureApplyHistoryDomain(userId);
    }
} 
