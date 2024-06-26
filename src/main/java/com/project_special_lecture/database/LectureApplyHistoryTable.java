package com.project_special_lecture.database;

import com.project_special_lecture.special_lecture.entity.*;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
public class LectureApplyHistoryTable {
    private final List<LectureApplyHistory> table = new ArrayList<>();

    public LectureApplyHistory insert(long userId) {
        LectureApplyHistory lectureApplyHistory = new LectureApplyHistory(userId);
        table.add(lectureApplyHistory);
        return lectureApplyHistory;
    }
}
