package com.wtw.catfriendsServer.controller;

import com.wtw.catfriendsServer.service.QuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QuestController { //일일과제
    /*
    사용자 연결하면 그에 따라 데이터 보내주는 것 설계해야함.
     */

    private QuestService questService;

    public ResponseEntity<?> getDailyQuest(){

        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<?> getAchievementQuest(){

        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<?> getBomiQuest(){

        return new ResponseEntity(HttpStatus.OK);
    }

}
