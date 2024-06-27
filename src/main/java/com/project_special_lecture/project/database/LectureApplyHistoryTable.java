package com.project_special_lecture.project.database;

import com.project_special_lecture.project.special_lecture.entity.*;

import java.util.List;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LectureApplyHistoryTable {
    private final List<LectureApplyHistory> table = new ArrayList<>();

    public LectureApplyHistory insert(long userId) {
        LectureApplyHistory lectureApplyHistory = new LectureApplyHistory(userId);
        table.add(lectureApplyHistory);
        return lectureApplyHistory;
    }
}
