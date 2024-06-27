package com.project_special_lecture.project.special_lecture.controller;

import org.springframework.web.bind.annotation.*;

import com.project_special_lecture.project.special_lecture.domain.*;
import com.project_special_lecture.project.special_lecture.service.*;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/lectures") 
@RequiredArgsConstructor
public class SpecialLectureController {
     private final SpecialLectureService specialLectureService;


     @PostMapping("/apply")
     public LectureApplyHistoryDomain apply (
          @RequestBody String applyJson
     )
          {
               // try {
               //      LectureApplyHistoryDto apply = objectMapper.readValue(applyJson, LectureApplyHistoryDto.class);
               //      log.debug("/lecutres/apply controller");
               // return this.specialLectureService.applyLecture(apply.getUserId());
               //  } catch (JsonProcessingException e) {
               //      log.error("Error processing JSON: " + e.getMessage());
               //      return new LectureApplyHistoryDomain(0);
               //  }
               return new LectureApplyHistoryDomain(0);
          }
}
