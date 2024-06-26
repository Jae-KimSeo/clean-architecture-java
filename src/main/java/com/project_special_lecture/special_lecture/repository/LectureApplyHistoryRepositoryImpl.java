package com.project_special_lecture.special_lecture.repository;

import com.project_special_lecture.special_lecture.domain.*;
import com.project_special_lecture.database.*;

public class LectureApplyHistoryRepositoryImpl implements LectureApplyHistoryRepository {
    private LectureApplyHistoryTable lectureApplyHistoryTable;

    @Override
    public LectureApplyHistoryDomain save(long userId) {
        return lectureApplyHistoryTable.insert(userId).toDomain();
    }
}
