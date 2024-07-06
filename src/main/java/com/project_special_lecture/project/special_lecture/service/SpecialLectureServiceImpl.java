package com.project_special_lecture.project.special_lecture.service;

import com.project_special_lecture.project.special_lecture.entity.*;
import com.project_special_lecture.project.special_lecture.domain.*;
import com.project_special_lecture.project.special_lecture.repository.*;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpecialLectureServiceImpl implements SpecialLectureService {
    private LectureApplyHistoryRepository lectureApplyHistoryRepository;
    
    public Long applyLecture(Long lectureApplyId, Long userId, boolean applied, LocalDateTime appliedTime, LocalDateTime registeredTime) {
        LectureApplyHistory lectureApplyHistory = new LectureApplyHistory(lectureApplyId, userId, applied, appliedTime, registeredTime);
        return this.lectureApplyHistoryRepository.create(lectureApplyHistory);
    }
}