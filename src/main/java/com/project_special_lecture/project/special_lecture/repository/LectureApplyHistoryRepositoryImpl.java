package com.project_special_lecture.project.special_lecture.repository;

import com.project_special_lecture.project.database.*;
import com.project_special_lecture.project.special_lecture.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureApplyHistoryRepositoryImpl implements LectureApplyHistoryRepository {
    private LectureApplyHistoryTable lectureApplyHistoryTable;

    @Override
    public LectureApplyHistoryDomain save(long userId) {
        return lectureApplyHistoryTable.insert(userId).toDomain();
    }
}
