package com.project_special_lecture.special_lecture.service;

import com.project_special_lecture.special_lecture.repository.*;
import com.project_special_lecture.special_lecture.domain.*;;

public class SpecialLectureServiceImpl implements SpecialLectureService {
    private LectureApplyHistoryRepository lectureApplyHistoryRepository;
    
    public LectureApplyHistoryDomain applyLecture(long userId) {
        return this.lectureApplyHistoryRepository.save(userId);
    }
}