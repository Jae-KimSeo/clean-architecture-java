package com.project_special_lecture.project.special_lecture.repository;

import com.project_special_lecture.project.database.*;
import com.project_special_lecture.project.special_lecture.domain.*;
import com.project_special_lecture.project.special_lecture.entity.*;
import com.project_special_lecture.project.special_lecture.repository.orm.*;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureApplyHistoryRepositoryImpl implements LectureApplyHistoryRepository {
    private LectureApplyHistoryJpaRepository lectureApplyHistoryJpaRepository;

    @Override
    public Long create(LectureApplyHistory lectureApplyHistory){
        lectureApplyHistoryJpaRepository.save(lectureApplyHistory);
        return lectureApplyHistory.getLectureApplyId();
    }

    @Override
    public LectureApplyHistory findById(Long lectureApplyId){
        LectureApplyHistory apply = lectureApplyHistoryJpaRepository.findById(lectureApplyId);
        return apply;
    }

    @Override
    public List<LectureApplyHistory> findByUserId(Long userId){

    }
}
