package com.project_special_lecture.project.special_lecture.repository;

import com.project_special_lecture.project.special_lecture.entity.*;

import java.util.List;

public interface LectureApplyHistoryRepository {
    Long create(LectureApplyHistory lectureApplyHistory);
    LectureApplyHistory findById(Long lectureApplyId);
    List<LectureApplyHistory> findByUserId(Long userId);
}
