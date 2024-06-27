package com.project_special_lecture.project.special_lecture.entity;

import com.project_special_lecture.project.special_lecture.domain.*;

import lombok.RequiredArgsConstructor;

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
