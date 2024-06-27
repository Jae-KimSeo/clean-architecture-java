package com.project_special_lecture.project.special_lecture.service;

import com.project_special_lecture.project.special_lecture.domain.*;
import com.project_special_lecture.project.special_lecture.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpecialLectureServiceImpl implements SpecialLectureService {
    private LectureApplyHistoryRepository lectureApplyHistoryRepository;
    
    public LectureApplyHistoryDomain applyLecture(long userId) {
        return this.lectureApplyHistoryRepository.save(userId);
    }
}