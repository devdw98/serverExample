package com.wtw.catfriendsServer.controller;

import com.wtw.catfriendsServer.service.QuestService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quest")
@RequiredArgsConstructor
public class QuestController { //일일과제
    /*
    사용자 연결하면 그에 따라 데이터 보내주는 것 설계해야함.
     */

    private QuestService questService;

    @ApiOperation(value = "일일과제 목록", notes = "일일과제 목록 출력")
    @GetMapping("/daily")
    public ResponseEntity<?> getDailyQuest(){

        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation(value = "업적 퀘스트 목록", notes = "업적 퀘스트 목록 출력")
    @GetMapping("/achievement")
    public ResponseEntity<?> getAchievementQuest(){

        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation(value = "보미 가이드라인 퀘스트", notes = "보미 가이드라인 퀘스트 목록 출력")
    @GetMapping("/bomi")
    public ResponseEntity<?> getBomiQuest(){

        return new ResponseEntity(HttpStatus.OK);
    }

}
