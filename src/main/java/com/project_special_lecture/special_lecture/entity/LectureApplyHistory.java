package com.project_special_lecture.special_lecture.entity;

import com.project_special_lecture.special_lecture.domain.*;

public class LectureApplyHistory{
    private long userId;

    public LectureApplyHistory(long userId) {
        this.userId = userId;
    }
    
    public LectureApplyHistoryDomain toDomain() {
        return new LectureApplyHistoryDomain(userId);
    }
} 
