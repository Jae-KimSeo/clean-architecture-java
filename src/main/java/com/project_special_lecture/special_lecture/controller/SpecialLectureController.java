package com.project_special_lecture.special_lecture.controller;

import com.project_special_lecture.special_lecture.service.*;
import com.project_special_lecture.special_lecture.domain.*;;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/lectures")
@RequiredArgsConstructor
public class SpecialLectureController {
     private SpecialLectureService specialLectureService;

     @GetMapping("/apply")
     public LectureApplyHistoryDomain apply (
          @RequestBody long userId
     )
          {
               return this.specialLectureService.applyLecture(userId);
          }
}
