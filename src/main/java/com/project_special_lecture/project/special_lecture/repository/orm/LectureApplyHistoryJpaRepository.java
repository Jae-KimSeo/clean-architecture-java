package com.project_special_lecture.project.special_lecture.repository.orm;

import com.project_special_lecture.project.special_lecture.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LectureApplyHistoryJpaRepository extends JpaRepository<LectureApplyHistory, Long> {
    Long create(LectureApplyHistory lectureApplyHistory);
    LectureApplyHistory findById(Long lectrueApplyId);
    List<LectureApplyHistory> findByUserId(Long userId);
}
