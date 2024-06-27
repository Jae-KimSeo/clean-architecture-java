package com.project_special_lecture.project.special_lecture.repository;

import com.project_special_lecture.project.special_lecture.domain.*;

public interface LectureApplyHistoryRepository {
    LectureApplyHistoryDomain save(long userId);  
}
