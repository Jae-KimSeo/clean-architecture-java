package com.project_special_lecture.project.special_lecture.service;

import java.time.LocalDateTime;

public interface SpecialLectureService {
    Long applyLecture(Long lectureApplyId, Long userId, boolean applied, LocalDateTime appliedTime, LocalDateTime registeredTime);
}
  