package com.project_special_lecture.special_lecture.repository;

import com.project_special_lecture.special_lecture.domain.*;

import org.springframework.stereotype.Repository;

@Repository
public interface LectureApplyHistoryRepository {
    LectureApplyHistoryDomain save(long userId);  
}
